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
 * Created by ttc on 18-1-4.
 */
@WebServlet("/Servletpassword")
public class Servletpassword extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String password=request.getParameter("password");

        try
        {
            Connection conn=DBUtil.connedDB();

            String sql="select * from usertable where userphonenumber=?";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(1,password);

            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                HttpSession hs = request.getSession();

                hs.setAttribute("userpassword", password);

                //��ת����������ҳ��
                response.sendRedirect("/page/Retrievechongmima.jsp");
            }
            else
            {
                HttpSession hs = request.getSession();

                hs.setAttribute("userpassword", "�û���Ϣ������");

                //��ת���һ�����ҳ��
                response.sendRedirect("/page/Retrievepassword.jsp");
            }

            DBUtil.releaseDB(ps,rs);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
