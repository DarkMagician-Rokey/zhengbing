package servlet;

import DBUtil.DBUtil;
import Dao.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by ttc on 17-12-28.
 */
@WebServlet("/ServletEdit")
public class ServletEdit extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {


        //编辑个人资料
        String name = request.getParameter("");

        User u = getEidt(name);

        String UserPhoneNumber = u.getUserPhoneNumber();
        String UserPassword = u.getUserPassword();
        String UserName = u.getUserName();
        String UserSex = u.getUserSex();
        String UserTypeOfCertificate = u.getUserTypeOfCertificate();
        String UserLicenseNumber = u.getUserLicenseNumber();
        String UserMailbox = u.getUserMailbox();
        String UserSecurityQuestion1 = u.getUserSecurityQuestion1();
        String UserAnswer1 = u.getUserAnswer1();
        String UserSecurityQuestion2 = u.getUserSecurityQuestion2();
        String UserAnswer2 = u.getUserAnswer2();
        String UserSecurityQuestion3 = u.getUserSecurityQuestion3();
        String UserAnswer3 = u.getUserAnswer3();
        String UserPhotoUrl=u.getUserPhotoUrl();


        //session
        HttpSession hs = request.getSession();
        hs.setAttribute("UserPhoneNumber", UserPhoneNumber);
        hs.setAttribute("UserPassword", UserPassword);
        hs.setAttribute("UserName", UserName);
        hs.setAttribute("UserSex", UserSex);
        hs.setAttribute("UserTypeOfCertificate", UserTypeOfCertificate);
        hs.setAttribute("UserLicenseNumber", UserLicenseNumber);
        hs.setAttribute("UserMailbox", UserMailbox);
        hs.setAttribute("UserSecurityQuestion1", UserSecurityQuestion1);
        hs.setAttribute("UserAnswer1", UserAnswer1);
        hs.setAttribute("UserSecurityQuestion2", UserSecurityQuestion2);
        hs.setAttribute("UserAnswer2", UserAnswer2);
        hs.setAttribute("UserSecurityQuestion3", UserSecurityQuestion3);
        hs.setAttribute("UserAnswer3", UserAnswer3);
        hs.setAttribute("UserPhotoUrl",UserPhotoUrl);


        response.sendRedirect("/page/register.jsp");

    }

    private User getEidt(String name)
    {
        User u = new User();
        Connection conn = DBUtil.connedDB();
        String sql = "SELECT * FROM USERTABLE WHERE NAME = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                u.setUserPhoneNumber(rs.getString("USERPHONENUMBER"));
                u.setUserPassword(rs.getString("USERPASSWORD"));
                u.setUserName(rs.getString("USERNAME"));
                u.setUserSex(rs.getString("USERSEX"));
                u.setUserTypeOfCertificate(rs.getString("USERTYPEOFCERTIFICATE"));
                u.setUserLicenseNumber(rs.getString("USERLICENSENUMBER"));
                u.setUserMailbox(rs.getString("USERMAILBOX"));
                u.setUserSecurityQuestion1(rs.getString("USERSECURITYQUESTION1"));
                u.setUserAnswer1(rs.getString("USERANSWER1"));
                u.setUserSecurityQuestion2(rs.getString("USERSECURITYQUESTION2"));
                u.setUserAnswer2(rs.getString("USERANSWER2"));
                u.setUserSecurityQuestion3(rs.getString("USERANSWER2"));
                u.setUserAnswer3(rs.getString("USERANSWER3"));
                u.setUserPhotoUrl(rs.getString("USERPHOTOURL"));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return u;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
