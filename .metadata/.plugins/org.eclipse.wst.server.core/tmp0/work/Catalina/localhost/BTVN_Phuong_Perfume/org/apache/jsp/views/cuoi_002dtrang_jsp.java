/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-08-10 11:58:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cuoi_002dtrang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer-top-area\">\r\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-about-us\">\r\n");
      out.write("                        <h2>u<span>Stora</span></h2>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\r\n");
      out.write("                        <div class=\"footer-social\">\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Order history</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Vendor contact</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Front page</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-menu\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Mobile Phone</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Home accesseries</a></li>\r\n");
      out.write("                            <li><a href=\"#\">LED TV</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Computer</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Gadets</a></li>\r\n");
      out.write("                        </ul>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <div class=\"footer-newsletter\">\r\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\r\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\r\n");
      out.write("                        <div class=\"newsletter-form\">\r\n");
      out.write("                            <form action=\"#\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\r\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End footer top area -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"footer-bottom-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"footer-card-icon\">\r\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\r\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End footer bottom area -->\r\n");
      out.write("   \r\n");
      out.write("    <!-- Latest jQuery form server -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap JS form CDN -->\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery sticky menu -->\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery easing -->\r\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Main Script -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Slider -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
