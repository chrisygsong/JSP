/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Pivotal tc Runtime 3.2.2.RELEASE/8.5.6.B.RELEASE
 * Generated at: 2017-01-16 05:51:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.util.ServerInfo;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.catalina.util.ServerInfo");
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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"http://www.pivotal.io/sites/all/themes/gopo13/images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\t<title>Pivotal tc Server &#8212; Developer Edition with Spring Insight</title>\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"splash.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<!-- This page was released with Pivotal tc Server Developer Edition 3.2.2.RELEASE -->\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t<div id=\"hdr\"><span class=\"utility\"><a href=\"https://network.pivotal.io/products/pivotal-app-suite\" title=\"Pivotal tc Server\">Pivotal tc Server</a></span><a href=\"http://www.pivotal.io/\" title=\"Pivotal\"><h1>Pivotal</h1></a></div>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t<!-- Body -->\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("    \t\t<div id=\"intro\">\n");
      out.write("\t\t\t\t<!--<h4>Pivotal</h4>-->\n");
      out.write("\t\t\t\t<h2>Pivotal tc Server &#8212; Developer Edition with Spring Insight</h2>\n");
      out.write("\t\t\t\t<h3 class=\"title\">Congratulations! You have successfully setup and started Pivotal tc Server.  You are ready to go!</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"bodyrule\"><hr /></div>\n");
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<p>This is the default Pivotal tc Server Runtime home page. It is located on the local filesystem at:</p>\n");
      out.write("\t\t\t\t<span class=\"code\">$TC_RUNTIME_INSTANCE_HOME/webapps/ROOT/index.jsp</span>\n");
      out.write("\t\t\t\t<p>where <span class=\"code\">$TC_RUNTIME_INSTANCE_HOME</span> is the root of the tc Runtime instance directory.</p>\n");
      out.write("\t\t\t\t<p>&nbsp;</p>\n");
      out.write("\t\t\t\t<div id=\"links\">\n");
      out.write("\t\t\t\t<h3>For additional information about Pivotal tc Server, see the following links:</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://network.pivotal.io/products/pivotal-tcserver\">Pivotal tc Server Product Details</a><br />The official home for the Pivotal tc Server.</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://docs.pivotal.io/tcserver/index.html\">Pivotal tc Server Documentation </a><br />Find out what it does, how to use it, and other useful information.</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://stackoverflow.com/questions/tagged/tcserver\">Pivotal tc Server Product Community</a><br />We are active on StackOverflow, so you can ask questions and get answers from Pivotal experts and experienced community members.</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.spring.io/tools\">Spring Tool Suite (STS)</a><br />Go here to download the latest STS release with Pivotal tc Server and Spring Insight bundled in it!</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.pivotal.io/contact\">Pivotal tc Server Inquiries</a><br />Have a question about Pivotal tc Server? Contact us.</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"mailto:tcserver@pivotal.io\">Email questions to us</a><br></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t<div id=\"versions\">\n");
      out.write("\t\t\tPivotal tc Server Developer Edition<br/>\n");
      out.write("\t\t\t");
 out.println(ServerInfo.getServerInfo()); 
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"ftr\">&copy; 2016 Pivotal Software, Inc. All rights reserved.</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
