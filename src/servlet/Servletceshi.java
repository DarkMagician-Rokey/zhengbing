package servlet;

import DBUtil.DBUtil;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ttc on 18-1-5.
 */
@WebServlet("/Servletceshi")
public class Servletceshi extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String Phonenumber=request.getParameter("newPhonenumber");

        System.out.println(Phonenumber);

        try
        {
            Connection conn = DBUtil.connedDB();

            String sql = "select * from  USERTABLE where userphonenumber= ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,Phonenumber);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                response.getWriter().write("用户已存在");
            }else
            {
                response.getWriter().write("√");
            }
            DBUtil.releaseDB(ps,rs);
        }  catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }
}
