package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * Created by ttc on 18-1-2.
 */
@WebServlet("/ServletZhaobian")
@MultipartConfig
public class ServletZhaobian extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Part part=request.getPart("file");
        String filename=part.getSubmittedFileName();
        String filepath=request.getServletContext().getRealPath("images");
        String fullpath=filepath+ File.separator+filename;

        part.write(fullpath);

        response.getWriter().write("/images/"+filename);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }
}
