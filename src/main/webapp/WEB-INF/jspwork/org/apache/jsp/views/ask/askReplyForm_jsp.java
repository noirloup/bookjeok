/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-08-03 14:10:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.ask;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.model.vo.User;

public final class askReplyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/ask/../common/footer.jsp", Long.valueOf(1627539033020L));
    _jspx_dependants.put("/views/ask/../common/menubar.jsp", Long.valueOf(1627989190941L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("user.model.vo.User");
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

	//askDetailView.jsp 가 보낸 파라미터 값 꺼내기
	int askNum = Integer.parseInt(request.getParameter("askNum"));
	int currentPage = Integer.parseInt(request.getParameter("page"));

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>북적북적</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a, a:hover{ color : #2e2efe;\r\n");
      out.write("	text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("th{ background-color: #58ACFA;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: 0px solid #58ACFA;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("	border-right:none;\r\n");
      out.write("	}\r\n");
      out.write("td{\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	border: 1px solid #58ACFA;\r\n");
      out.write("}\r\n");
      out.write("#table{\r\n");
      out.write("	border: 0px solid #58ACFA;\r\n");
      out.write("	margin-right : 865px;\r\n");
      out.write("	margin-bottom : 10px;\r\n");
      out.write("}\r\n");
      out.write("#div{	\r\n");
      out.write("	margin-right :330px;\r\n");
      out.write("	margin-top : 1px;	\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("	margin-right :300px;\r\n");
      out.write("	margin-left : 5px;\r\n");
      out.write("	margin-top : 200px;\r\n");
      out.write("}\r\n");
      out.write("form.sform {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	color: #0404B4;\r\n");
      out.write("	display : none;\r\n");
      out.write("	width : 560px;\r\n");
      out.write("	-webkit-border-radius : 1px;\r\n");
      out.write("	margin-left : 650px;\r\n");
      out.write("}\r\n");
      out.write("form.sform input[name=submit] {\r\n");
      out.write("	width: 60px;\r\n");
      out.write("	color: white;\r\n");
      out.write("	background-color: #58ACFA;\r\n");
      out.write("	border: 2px solid #58ACFA;\r\n");
      out.write("	-webkit-border-radius: 1px;\r\n");
      out.write("}\r\n");
      out.write("legend{\r\n");
      out.write("	margin-left : 820px;\r\n");
      out.write("	position:relative;\r\n");
      out.write("	}\r\n");
      out.write("#title,content{\r\n");
      out.write("	margin-left : 850px;\r\n");
      out.write("}\r\n");
      out.write("button{\r\n");
      out.write("	margin-left : 1170px;\r\n");
      out.write("	border: 0px solid #58ACFA;\r\n");
      out.write("	background-color: #58ACFA;\r\n");
      out.write("	color: white;\r\n");
      out.write("	margin-bottom : 1px;\r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\n');

	//로그인 확인을 위해서 내장된 session 객체를 이용
	User loginUser = (User) session.getAttribute("loginUser");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>북적북적</title>\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Serif+KR&display=swap\" rel=\"stylesheet\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("* { font-family: 'Noto Serif KR', serif; }\n");
      out.write(".imgtd {\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".teamlogo {\n");
      out.write("	width: 181px;\n");
      out.write("	height: 104px;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bartd {\n");
      out.write("	position: relative;\n");
      out.write("	left: 260px;\n");
      out.write("}\n");
      out.write(".topbar {\n");
      out.write("	border: 2px solid #58ACFA;\n");
      out.write("	background-color: #58ACFA;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".topbar td {\n");
      out.write("	border: 2px solid #2E64FE;\n");
      out.write("	background-color: #2E64FE;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write(".topbar td a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".admintopbar {\n");
      out.write("	border: 2px solid #58ACFA;\n");
      out.write("	background-color: #58ACFA;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".admintopbar td {\n");
      out.write("	border: 2px solid #2E64FE;\n");
      out.write("	background-color: #2E64FE;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write(".admintopbar td a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logintopbar {\n");
      out.write("	border: 2px solid #58ACFA;\n");
      out.write("	background-color: #58ACFA;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".logintopbar td {\n");
      out.write("	border: 2px solid #2E64FE;\n");
      out.write("	background-color: #2E64FE;\n");
      out.write("	-webkit-border-radius: 5px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write(".logintopbar td a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".mainbar {\n");
      out.write("	list-style: none;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".mainbar li {\n");
      out.write("	float: left;\n");
      out.write("	width: 180px;\n");
      out.write("	height: 40px;\n");
      out.write("	margin-right: 5px;\n");
      out.write("	padding: 0;\n");
      out.write("	font-size : 20pt;\n");
      out.write("}\n");
      out.write(".mainbar li a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 180px;\n");
      out.write("	height: 50px;\n");
      out.write("	display: block;\n");
      out.write("	background: #8181F7;\n");
      out.write("	color: navy;\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("	text-shadow: 1px 1px 2px white;\n");
      out.write("	padding-top: 5px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	border: 2px solid #5858FA;\n");
      out.write("}\n");
      out.write(".mainbar li a:hover {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 180px;\n");
      out.write("	height: 50px;\n");
      out.write("	display: block;\n");
      out.write("	background: #2E2EFE;\n");
      out.write("	color: white;\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("	text-shadow: 1px 1px 2px navy;\n");
      out.write("	padding-top: 5px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".adminmainbar {\n");
      out.write("	list-style: none;\n");
      out.write("	position: relative;\n");
      out.write("	/* top: -30px; */\n");
      out.write("}\n");
      out.write(".adminmainbar li {\n");
      out.write("	width: 150px;\n");
      out.write("	height: 40px;\n");
      out.write("	margin-right: 5px;\n");
      out.write("	padding: 0;\n");
      out.write("	font-size : 18pt;\n");
      out.write("}\n");
      out.write(".admmbutton {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 150px;\n");
      out.write("	height: 55px;\n");
      out.write("	display: block;\n");
      out.write("	background: #8181F7;\n");
      out.write("	color: navy;\n");
      out.write("	font-size: 18pt;\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("	text-shadow: 1px 1px 2px white;\n");
      out.write("	padding-top: 5px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	border: 2px solid #5858FA;\n");
      out.write("	cursor: pointer;\n");
      out.write("}\n");
      out.write(".mainbar input.admmbutton[type=\"button\"]:hover {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 150px;\n");
      out.write("	height: 55px;\n");
      out.write("	display: block;\n");
      out.write("	background: #2E2EFE;\n");
      out.write("	color: white;\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("	text-shadow: 1px 1px 2px navy;\n");
      out.write("	padding-top: 5px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("}\n");
      out.write(".mmbutton {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 180px;\n");
      out.write("	height: 55px;\n");
      out.write("	display: block;\n");
      out.write("	background: #8181F7;\n");
      out.write("	font-size: 18pt;\n");
      out.write("	color: navy;\n");
      out.write("	text-align: center;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 0;\n");
      out.write("	text-shadow: 1px 1px 2px white;\n");
      out.write("	padding-top: 5px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	border: 2px solid #5858FA;\n");
      out.write("}\n");
      out.write("hr {\n");
      out.write("	clear: both;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center>\n");
      out.write("<table width=\"900\">\n");
      out.write("	<tr>\n");
      out.write("		<td class=\"imgtd\"><img class=\"teamlogo\" src=\"/bookjeok/resources/bookjeok/bookjeok.png\" onclick=\"javascript:location.href='/bookjeok/index.jsp'\"></td>\n");
      out.write("		<td class=\"bartd\">\n");
      out.write("		");
 if (loginUser == null) { 
      out.write("\n");
      out.write("		<table class=\"topbar\">\n");
      out.write("			<tr><td><a href=\"/bookjeok/nlist\">공지사항</td>\n");
      out.write("				<td><a href=\"/bookjeok/alist\">1:1 문의</a></td>\n");
      out.write("				<td><a href=\"/bookjeok/views/user/loginPage.jsp\">로그인</a></td></tr>\n");
      out.write("		</table>\n");
      out.write("		");
 } else if (loginUser != null && loginUser.getAdmin().equals("Y")) { 
      out.write("\n");
      out.write("		<table class=\"admintopbar\">\n");
      out.write("		<tr><td>");
      out.print(loginUser.getUserId());
      out.write("님</td>\n");
      out.write("			<td><a href=\"/bookjeok/ulogout\">로그아웃</td></tr>\n");
      out.write("		</table>\n");
      out.write("		");
 } else if (loginUser != null) { 
      out.write("\n");
      out.write("		<table class=\"logintopbar\">\n");
      out.write("			<tr><td><a href=\"/bookjeok/nlist\">공지사항</td>\n");
      out.write("				<td><a href=\"/bookjeok/alist\">1:1 문의</a></td>\n");
      out.write("				<td>");
      out.print(loginUser.getUserId());
      out.write("님</a></td></tr>\n");
      out.write("			<tr><th></th>\n");
      out.write("				<td><a href=\"/bookjeok/umyprofile?userid=");
      out.print(loginUser.getUserId());
      out.write("\">마이페이지</a></td>\n");
      out.write("				<td><a href=\"/bookjeok/ulogout\">로그아웃</a></td></tr>\n");
      out.write("		</table>\n");
      out.write("		");
 } 
      out.write("\n");
      out.write("		<br>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if (loginUser == null) { 
      out.write("\n");
      out.write("<table class=\"mainbar\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("	<tr>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"도서\" onclick=\"javascript:location.href='/bookjeok/views/book/PBookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"E-Book\" onclick=\"javascript:location.href='/bookjeok/views/book/EBookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"오디오북\" onclick=\"javascript:location.href='/bookjeok/views/book/ABookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"중고장터\" onclick=\"javascript:location.href='/bookjeok/views/usedshop/UsedAuctionMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"리뷰\" onclick=\"javascript:location.href='/bookjeok/views/review/ReviewMainView.jsp';\"></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
 } else if (loginUser != null && loginUser.getAdmin().equals("Y")) { 
      out.write("\n");
      out.write("<table class=\"adminmainbar\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("	<tr>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"회원관리\" onclick=\"javascript:location.href='/bookjeok/ulist.ad';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"상품관리\" onclick=\"javascript:location.href='/bookjeok/views/book/ProductAdminWriteView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"장터관리\" onclick=\"javascript:location.href='/bookjeok/usaulist.ad';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"리뷰관리\" onclick=\"javascript:location.href='/bookjeok/rlist.ad';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"공지사항관리\" onclick=\"javascript:location.href='/bookjeok/nlist.ad';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"1:1 문의관리\" onclick=\"javascript:location.href='/bookjeok/alist.ad';\"></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
 } else if (loginUser != null) { 
      out.write("\n");
      out.write("<table class=\"mainbar\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("	<tr>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"도서\" onclick=\"javascript:location.href='/bookjeok/views/book/PBookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"E-Book\" onclick=\"javascript:location.href='/bookjeok/views/book/EBookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"오디오북\" onclick=\"javascript:location.href='/bookjeok/views/book/ABookMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"중고장터\" onclick=\"javascript:location.href='/bookjeok/views/usedshop/UsedAuctionMainView.jsp';\"></td>\n");
      out.write("		<td><input type=\"button\" class=\"mmbutton\" value=\"리뷰\" onclick=\"javascript:location.href='/bookjeok/views/review/ReviewMainView.jsp';\"></td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
 } 
      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<h1 align=\"center\">");
      out.print( askNum );
      out.write("번글 댓글 등록 페이지</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"/bookjeok/areply.ad\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"askNum\" value=\"");
      out.print( askNum );
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"page\" value=\"");
      out.print( currentPage );
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" width=\"500\" border=\"1\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("<tr><th>작성자</th><td><input type=\"text\" name=\"writer\" readonly value=\"");
      out.print( loginUser.getUserId() );
      out.write("\"></td></tr>\r\n");
      out.write("<tr><th>제 목</th><td><input type=\"text\" name=\"title\" size=\"50\"></td></tr>\r\n");
      out.write("<tr><th>내 용</th><td><textarea rows=\"5\" cols=\"50\" name=\"content\"></textarea></td></tr>\r\n");
      out.write("<tr><th colspan=\"2\">\r\n");
      out.write("	<input type=\"submit\" value=\"등록하기\"> &nbsp; \r\n");
      out.write("	<input type=\"reset\" value=\"작성취소\"> &nbsp;\r\n");
      out.write("	<input type=\"button\" value=\"목록\" onclick=\"javascript:location.href='/bookjeok/alist.ad?page=");
      out.print( currentPage );
      out.write("'; return false;\">\r\n");
      out.write("</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<br>\r\n");
      out.write("<hr>\r\n");
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
      out.write("\r\n");
      out.write("div#footer {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	color: #01DF3A;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("copyright@ict.org &nbsp; 자바,파이썬 기반 빅데이터 플랫폼 개발자 양성과정<br>\r\n");
      out.write("서울시 마포구 서교동 첨단빌딩 7층, TEL : 02-1234-5678, \r\n");
      out.write("FAX : 02-1234-5679\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
