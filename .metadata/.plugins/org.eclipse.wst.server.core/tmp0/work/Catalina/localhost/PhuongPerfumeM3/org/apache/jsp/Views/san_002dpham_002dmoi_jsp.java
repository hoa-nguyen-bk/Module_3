/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-08-10 12:02:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class san_002dpham_002dmoi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"latest-product\">\n");
      out.write("                        <h2 class=\"section-title\">New Products</h2>\n");
      out.write("                        <div class=\"product-carousel\">\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-1.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Thêm vào giỏ hàng</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> Xem chi tiết</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Samsung Galaxy s5- 2015</a></h2>\n");
      out.write("                                \n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$700.00</ins> <del>$100.00</del>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-2.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>Nokia Lumia 1320</h2>\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$899.00</ins> <del>$999.00</del>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-3.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>LG Leon 2015</h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$400.00</ins> <del>$425.00</del>\n");
      out.write("                                </div>                                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-4.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Sony microsoft</a></h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$200.00</ins> <del>$225.00</del>\n");
      out.write("                                </div>                            \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-5.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>iPhone 6</h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$1200.00</ins> <del>$1355.00</del>\n");
      out.write("                                </div>                                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"img/product-6.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Samsung gallaxy note 4</a></h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$400.00</ins>\n");
      out.write("                                </div>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End main content area -->\n");
      out.write("    ");
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
