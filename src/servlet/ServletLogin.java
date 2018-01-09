package servlet;

import DBUtil.DBUtil;
import Dao.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ttc on 17-12-28.
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("ready");
        //手机号、身份证号、email
        String name=request.getParameter("email");

        String namebd=getname(name);
        String username=getusername(name);

        if(name.equals(namebd))
        {
            System.out.println(name);
            HttpSession hs = request.getSession();
            hs.setAttribute("name", username);
            hs.setAttribute("phone",name);

            response.sendRedirect("/page/Home.jsp");
        }
        else {
            response.sendRedirect("/page/login.jsp");
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       doPost(request,response);
    }

    public String getname(String name)
    {
        String name2="";
        Connection conn=DBUtil.connedDB();
        String sql="select USERPHONENUMBER from USERTABLE where USERPHONENUMBER=?";
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
               name2=rs.getString("USERPHONENUMBER");
                System.out.println(name2);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println(name2);
        return name2;
    }
    private String getusername(String name)
    {
        String username="";
        Connection conn=DBUtil.connedDB();
        String sql="select USERNAME from USERTABLE where USERPHONENUMBER=?";
        try
        {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                username=rs.getString("USERNAME");
                System.out.println(username);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return username;
    }
}
