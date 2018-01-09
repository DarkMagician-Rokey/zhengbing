package servlet;

import DBUtil.DBUtil;
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

/**
 * Created by ttc on 18-1-5.
 */
@WebServlet("/Servletusername")
public class Servletusername extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String password=request.getParameter("password");
        String name=request.getParameter("name");

        try
        {
            Connection conn=DBUtil.connedDB();

            String sql="select * from usertable where UserLicenseNumber=? and UserName=?";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,password);
            ps.setString(2,name);

            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                HttpSession hs = request.getSession();

                hs.setAttribute("userpassword", password);

                //��ת�������û���ҳ��
                response.sendRedirect("/page/Retrievechongyong.jsp");
            }
            else
            {
                HttpSession hs = request.getSession();

                hs.setAttribute("userpassword", "�û���Ϣ������");

                //��ת���һ��û�ҳ��
                response.sendRedirect("/page/Retrieveusername.jsp");
            }

            DBUtil.releaseDB(ps,rs);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }
}
