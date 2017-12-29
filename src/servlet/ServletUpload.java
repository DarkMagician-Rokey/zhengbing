package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

/**
 * Created by ttc on 17-12-29.
 */
@WebServlet("/ServletUpload")
public class ServletUpload extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //头像上传
        Part part=request.getPart("file");
        String filename=part.getSubmittedFileName();
        String filepath=request.getServletContext().getRealPath("img");
        String fullpath=filepath+ File.separator+filename;
        part.write(fullpath);
        response.getWriter().write("/img/"+filename);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }
}
