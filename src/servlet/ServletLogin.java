package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ttc on 17-12-28.
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //手机号、身份证号、email
        String name=request.getParameter("");

        HttpSession hs=request.getSession();
        hs.setAttribute("name",name);

        response.sendRedirect("/page/Home.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       doPost(request,response);
    }
}
