package servlet;

import DBUtil.DBUtil;
import Dao.User;
import jdk.nashorn.internal.ir.RuntimeNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static DBUtil.DBUtil.connedDB;

/**
 * Created by ttc on 17-12-27.
 */
@WebServlet("/ServletRegistered")
//�ͻ���ע�����
public class ServletRegistered extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        User u=new User();
        //��ҳ���ȡע����Ϣ
        u.setUserPhoneNumber(request.getParameter("Phonenumber"));

        u.setUserPassword(request.getParameter("Password"));
        u.setUserName(request.getParameter("name"));
        u.setUserTypeOfCertificate(request.getParameter("Typeofcertificate"));
        u.setUserLicenseNumber(request.getParameter("LicenseNumber"));
        u.setUserMailbox(request.getParameter("Mailbox"));
        u.setUserSecurityQuestion1(request.getParameter("UserSecurityQuestion1"));
        u.setUserAnswer1(request.getParameter("Answer1"));
        u.setUserSecurityQuestion2(request.getParameter("UserSecurityQuestion2"));
        u.setUserAnswer2(request.getParameter("Answer2"));
        u.setUserSecurityQuestion3(request.getParameter("UserSecurityQuestion3"));
        u.setUserAnswer3(request.getParameter("Answer3"));
        u.setUserPhotoUrl(request.getParameter("zhaopian"));
        u.setUserSex(request.getParameter("sex"));


        //���û����ݷŵ����ݿ���
        if(setUserFromDB(u))
        {
            HttpSession hs = request.getSession();

            hs.setAttribute("name", u.getUserName());
            hs.setAttribute("phone",u.getUserPhoneNumber());

            //��ת����¼ҳ��
            response.sendRedirect("/page/Home.jsp");

        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }


    public boolean setUserFromDB(User u)
    {
        try
        {
            Connection conn=DBUtil.connedDB();

            String sql="INSERT INTO usertable VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,u.getUserPhoneNumber());
            ps.setString(2,u.getUserPassword());
            ps.setString(3,u.getUserName());
            ps.setString(4,u.getUserSex());
            ps.setString(5,u.getUserTypeOfCertificate());
            ps.setString(6,u.getUserLicenseNumber());
            ps.setString(7,u.getUserMailbox());
            ps.setString(8,u.getUserSecurityQuestion1());
            ps.setString(9,u.getUserAnswer1());
            ps.setString(10,u.getUserSecurityQuestion2());
            ps.setString(11,u.getUserAnswer2());
            ps.setString(12,u.getUserSecurityQuestion3());
            ps.setString(13,u.getUserAnswer3());
            ps.setString(14,u.getUserPhotoUrl());
            int r=ps.executeUpdate();

            if(r>0){
                return true;
            }
            DBUtil.releaseDB(ps);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
