/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2021-02-15 06:23:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("                <!-- Contact Section Heading-->\r\n");
      out.write("                <h2 class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Contact Me</h2>\r\n");
      out.write("                <!-- Icon Divider-->\r\n");
      out.write("                <div class=\"divider-custom\">\r\n");
      out.write("                    <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                    <div class=\"divider-custom-icon\"><i class=\"fas fa-star\"></i></div>\r\n");
      out.write("                    <div class=\"divider-custom-line\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Contact Section Form-->\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-8 mx-auto\">\r\n");
      out.write("                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19.-->\r\n");
      out.write("                        <form id=\"contactForm\" name=\"sentMessage\" novalidate=\"novalidate\">\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\r\n");
      out.write("                                    <label>Name</label>\r\n");
      out.write("                                    <input class=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Name\" required=\"required\" data-validation-required-message=\"Please enter your name.\" />\r\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\r\n");
      out.write("                                    <label>Email Address</label>\r\n");
      out.write("                                    <input class=\"form-control\" id=\"email\" type=\"email\" placeholder=\"Email Address\" required=\"required\" data-validation-required-message=\"Please enter your email address.\" />\r\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\r\n");
      out.write("                                    <label>Phone Number</label>\r\n");
      out.write("                                    <input class=\"form-control\" id=\"phone\" type=\"tel\" placeholder=\"Phone Number\" required=\"required\" data-validation-required-message=\"Please enter your phone number.\" />\r\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"control-group\">\r\n");
      out.write("                                <div class=\"form-group floating-label-form-group controls mb-0 pb-2\">\r\n");
      out.write("                                    <label>Message</label>\r\n");
      out.write("                                    <textarea class=\"form-control\" id=\"message\" rows=\"5\" placeholder=\"Message\" required=\"required\" data-validation-required-message=\"Please enter a message.\"></textarea>\r\n");
      out.write("                                    <p class=\"help-block text-danger\"></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <br />\r\n");
      out.write("                            <div id=\"success\"></div>\r\n");
      out.write("                            <div class=\"form-group\"><button class=\"btn btn-primary btn-xl\" id=\"sendMessageButton\" type=\"submit\">Send</button></div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
