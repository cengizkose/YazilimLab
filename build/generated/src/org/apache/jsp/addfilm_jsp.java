package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addfilm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t <form class=\"form-horizontal\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("                <!-- Address form -->\r\n");
      out.write("         \r\n");
      out.write("                <h2>Film Bilgileri</h2>\r\n");
      out.write("         \r\n");
      out.write("                <!-- full-name input-->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Name</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmname\" name=\"filmname\" type=\"text\" placeholder=\"xxxxx\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                        <p class=\"help-block\"></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- address-line1 input-->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Oyuncusu 1</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmoyuncu1\" name=\"filmoyuncu1\" type=\"text\" placeholder=\"oyuncu gir\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Oyuncusu 2</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmoyuncu2\" name=\"filmoyuncu2\" type=\"text\" placeholder=\"oyuncu gir\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Oyuncusu 3</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmoyuncu3\" name=\"filmoyuncu3\" type=\"text\" placeholder=\"oyuncu gir\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Oyuncusu 4</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmoyuncu4\" name=\"filmoyuncu4\" type=\"text\" placeholder=\"oyuncu gir\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Oyuncusu 5</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"filmoyuncu5\" name=\"filmoyuncu5\" type=\"text\" placeholder=\"oyuncu gir\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- city input-->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">City / Town</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"city\" name=\"city\" type=\"text\" placeholder=\"city\" class=\"input-xlarge\">\r\n");
      out.write("                        <p class=\"help-block\"></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- region input-->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">State / Province / Region</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"region\" name=\"region\" type=\"text\" placeholder=\"state / province / region\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                        <p class=\"help-block\"></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- postal-code input-->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Zip / Postal Code</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <input id=\"postal-code\" name=\"postal-code\" type=\"text\" placeholder=\"zip or postal code\"\r\n");
      out.write("                        class=\"input-xlarge\">\r\n");
      out.write("                        <p class=\"help-block\"></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- country select -->\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    <label class=\"control-label\">Film Türü</label>\r\n");
      out.write("                    <div class=\"controls\">\r\n");
      out.write("                        <select id=\"tur\" name=\"tur\" class=\"input-xlarge\">\r\n");
      out.write("                            \r\n");
      out.write("                            <option value=\"TO\">Komedi</option>\r\n");
      out.write("                            <option value=\"TT\">Dram</option>\r\n");
      out.write("                            <option value=\"TR\">Macera</option>\r\n");
      out.write("                            <option value=\"TM\">Aksiyon</option>\r\n");
      out.write("                         \r\n");
      out.write("                  \r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("        </form>\r\n");
      out.write("\t</div>\r\n");
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
