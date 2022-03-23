package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>DaiAn Shop | Home</title>\n");
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
      out.write("    <!-- <link id=\"switcher\" href=\"css/theme-color/bridge-theme.css\" rel=\"stylesheet\"> -->\n");
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
      out.write("  <body> \n");
      out.write("   <!-- wpf loader Two -->\n");
      out.write("    <div id=\"wpf-loader-two\">          \n");
      out.write("      <div class=\"wpf-loader-two-inner\">\n");
      out.write("        <span>Loading</span>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- / wpf loader Two -->       \n");
      out.write("  <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("  <!-- END SCROLL TOP BUTTON -->\n");
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
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  <li><a href=\"account.jsp\">Đăng ký</a></li>\n");
      out.write("                  ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 \n");
      out.write("                  \n");
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
      out.write("                 <a href=\"index.jsp\"><img src=\"img/logo.jpg\" alt=\"logo img\" width=280px height=100px></a> \n");
      out.write("              </div>\n");
      out.write("              <!-- / logo  -->\n");
      out.write("\n");
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
      out.write("                <li><a href=\"blog-archive-2.jsp\">Hương nén TM</a></li>\n");
      out.write("                <li><a href=\"blog-archive-2.jsp\">Hương nén trầm</a></li>\n");
      out.write("                <li><a href=\"blog-archive-2.jsp\">Trầm nụ</a></li>\n");
      out.write("                <li><a href=\"blog-archive-2.jsp\">Trà trầm</a></li>\n");
      out.write("                <li><a href=\"blog-archive-2.jsp\">Trầm thiền</a></li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"blog-archive-2.jsp\">Blog</a></li>\n");
      out.write("              \n");
      out.write("                <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div>       \n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </section>\n");
      out.write("  <!-- / menu -->\n");
      out.write("  \n");
      out.write("  <!-- Start slider -->\n");
      out.write("  <section id=\"aa-slider\">\n");
      out.write("    <div class=\"aa-slider-area\">\n");
      out.write("      <div id=\"sequence\" class=\"seq\">\n");
      out.write("        <div class=\"seq-screen\">\n");
      out.write("          <ul class=\"seq-canvas\">\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/1.jpg\" alt=\"Trầm hương Đại An img\" />\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/2.jpg\" alt=\"Trầm hương Đại An 2 img\" />\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/3.jpg\" alt=\"Trầm hương Đại An 3 img\" />\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->           \n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/4.jpg\" alt=\"Trầm hương Đại An 4 img\" />\n");
      out.write("              </div>\n");
      out.write("            </li>                  \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        <!-- slider navigation btn -->\n");
      out.write("        <fieldset class=\"seq-nav\" aria-controls=\"sequence\" aria-label=\"Slider buttons\">\n");
      out.write("          <a type=\"button\" class=\"seq-prev\" aria-label=\"Previous\"><span class=\"fa fa-angle-left\"></span></a>\n");
      out.write("          <a type=\"button\" class=\"seq-next\" aria-label=\"Next\"><span class=\"fa fa-angle-right\"></span></a>\n");
      out.write("        </fieldset>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / slider -->\n");
      out.write("  <!-- Start Promo section -->\n");
      out.write("  <section id=\"aa-promo\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-promo-area\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <!-- promo left -->\n");
      out.write("              <div class=\"col-md-5 no-padding\">                \n");
      out.write("                <div class=\"aa-promo-left\">\n");
      out.write("                  <div class=\"aa-promo-banner\">                    \n");
      out.write("                    <img src=\"img/promo-banner-1.jpg\" alt=\"img\">                    \n");
      out.write("                    <div class=\"aa-prom-content\">\n");
      out.write("                      <h4><a href=\"#\">Hương nén</a></h4>                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- promo right -->\n");
      out.write("              <div class=\"col-md-7 no-padding\">\n");
      out.write("                <div class=\"aa-promo-right\">\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-3.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <h4><a href=\"#\">Trầm nụ</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-2.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <h4><a href=\"#\">Trà trầm</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>5\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-4.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <h4><a href=\"#\">Trầm thiền</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-5.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <h4><a href=\"#\">Bút trầm</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Promo section -->\n");
      out.write("\n");
      out.write("  <!-- banner section -->\n");
      out.write("  <section id=\"aa-banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">        \n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"aa-banner-area\">\n");
      out.write("            <a href=\"#\"><img src=\"img/hh.jpg\" alt=\"Tram huong viet Dai An img\"></a>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- popular section -->\n");
      out.write("  <section id=\"aa-popular-category\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"aa-popular-category-area\">\n");
      out.write("              <!-- start prduct navigation -->\n");
      out.write("                <!-- Start huong nen category -->\n");
      out.write("                <div>\n");
      out.write("                  <ul class=\"aa-product-catg aa-popular-slider\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("                                                                                             \n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- / huong nen product category -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </div> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / popular section -->\n");
      out.write("  \n");
      out.write("  <!-- Support section -->\n");
      out.write("  <section id=\"aa-support\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-support-area\">\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-truck\"></span>\n");
      out.write("                <h4>FREE SHIPPING</h4>\n");
      out.write("                <P>Quanh khu vực nội thành Hà Nội</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-clock-o\"></span>\n");
      out.write("                <h4>QUICK TIME</h4>\n");
      out.write("                <P>Sản phẩm được bàn giao trong 10 ngày từ khi đặt hàng</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-phone\"></span>\n");
      out.write("                <h4>SUPPORT</h4>\n");
      out.write("                <P>Hỗ trợ tận tình 24/7</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Support section -->\n");
      out.write("\n");
      out.write("  <!-- Latest Blog -->\n");
      out.write("  <section id=\"aa-latest-blog\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-latest-blog-area\">\n");
      out.write("            <h2>LATEST BLOG</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <!-- single latest blog -->\n");
      out.write("              <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                <div class=\"aa-latest-blog-single\">\n");
      out.write("                  <figure class=\"aa-blog-img\">                    \n");
      out.write("                    <a href=\"blog-single.jsp\"><img src=\"img/promo-banner-1.jpg\" alt=\"img\"></a>  \n");
      out.write("                      <figcaption class=\"aa-blog-img-caption\">\n");
      out.write("                      <span href=\"blog-single.jsp\"><i class=\"fa fa-eye\"></i>5K</span>\n");
      out.write("                      <a href=\"blog-single.jsp\"><i class=\"fa fa-thumbs-o-up\"></i>426</a>\n");
      out.write("                      <a href=\"blog-single.jsp\"><i class=\"fa fa-comment-o\"></i>20</a>\n");
      out.write("                      <span href=\"blog-single.jsp\"><i class=\"fa fa-clock-o\"></i>June 26, 2016</span>\n");
      out.write("                    </figcaption>                          \n");
      out.write("                  </figure>\n");
      out.write("                  <div class=\"aa-blog-info\">\n");
      out.write("                    <h3 class=\"aa-blog-title\"><a href=\"blog-single.jsp\">Trầm hương đối với đời sống tâm linh</a></h3> \n");
      out.write("                    <a href=\"blog-single.jsp\" class=\"aa-read-mor-btn\">Read more <span class=\"fa fa-long-arrow-right\"></span></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- single latest blog -->\n");
      out.write("              <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                <div class=\"aa-latest-blog-single\">\n");
      out.write("                  <figure class=\"aa-blog-img\">                    \n");
      out.write("                    <a href=\"blog-single2.jsp\"><img src=\"img/promo-banner-3.jpg\" alt=\"img\"></a>  \n");
      out.write("                      <figcaption class=\"aa-blog-img-caption\">\n");
      out.write("                      <span href=\"blog-single2.jsp\"><i class=\"fa fa-eye\"></i>3K</span>\n");
      out.write("                      <a href=\"blog-single2.jsp\"><i class=\"fa fa-thumbs-o-up\"></i>226</a>\n");
      out.write("                      <a href=\"blog-single2.jsp\"><i class=\"fa fa-comment-o\"></i>20</a>\n");
      out.write("                      <span href=\"blog-single2.jsp\"><i class=\"fa fa-clock-o\"></i>June 21, 2017</span>\n");
      out.write("                    </figcaption>                          \n");
      out.write("                  </figure>\n");
      out.write("                  <div class=\"aa-blog-info\">\n");
      out.write("                    <h3 class=\"aa-blog-title\"><a href=\"blog-single2.jsp\">Phân loại trầm hương</a></h3>\n");
      out.write("                     <a href=\"blog-single2.jsp\" class=\"aa-read-mor-btn\">Read more <span class=\"fa fa-long-arrow-right\"></span></a>         \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- single latest blog -->\n");
      out.write("              <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                <div class=\"aa-latest-blog-single\">\n");
      out.write("                  <figure class=\"aa-blog-img\">                    \n");
      out.write("                    <a href=\"blog-single3.jsp\"><img src=\"img/promo-banner-2.jpg\" alt=\"img\"></a>  \n");
      out.write("                      <figcaption class=\"aa-blog-img-caption\">\n");
      out.write("                      <span href=\"blog-single3.jsp\"><i class=\"fa fa-eye\"></i>1K</span>\n");
      out.write("                      <a href=\"blog-single3.jsp\"><i class=\"fa fa-thumbs-o-up\"></i>600</a>\n");
      out.write("                      <a href=\"blog-single3.jsp\"><i class=\"fa fa-comment-o\"></i>50</a>\n");
      out.write("                      <span href=\"blog-single3.jsp\"><i class=\"fa fa-clock-o\"></i>May 24, 2019</span>\n");
      out.write("                    </figcaption>                          \n");
      out.write("                  </figure>\n");
      out.write("                  <div class=\"aa-blog-info\">\n");
      out.write("                    <h3 class=\"aa-blog-title\"><a href=\"blog-single3.jsp\">Trầm hương đối với sức khoẻ con người</a></h3>\n");
      out.write("                    <a href=\"blog-single3.jsp\" class=\"aa-read-mor-btn\">Read more <span class=\"fa fa-long-arrow-right\"></span></a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Latest Blog -->\n");
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
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"blog-archive-2.jsp\">Blog</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
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
      out.write("    </div>  \n");
      out.write("\n");
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
      out.write("  \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin ==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                  <li><a href=\"load\">Amin</a></li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                  <li><a href=\"logout\">Đăng xuất</a></li>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                   <li><a href=\"account.jsp\">Đăng nhập</a></li>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <li>\n");
          out.write("                      <figure>\n");
          out.write("                        <a class=\"aa-product-img\" ><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"huong img\"></a>\n");
          out.write("                        <a class=\"aa-add-card-btn\"href=\"#\"><span class=\"fa fa-shopping-cart\"></span>Add To Cart</a>\n");
          out.write("                         <figcaption>\n");
          out.write("                          <h4 class=\"aa-product-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                          <span class=\"aa-product-price\">Đ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span><span class=\"aa-product-price\"><del></del></span>\n");
          out.write("                        </figcaption>\n");
          out.write("                      </figure>                     \n");
          out.write("                    </li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
