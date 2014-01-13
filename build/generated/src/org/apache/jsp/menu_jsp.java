package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/indexmenucss.css\"/>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/indexanacss.css\"/>\r\n");
      out.write("    <title>Kestik</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script src=\"js/indexanajs.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("     <img src=\"image/serit.gif\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("     <img src=\"image/seritust.png\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("     <img src=\"image/seritalt.png\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("</div>\r\n");
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
      out.write("      <li class='has-sub'><a href='#'><span>Aşk</span></a>\r\n");
      out.write("         </li>\r\n");
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
