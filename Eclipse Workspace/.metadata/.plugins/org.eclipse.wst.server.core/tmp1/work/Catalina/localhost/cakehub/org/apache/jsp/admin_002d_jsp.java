/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2021-01-30 08:57:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002d_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Admin-pane</title>\r\n");
      out.write("\r\n");
      out.write(" <link href=\"assets/img/back.jpg\" rel=\"icon\">\r\n");
      out.write("  <link href=\"assets/img/index.jpg\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Fonts -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Vendor CSS Files -->\r\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/icofont/icofont.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/owl.carousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/venobox/venobox.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main CSS File -->\r\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}





      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<h1>Welcome</h1>\r\n");
      out.write("<hr color=\"white\">\r\n");
      out.write("<nav align=\"right\">\r\n");
      out.write("\r\n");
      out.write("<a class=\"btn btn-primary\" href=\"deliveryPartnerReg.jsp\">Add Delivery Partner</a>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("<hr color=\"white\">\r\n");
      out.write("<h2>Orders</h2>\r\n");
      out.write("\r\n");
      out.write("<table class=\"table table-dark\" >\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">Sno</th>\r\n");
      out.write("      <th scope=\"col\">Name</th>\r\n");
      out.write("      <th scope=\"col\">Email</th>\r\n");
      out.write("      <th scope=\"col\">Phone</th>\r\n");
      out.write("      <th scope=\"col\">date</th>\r\n");
      out.write("      <th scope=\"col\">time</th>\r\n");
      out.write("      <th scope=\"col\">No of items</th>\r\n");
      out.write("      <th scope=\"col\">Message</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("  \r\n");
      out.write("  <c:forEach var=\"i\" begin=\"1\" end =\"10\">\r\n");
      out.write("  \r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("          <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nos}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("              <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </c:forEach>\r\n");
      out.write("    \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script src=\"assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/jquery.easing/jquery.easing.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/owl.carousel/owl.carousel.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/venobox/venobox.min.js\"></script>\r\n");
      out.write("  <script src=\"assets/vendor/aos/aos.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Template Main JS File -->\r\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
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
