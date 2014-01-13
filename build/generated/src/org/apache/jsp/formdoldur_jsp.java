package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class formdoldur_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"button2.css\"> \r\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        div.tablo{\r\n");
      out.write("            width:800px;\r\n");
      out.write("            height:230px;\r\n");
      out.write("            margin:20px 0px 0px 300px;\r\n");
      out.write("            border:1px solid black; \r\n");
      out.write("            background-color:#ffffff;\r\n");
      out.write("        }\r\n");
      out.write("         div.tablo1{\r\n");
      out.write("            width:350px;\r\n");
      out.write("            height:50px;\r\n");
      out.write("            margin:-150px 0px 0px 300px;\r\n");
      out.write("            border:px solid black; \r\n");
      out.write("            background-color:#ffffff;\r\n");
      out.write("        }\r\n");
      out.write("         div.resim{\r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("            display:block;\r\n");
      out.write("            width:227px;\r\n");
      out.write("            height:227px; \r\n");
      out.write("            background-image:url(image/tik.jpg);\r\n");
      out.write("            background-repeat:none;    \r\n");
      out.write("            margin:0px 0px 0px 0px;\r\n");
      out.write("            border:1px solid white;\r\n");
      out.write("        }\r\n");
      out.write("        div.resim:hover{\r\n");
      out.write("            background-image:url(image/tik.jpg);\r\n");
      out.write("            background-repeat:none; \r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/indexmenucss.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/indexanacss.css\"/>\r\n");
      out.write("    <title>Kestik</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        div {\r\n");
      out.write("    background-color: #E5E5E5;\r\n");
      out.write("        }\r\n");
      out.write("        div.arama {\r\n");
      out.write("            height: 28px;\r\n");
      out.write("            width: 223px;\r\n");
      out.write("            margin: -40px 0px 0px 1100px;\r\n");
      out.write("            padding: 0px auto;\r\n");
      out.write("            border:0px solid #000;\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div id='cssmenu'>\r\n");
      out.write("<ul>\r\n");
      out.write("   <li class='active'><a href='index.jsp'><span><b>Anasayfa</b></span></a></li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span><b>Türler</b></span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li class='has-sub'><a href='filmler/Dram.jsp'><span>Dram</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("         <li class='has-sub'><a href='filmler/Macera.jsp'><span>Macera</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("          <li class='has-sub'><a href='filmler/Fantastik.jsp'><span>Fantastik</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("          <li class='has-sub'><a href='filmler/Aksiyon.jsp'><span>Aksiyon</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("          <li class='has-sub'><a href='filmler/Komedi.jsp'><span>Komedi</span></a>\r\n");
      out.write("         </li>\r\n");
      out.write("      \r\n");
      out.write("          \r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li><a href='form.jsp'><span><b>Film Ekle</b></span></a></li>\r\n");
      out.write("   <li>\r\n");
      out.write("       <div class=\"arama\">\r\n");
      out.write("       <form action=\"filmGetir.jsp\">\r\n");
      out.write("               <input type=\"text\" id=\"filmadi\" name=\"filmAdi\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("               <input type=\"submit\" name=\"ara\" id=\"ara\" value=\"Ara\" />\r\n");
      out.write("            </form>\r\n");
      out.write("       </div>\r\n");
      out.write("   </li>\r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8");
 
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/film?useUnicode=true&characterEncoding=UTF-8";
Connection con = null;
 
try {
 
Class.forName(driver);
 
} catch (Exception e) {
 
System.exit(0);
}
try {
con = DriverManager.getConnection(url, "root", "123456789");
 
} catch (Exception e) {
System.out.println("Mysql Bilgisi : Bağlantı Kurulamadı" + e + "");
System.exit(0);
}
 

      out.write("\r\n");
      out.write("\r\n");

request.setCharacterEncoding("UTF-8");

String filmAdi = request.getParameter("filmAdi");
String yonetmen = request.getParameter("yonetmen");
String oyuncu1 = request.getParameter("oyuncu1");
String oyuncu2 = request.getParameter("oyuncu2");
String oyuncu3 = request.getParameter("oyuncu3");
String oyuncu4 = request.getParameter("oyuncu4");
String oyuncu5 = request.getParameter("oyuncu5");
String oyuncu6 = request.getParameter("oyuncu6");
String turu = request.getParameter("turu");
String puan = request.getParameter("puan");


      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("utf-8");
Statement stmt = con.createStatement();
 
stmt.executeUpdate("insert into filmler " + "values('"+filmAdi+"','"+yonetmen+"','"+oyuncu1+"','"+oyuncu2+"','"+oyuncu3+"','"+oyuncu4+"','"+oyuncu5+"','"+oyuncu6+"','"+turu+"','"+puan+"')");
 
      


      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"tablo\">\r\n");
      out.write("<div class=\"resim\">\r\n");
      out.write("                       <p><img scr=\"image/tik.\"/></p>\r\n");
      out.write("                   </div>\r\n");
      out.write("    <div class=\"tablo1\">\r\n");
      out.write("    <font size=\"5\"> Film Başarıyla yuklenmiştir.</font>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
