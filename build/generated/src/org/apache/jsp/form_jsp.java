package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap-theme.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap-theme.css\" type=\"text/css\"/>\r\n");
      out.write("            \r\n");
      out.write("    <title>Kestik</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        div {\r\n");
      out.write("    background-color: #E5E5E5;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("        <div class=\"container\" >\r\n");
      out.write("\t<div class=\"row-fluid\" >\r\n");
      out.write("      <form class=\"form-horizontal\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("          <div id=\"legend\">\r\n");
      out.write("            <legend class=\"\">Bilgiler</legend>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("          <!-- Name -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >Film Adı</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"filmadi\" name=\"filmadi\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("          <!-- Card Number -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\" >Yönetmen Adı</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"yonetmen\" name=\"yonetmen\" placeholder=\"\" class=\"input-xlarge\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("          <table >\r\n");
      out.write("        \r\n");
      out.write("      <tr>\r\n");
      out.write("          <td><div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >1.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"1oyuncu\" name=\"1oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("           <!-- CVV -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >2.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"2oyuncu\" name=\"2oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("                     <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >3.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"3oyuncu\" name=\"3oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("              \r\n");
      out.write("              </td>\r\n");
      out.write("              <td> <br>\r\n");
      out.write("                  <img src=\"image/film.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("              </td>\r\n");
      out.write("          <td><div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >4.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"4oyuncu\" name=\"4oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("           <!-- CVV -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >5.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"5oyuncu\" name=\"5oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("                     <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >6.Oyuncu</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"6oyuncu\" name=\"6oyuncu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("              \r\n");
      out.write("          </td>\r\n");
      out.write("       \r\n");
      out.write("      </tr>   \r\n");
      out.write("    </table>\r\n");
      out.write("          \r\n");
      out.write("          <br>\r\n");
      out.write("          <!-- CVV -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >Türü</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"turu\" name=\"turu\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("           \r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >Süresi</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"sure\" name=\"sure\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("                     <div class=\"control-group\">\r\n");
      out.write("            <label class=\"control-label\"  >Puanı</label>\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <input type=\"text\" id=\"puan\" name=\"puan\" placeholder=\"\" class=\"span2\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("          \r\n");
      out.write("     \r\n");
      out.write("          <!-- Submit -->\r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("            <div class=\"controls\">\r\n");
      out.write("              <button class=\"btn btn-success\">kaydet</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("     \r\n");
      out.write("        </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("        </div> </center>\r\n");
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
