/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-08-03 13:48:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.usedshop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usedNormalDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	int marketid = Integer.parseInt(request.getParameter("marketid"));

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>북적북적</title>\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Serif+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* { font-family: 'Noto Serif KR', serif; }\r\n");
      out.write("form {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	color: #8181F7;\r\n");
      out.write("}\r\n");
      out.write("input[type='text'] {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	width: 80px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	color: #8181F7;\r\n");
      out.write("	font-size: 14pt;\r\n");
      out.write("	top: 5px;\r\n");
      out.write("	border: 2px solid #8181F7;\r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("b.navtext {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	color: #FE2E64;\r\n");
      out.write("	top: 25px;\r\n");
      out.write("	font-size: 18pt;\r\n");
      out.write("}\r\n");
      out.write("input[type=button], input[type=submit] {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	font-size: 16pt;\r\n");
      out.write("	top: 50px;\r\n");
      out.write("	width: 150px;\r\n");
      out.write("	height: 60px;\r\n");
      out.write("	border: 3px solid #210B61;\r\n");
      out.write("	-webkit-border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("input[type=button] {\r\n");
      out.write("	background-color: #8181F7;\r\n");
      out.write("	margin-right: 30px;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit] {\r\n");
      out.write("	background-color: #FE2E64;\r\n");
      out.write("	color: white;\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function movePage() {\r\n");
      out.write("	this.close(); \r\n");
      out.write("	self.opener = self; \r\n");
      out.write("	opener.close();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<br>\r\n");
      out.write("<b id=\"title\"><font size=\"14\" color=\"#8181F7\">경매 글 삭제</font></b>\r\n");
      out.write("<br><br>\r\n");
      out.write("<form action=\"/bookjeok/usnmdelete.ad\" method=\"post\" onsubmit=\"return movePage();\" target=\"opener\">\r\n");
      out.write("<input type=\"text\" name=\"marketid\" value=\"");
      out.print( marketid );
      out.write("\" readonly><br>\r\n");
      out.write("<b class=\"navtext\">해당 글을 정말로 삭제하시겠습니까?</b><br>\r\n");
      out.write("<b class=\"navtext\">삭제한 장터의 정보는 되돌릴 수 없습니다.</b><br>\r\n");
      out.write("<input type=\"button\" value=\"취소\" onclick=\"window.close()\">\r\n");
      out.write("<input type=\"submit\" value=\"삭제\"\">\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
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
