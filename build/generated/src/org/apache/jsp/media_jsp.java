package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class media_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/media.css\" type=\"text/css\"/>\r\n");
      out.write("    <title>Kestik</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/media.js\"></script>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <h2>Media Slider Carousel BS3</h2>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class='row'>\r\n");
      out.write("    <div class='col-md-8'>\r\n");
      out.write("      <div class=\"carousel slide media-carousel\" id=\"media\">\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("          <div class=\"item  active\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>          \r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>        \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"item\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>          \r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>        \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"item\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>          \r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <a class=\"thumbnail\" href=\"#\"><img alt=\"\" src=\"http://placehold.it/150x150\"></a>\r\n");
      out.write("              </div>      \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <a data-slide=\"prev\" href=\"#media\" class=\"left carousel-control\">‹</a>\r\n");
      out.write("        <a data-slide=\"next\" href=\"#media\" class=\"right carousel-control\">›</a>\r\n");
      out.write("      </div>                          \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
