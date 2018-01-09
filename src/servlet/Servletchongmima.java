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
@WebServlet("/Servletchongmima")
public class Servletchongmima extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String password=request.getParameter("userpassword");
        String phone=request.getParameter("password");

        try
        {
            Connection conn=DBUtil.connedDB();

            String sql="UPDATE usertable \n" +
                    "SET userpassword = ?\n" +
                    "WHERE userphonenumber = ?";

            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setString(2,password);
            ps.setString(1,phone);
            int r=ps.executeUpdate();

            if(r>0)
            {
                HttpSession hs = request.getSession();

                hs.setAttribute("userpassword", "修改成功");

                //��ת����ҳ
                response.sendRedirect("/page/login.jsp");
            }
            DBUtil.releaseDB(ps);
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
