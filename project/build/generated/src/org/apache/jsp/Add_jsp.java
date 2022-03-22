package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>DaiAn Shop | Product Detail</title>\n");
      out.write("    \n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">   \n");
      out.write("    <!-- SmartMenus jQuery Bootstrap Addon CSS -->\n");
      out.write("    <link href=\"css/jquery.smartmenus.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Product view slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.simpleLens.css\">    \n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n");
      out.write("    <!-- price picker slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/nouislider.css\">\n");
      out.write("    <!-- Theme color -->\n");
      out.write("    <link id=\"switcher\" href=\"css/theme-color/default-theme.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Top Slider CSS -->\n");
      out.write("    <link href=\"css/sequence-theme.modern-slide-in.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main style sheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">    \n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  \n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>  \n");
      out.write("    <!-- wpf loader Two -->\n");
      out.write("    <div id=\"wpf-loader-two\">          \n");
      out.write("      <div class=\"wpf-loader-two-inner\">\n");
      out.write("        <span>Loading</span>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- / wpf loader Two -->       \n");
      out.write("    <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("    <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("  <!-- Start header section -->\n");
      out.write("  <header id=\"aa-header\">\n");
      out.write("    <!-- start header top  -->\n");
      out.write("    <div class=\"aa-header-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"aa-header-top-area\">\n");
      out.write("              <!-- start header top left -->\n");
      out.write("              <div class=\"aa-header-top-left\">\n");
      out.write("               \n");
      out.write("                <!-- start cellphone -->\n");
      out.write("                <div class=\"cellphone hidden-xs\">\n");
      out.write("                  <p><span class=\"fa fa-phone\"></span>: 0915301665 - 0915300970 - 0942560232</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- / cellphone -->\n");
      out.write("              </div>\n");
      out.write("              <!-- / header top left -->\n");
      out.write("              <div class=\"aa-header-top-right\">\n");
      out.write("                <ul class=\"aa-head-top-nav-right\">\n");
      out.write("                  <li><a href=\"account.html\">Đăng ký</a></li>\n");
      out.write("                  <li><a href=\"\" data-toggle=\"modal\" data-target=\"#login-modal\">Đăng nhập</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- / header top  -->\n");
      out.write("\n");
      out.write("    <!-- start header bottom  -->\n");
      out.write("    <div class=\"aa-header-bottom\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"aa-header-bottom-area\">\n");
      out.write("              <!-- logo  -->\n");
      out.write("              <div class=\"aa-logo\">\n");
      out.write("                <!-- Text based logo -->\n");
      out.write("                <!-- img based logo -->\n");
      out.write("                 <a href=\"index.html\"><img src=\"img/logo.jpg\" alt=\"logo img\" width=280px height=100px></a> \n");
      out.write("              </div>\n");
      out.write("              <!-- / logo  -->\n");
      out.write("              \n");
      out.write("              <!-- search box -->\n");
      out.write("              <div class=\"aa-search-box\">\n");
      out.write("                <form action=\"\">\n");
      out.write("                  <input type=\"text\" name=\"\" id=\"\" placeholder=\"Search here\">\n");
      out.write("                  <button type=\"submit\"><span class=\"fa fa-search\"></span></button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("              <!-- / search box -->             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- / header bottom  -->\n");
      out.write("  </header>\n");
      out.write("  <!-- / header section -->\n");
      out.write("  <!-- menu -->\n");
      out.write("  <section id=\"menu\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"menu-area\">\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>          \n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <!-- Left nav -->\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"#\">Hương nén <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"#\">Hương thảo mộc  <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"#\">Hương nén</a></li>\n");
      out.write("                      <li><a href=\"#\">Hương sào</a></li>\n");
      out.write("                      <li><a href=\"#\">Hương vòng</a></li>                                      \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  <li><a href=\"#\">Hương trầm  <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                       <li><a href=\"#\">Hương nén</a></li>\n");
      out.write("                      <li><a href=\"#\">Hương sào</a></li>\n");
      out.write("                      <li><a href=\"#\">Hương vòng</a></li>                                      \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              <li><a href=\"#\">Trầm nụ <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">  \n");
      out.write("                  <li><a href=\"#\">Nụ thảo mộc</a></li>                                                                \n");
      out.write("                  <li><a href=\"#\">Nụ trầm <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"#\">Trầm khói</a></li>\n");
      out.write("                      <li><a href=\"#\">Trầm thơm</a></li>                  \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              <li><a href=\"#\">Trà trầm </a></li>\n");
      out.write("              \n");
      out.write("              <li><a href=\"#\">Trầm thiền <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"#\">Bộ trầm thiền</a></li>\n");
      out.write("                  <li><a href=\"#\">Ống hương thiền </a></li>               \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              <li><a href=\"#\">Bút trầm </a></li>   \n");
      out.write("              \n");
      out.write("              <li><a href=\"blog-archive-2.html\">Blog</a></li>\n");
      out.write("              \n");
      out.write("              <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>       \n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </section>\n");
      out.write("  <!-- / menu -->  \n");
      out.write(" \n");
      out.write("  <!-- catg header banner section -->\n");
      out.write("  <section id=\"aa-catg-head-banner\">\n");
      out.write("   <img src=\"img/fashion/image2.jpg\" alt=\"fashion img\">\n");
      out.write("  </section>\n");
      out.write("  <!-- / catg header banner section -->\n");
      out.write("\n");
      out.write("  <!-- ? -->\n");
      out.write("  <center><h2>Thêm sản phẩm vào shop</h2></center>\n");
      out.write("<form>  \n");
      out.write("   <table class=\"table\">\n");
      out.write("       <tr>\n");
      out.write("            <td>ID</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"number\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td scope=\"col\">Name</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td scope=\"col\">Price</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"number\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td scope=\"col\">Image</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"text\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td scope=\"col\">SL</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"number\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td scope=\"col\">Category(1-5)</td>\n");
      out.write("            <td>\n");
      out.write("                <input type=\"number\" name=\"id\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td><button type=\"submit\"  scope=\"col\">Add student</button></td>\n");
      out.write("        </tr>\n");
      out.write("   </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- ? -->\n");
      out.write("\n");
      out.write("  <!-- footer -->  \n");
      out.write("  <footer id=\"aa-footer\">\n");
      out.write("    <!-- footer bottom -->\n");
      out.write("    <div class=\"aa-footer-top\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-footer-top-area\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <h3>Main Menu</h3>\n");
      out.write("                  <ul class=\"aa-footer-nav\">\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"blog-archive-2.html\">Blog</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>       </h3>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>Contact Us</h3>\n");
      out.write("                    <address>\n");
      out.write("                      <p> 88 Văn Cao, TP Nam Định</p>\n");
      out.write("                      <p><span class=\"fa fa-phone\"></span>0915301665 - 0915300970 - 0942560232</p>\n");
      out.write("                      <p><span class=\"fa fa-envelope\"></span>dai2452001@gmail.com</p>\n");
      out.write("                    </address>\n");
      out.write("                    <div class=\"aa-footer-social\">\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   <!-- Login Modal -->  \n");
      out.write("  <div class=\"modal fade\" id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">                      \n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("          <h4>Đăng nhập</h4>\n");
      out.write("          <form class=\"aa-login-form\" action=\"\">\n");
      out.write("            <label for=\"\">Username or Email address<span>*</span></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Username or email\">\n");
      out.write("            <label for=\"\">Password<span>*</span></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("            <button class=\"aa-browse-btn\" type=\"submit\">Login</button>\n");
      out.write("            <label for=\"rememberme\" class=\"rememberme\"><input type=\"checkbox\" id=\"rememberme\"> Remember me </label>\n");
      out.write("            <p class=\"aa-lost-password\"><a href=\"#\">Lost your password?</a></p>\n");
      out.write("            <div class=\"aa-register-now\">\n");
      out.write("              Don't have an account?<a href=\"account.html\">Đăng ký ngay!</a>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>                        \n");
      out.write("      </div><!-- /.modal-content -->\n");
      out.write("    </div><!-- /.modal-dialog -->\n");
      out.write("  </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  <!-- jQuery library -->\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>  \n");
      out.write("  <!-- SmartMenus jQuery plugin -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.smartmenus.js\"></script>\n");
      out.write("  <!-- SmartMenus jQuery Bootstrap Addon -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.smartmenus.bootstrap.js\"></script>  \n");
      out.write("  <!-- To Slider JS -->\n");
      out.write("  <script src=\"js/sequence.js\"></script>\n");
      out.write("  <script src=\"js/sequence-theme.modern-slide-in.js\"></script>  \n");
      out.write("  <!-- Product view slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.simpleGallery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.simpleLens.js\"></script>\n");
      out.write("  <!-- slick slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/slick.js\"></script>\n");
      out.write("  <!-- Price picker slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/nouislider.js\"></script>\n");
      out.write("  <!-- Custom js -->\n");
      out.write("  <script src=\"js/custom.js\"></script> \n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
