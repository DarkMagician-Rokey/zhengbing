package servlet;

import DBUtil.DBUtil;
import Dao.MaterialTable_laws;

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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttc on 17-12-28.
 */
@WebServlet("/ServletDengji")
public class ServletDengji extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<MaterialTable_laws> li_laws = getLaws();

        HttpSession hs = request.getSession();
        hs.setAttribute("fagui", li_laws);

        response.sendRedirect("/page/dengji.jsp");
    }

    public List<MaterialTable_laws> getLaws()
    {
        List<MaterialTable_laws> li = new ArrayList();
        Connection conn = DBUtil.connedDB();
        String sql = "select MATERIALNAME,IMAGELINK from MATERIALTABLE";
        try
        {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                MaterialTable_laws m = new MaterialTable_laws();
                m.setMaterialName(rs.getString("MATERIALNAME"));
                m.setImageLink(rs.getString("IMAGELINK"));
                li.add(m);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }

        return li;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request,response);
    }
}
