package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class asFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\" type=\"text/css\"/>\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"products\" class=\"row list-group\">\r\n");
      out.write("     \r\n");
      out.write("         <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("               <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Zorolum.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Zor Ölüm</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Zor Ölüm, 1988 ABD yapımı gerilim aksiyon filmidir.\r\n");
      out.write("Özgün adı Die Hard olan film, John McTiernan tarafından yönetilmiştir\r\n");
      out.write("Yönetmen: John McTiernan </p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                       <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb:8.3</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Zorolum.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Baba2.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                            Baba II</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Baba II, ilk filmin yapımından iki sene sonra çekilen film. \r\n");
      out.write("Mario Puzo ve Francis Ford Coppola'nın ortak yazdığı \r\n");
      out.write("senaryoyla kurgulanmıştır. </p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                       <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb:9.1</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Baba2.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("               <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/YuzuklerinEfendisi3.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Yuzuklerin Efendisi3</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Yüzüklerin Efendisi: Kralın Dönüşü, Peter Jackson'ın yönetmenliğini yaptığı, \r\n");
      out.write("J. R. R. Tolkien'in Yüzüklerin Efendisi kitaplarının ikinci ve üçüncü bölümlerinden \r\n");
      out.write("uyarlanmıştır.\r\n");
      out.write("</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                       <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb:8.9</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/YuzuklerinEfendisi3.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Baba3.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Baba 3</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Baba III, Baba üçlemesinin son filmidir. 1990 yılında gösterime girmiştir\r\n");
      out.write("Yayın tarihi: 20 Aralık 1990\r\n");
      out.write("Yönetmen: Francis Ford Coppola</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 7.6</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Baba3.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("               <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/YuzuklerinEfendisi.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Yuzuklerin Efendisi</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Yüzüklerin Efendisi: Yüzük Kardeşliği, Peter Jackson'un yönettiği Yüzüklerin Efendisi üçlemesinin birinci filmidir\r\n");
      out.write(" ve 2001 yılında gösterime girmiştir. J. R. R.</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                       <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 8.8</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/YuzuklerinEfendisi.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("            <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("             <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Cehennemsilahi.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Cehennem Silahı</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">         \r\n");
      out.write("                    Cehennem Silahı, yönetmenliğini Richard Donner'ın yaptığı 1987 yılı yapımı aksiyon filmi. \r\n");
      out.write("                       Ayrıca filmin başarısının üstüne çekilen üç devam filminin başlangıçı. </p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 7.6</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Cehennemsilahi.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/YuzuklerinEfendisi2.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Yuzuklerin Efendisi2</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                         Filmde, Frodo ve Sam'in yüzüğü yoketmek için Mordor'a giderken, Gollum ile tanışmaları,\r\n");
      out.write(" Aragorn, Legolas, ve Gimli'nin  Rohan'ı savunmaya gitmesi</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 8.8</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/YuzuklerinEfendisi.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("           <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Baba.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Baba </h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Baba, Mario Puzo'nun yazdığı aynı adlı romandan uyarlanan, Francis Ford Coppola'nın yönettiği,\r\n");
      out.write(" Marlon Brando ve Al Pacino'nun oynadığı filmdir.</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 9.2</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Baba.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("          <div class=\"item  col-xs-4 col-lg-4\">\r\n");
      out.write("            <div class=\"thumbnail\">\r\n");
      out.write("                <div class=\"col-sm-8 col-md-6\">\r\n");
      out.write("                        <img src=\"image/Thor.jpg\" alt=\"\" class=\"img-rounded img-responsive\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"caption\">\r\n");
      out.write("                    <h4 class=\"group inner list-group-item-heading\">\r\n");
      out.write("                        Thor</h4>\r\n");
      out.write("                    <p class=\"group inner list-group-item-text\">\r\n");
      out.write("                        Thor, Marvel Comics tarafından yayımlanan aynı adlı çizgi roman karakterine dayanan \r\n");
      out.write(" süper kahraman filmi ve Marvel Cinematic Universe tarafından yayınlanmıstır </p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <p class=\"lead\">\r\n");
      out.write("                                İmdb: 7.0</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-md-6\">\r\n");
      out.write("                            <a class=\"btn btn-success\" href=\"filmler/Thor.jsp\">İncele</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
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
