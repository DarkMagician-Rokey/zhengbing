//package servlet;
//
//import DBUtil.DBUtil;
//import Dao.MaterialTable_laws;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by ttc on 17-12-29.
// */
//@WebServlet("/ServletToFagui")
//public class ServletToFagui extends HttpServlet
//{
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//    {
//        String title=request.getParameter("law");
//
//        System.out.println(title);
//
//        List<MaterialTable_laws> li_laws = getLaws(title);
//
//        MaterialTable_laws[] arr=new MaterialTable_laws[3];
//
//        for (int i=0;i<li_laws.size();i++){
//             arr[i] =li_laws.get(i);
//        }
//
//        String materiallink=arr[0].getMaterialLink();
//        String aterialdate=arr[1].getMaterialDate();
//        String materialsource=arr[3].getMaterialSource();
//
//        HttpSession hs = request.getSession();
//
//        hs.setAttribute("title",title);
//        hs.setAttribute("materiallink",materiallink);
//        hs.setAttribute("aterialdate",aterialdate);
//        hs.setAttribute("materialsource",materialsource);
//
//
////        response.sendRedirect("/page/");
//
//    }
//
//    public List<MaterialTable_laws> getLaws(String title)
//    {
//        System.out.println("DB");
//        List<MaterialTable_laws> li = new ArrayList();
//        Connection conn = DBUtil.connedDB();
//        String sql = "select MATERIALLINK,MATERIALDATE,MATERIALSOURCE from MATERIALTABLE where MATERIALNAME=?";
//        try
//        {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1,title);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next())
//            {
//                MaterialTable_laws m = new MaterialTable_laws();
//                m.setMaterialLink(rs.getString("MATERIALLINK"));
//                m.setMaterialDate(rs.getString("MATERIALDATE"));
//                m.setMaterialSource(rs.getString("MATERIALSOURCE"));
//                li.add(m);
//            }
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        }
//
//        System.out.println("get");
//        return li;
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//    {
//       doPost(request,response);
//    }
//}
