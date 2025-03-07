/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-08-09 02:16:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.model.vo.User;
import user.model.vo.User;

public final class myProfilePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/user/../common/menubar.jsp", Long.valueOf(1628431535259L));
    _jspx_dependants.put("/views/user/../common/footer.jsp", Long.valueOf(1627539033020L));
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

	User user = (User)request.getAttribute("user");

	//취미 : 하나의 문자열을 "," 로 각각 분리 처리
	String[] preferres = user.getPreferred().split(",");
	
	//checkbox 의 checked 속성 설정을 위한 배열 만듦
	String[] checked = new String[12];
	
	for(String preferred : preferres){
		switch(preferred){
		case "소설": checked[0] = "checked";  break;
		case "경제/경영": checked[1] = "checked";  break;
		case "자기계발": checked[2] = "checked";  break;
		case "시/에세이": checked[3] = "checked";  break;
		case "인문": checked[4] = "checked";  break;
		case "국어/외국어": checked[5] = "checked";  break;
		case "역사/풍속/신화": checked[6] = "checked";  break;
		case "사회/정치/법": checked[7] = "checked";  break;
		case "가정/생활/요리": checked[8] = "checked";  break;
		case "여행/취미": checked[9] = "checked";  break;
		case "건강/의학": checked[10] = "checked";  break;
		case "기타 장르": checked[11] = "checked";  break;
		}
	}

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
      out.write(".outer th { \r\n");
      out.write("	background-color: #8181F7; \r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write(".outer { \r\n");
      out.write("	border: 2px solid #8181F7;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	-webkit-border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("table input[type=submit] { background-color: #58ACFA; -webkit-border-radius: 10px; }\r\n");
      out.write("table input[type=reset] { background-color: #58ACFA; -webkit-border-radius: 10px; }\r\n");
      out.write("div { position: relative; }\r\n");
      out.write(".leftmenu {\r\n");
      out.write("	left: -375px;\r\n");
      out.write("}\r\n");
      out.write(".leftmenu input[type='button'] {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("}\r\n");
      out.write(".leftmenu .textdiv {\r\n");
      out.write("	align: center;\r\n");
      out.write("	background-color: #8181F7;\r\n");
      out.write("	width: 146px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	-webkit-border-radius: 10px;\r\n");
      out.write("	border: 2px solid navy;\r\n");
      out.write("	font-size: 16pt;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding-top: 7px;\r\n");
      out.write("}\r\n");
      out.write(".leftmenu input[type=button] {\r\n");
      out.write("	width: 150px;\r\n");
      out.write("	height: 35px;\r\n");
      out.write("	background-color: #58ACFA;\r\n");
      out.write("	-webkit-border-radius: 10px;\r\n");
      out.write("	font-color: white;\r\n");
      out.write("}\r\n");
      out.write(".content {\r\n");
      out.write("	left: 80px;\r\n");
      out.write("	top: -150px;\r\n");
      out.write("}\r\n");
      out.write(".outer input[type=text] {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("}\r\n");
      out.write(".outer input[type=password] {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("}\r\n");
      out.write(".outer input[type=button] {\r\n");
      out.write("	background-color: #8181F7;\r\n");
      out.write("	-webkit-border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write(".outer input[type=email] {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("}\r\n");
      out.write(".outer input[type=textarea] {\r\n");
      out.write("	width: 350px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("}\r\n");
      out.write(".outer input#maingo {\r\n");
      out.write("	background-color: #58ACFA;\r\n");
      out.write("	-webkit-border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("#footer {\r\n");
      out.write("	top: -130px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/bookjeok/resources/js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validate(){\r\n");
      out.write("	var pwdValue = document.getElementById(\"upwd\").value;\r\n");
      out.write("	var pwdValue2 = document.getElementById(\"upwd2\").value;\r\n");
      out.write("	\r\n");
      out.write("	if(pwdValue !== pwdValue2){\r\n");
      out.write("		alert(\"암호와 암호확인의 값이 일치하지 않습니다.\");\r\n");
      out.write("		document.getElementById(\"upwd2\").value = \"\";\r\n");
      out.write("		document.getElementById(\"upwd\").select();\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function dupNickCheck(){\r\n");
      out.write("	$.ajax({\r\n");
      out.write("		url: \"/bookjeok/udupnickcheck\",\r\n");
      out.write("		type: \"post\",\r\n");
      out.write("		data: {nickname: $(\"#nickname\").val()},\r\n");
      out.write("		success: function(data){\r\n");
      out.write("			console.log(\"success : \" + data);\r\n");
      out.write("			if(data == \"ok\"){\r\n");
      out.write("				alert(\"사용 가능한 닉네임입니다.\");\r\n");
      out.write("				$(\"#usernm\").focus();\r\n");
      out.write("			}else{\r\n");
      out.write("				alert(\"이미 사용중인 닉네임입니다.\");\r\n");
      out.write("				$(\"#nickname\").select();\r\n");
      out.write("			}\r\n");
      out.write("		},\r\n");
      out.write("		error: function(jqXHR, textStatus, errorThrown){\r\n");
      out.write("			console.log(\"error : \" + jqXHR + \", \" \r\n");
      out.write("					+ textStatus + \", \" + errorThrown);\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	return false;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function moveMain() {\r\n");
      out.write("	location.href=\"index.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".topbar td {\n");
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write(".topbar td a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".admintopbar {\n");
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".admintopbar td {\n");
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write(".admintopbar td a {\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logintopbar {\n");
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	color: white;\n");
      out.write("	position: relative;\n");
      out.write("}\n");
      out.write(".logintopbar td {\n");
      out.write("	border: 2px solid #8181F7;\n");
      out.write("	background-color: #8181F7;\n");
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
      out.write(".mainbar input.mmbutton[type=\"button\"]:hover {\n");
      out.write("	text-decoration: none;\n");
      out.write("	width: 180px;\n");
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
      out.write(".adminmainbar input.admmbutton[type=\"button\"]:hover {\n");
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
      out.write(".logintopbar .dropbtn {\n");
      out.write("  background-color: #8181F7;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border: none;\n");
      out.write("  height: 25px;\n");
      out.write("}\n");
      out.write(".logintopbar .dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write(".logintopbar .dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #8181F7;\n");
      out.write("  min-width: 120px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("  left: -40px;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("	border: 2px solid #5858FA;\n");
      out.write("}\n");
      out.write(".logintopbar .dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".logintopbar .dropdown-content a:hover {\n");
      out.write("	background-color: #2E2EFE;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("}\n");
      out.write(".logintopbar .dropdown:hover .dropdown-content {display: block;}\n");
      out.write(".logintopbar .dropdown:hover .dropbtn {\n");
      out.write("	background-color: #2E2EFE;\n");
      out.write("	-webkit-border-radius: 10px;\n");
      out.write("}\n");
      out.write(".dropdown {\n");
      out.write("	height: 10px;\n");
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
      out.print(loginUser.getNickName());
      out.write("님</td>\n");
      out.write("			<td><a href=\"/bookjeok/ulogout\">로그아웃</td></tr>\n");
      out.write("		</table>\n");
      out.write("		");
 } else if (loginUser != null) { 
      out.write("\n");
      out.write("		<table class=\"logintopbar\">\n");
      out.write("			<tr><td><a href=\"/bookjeok/nlist\">공지사항</td>\n");
      out.write("				<td><a href=\"/bookjeok/alist\">1:1 문의</a></td>\n");
      out.write("				<td><div class=\"dropdown\">\n");
      out.write("					<button class=\"dropbtn\">");
      out.print(loginUser.getNickName());
      out.write("님</button>\n");
      out.write("						<div class=\"dropdown-content\">\n");
      out.write("								<a href=\"/bookjeok/umyprofile?userid=");
      out.print(loginUser.getUserId());
      out.write("\">마이페이지</a>\n");
      out.write("								<a href=\"/bookjeok/ulogout\">로그아웃</a>\n");
      out.write("						</div>\n");
      out.write("					</div></td></tr>\n");
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
      out.write("		<td><input type=\"button\" class=\"admmbutton\" value=\"상품관리\" onclick=\"javascript:location.href='/bookjeok/bklist.ad';\"></td>\n");
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
      out.write("\r\n");
      out.write("<div class=\"leftmenu\" align=\"center\">\r\n");
      out.write("<table>\r\n");
      out.write("	<tr><td><div class=\"textdiv\">마이페이지</div></td></tr>\r\n");
      out.write("	<tr><td><input type=\"button\" value=\"프로필 수정\" onclick=\"javascript:location.href='umyprofile?userid=");
      out.print( user.getUserId() );
      out.write("';\"></td></tr>\r\n");
      out.write("	<tr><td><input type=\"button\" value=\"회원 정보 수정\" onclick=\"javascript:location.href='umyuser?userid=");
      out.print( user.getUserId() );
      out.write("';\"></td></tr>\r\n");
      out.write("	<tr><td><input type=\"button\" value=\"회원 탈퇴\" onclick=\"javascript:location.href='uquitview?userid=");
      out.print( user.getUserId() );
      out.write("';\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"content\" align=\"center\">\r\n");
      out.write("<center>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"/bookjeok/uprofileupdate\" method=\"post\" onsubmit=\"return validate();\">\r\n");
      out.write("<input type=\"hidden\" name=\"userid\" value=\"");
      out.print( user.getUserId() );
      out.write("\">\r\n");
      out.write("<table class=\"outer\" align=\"center\" width=\"600\" cellspacing=\"5\" cellpadding=\"0\" style=\"color: white;\">\r\n");
      out.write("	<tr><th colspan=\"2\" style=\"font-size: 16pt;\">회원정보</th></tr>\r\n");
      out.write("	<tr><th width=\"120\">닉네임</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"nickname\" id=\"nickname\" value=\"");
      out.print( user.getNickName() );
      out.write("\"> &nbsp;\r\n");
      out.write("			<input type=\"button\" value=\"중복체크\" onclick=\"return dupNickCheck();\"></td></tr>\r\n");
      out.write("	<tr><th width=\"120\">이름</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"usernm\" id=\"usernm\" value=\"");
      out.print( user.getUserNm() );
      out.write("\"></td></tr>\r\n");
      out.write("	<tr><th width=\"120\">등 급</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"userrank\" value=\"");
      out.print( user.getUserRank() );
      out.write("\" readonly></td></tr>\r\n");
      out.write("	<tr><th width=\"120\">포인트</th>\r\n");
      out.write("		<td><input type=\"text\" name=\"point\" value=\"");
      out.print( user.getPoint() );
      out.write("\" readonly></td></tr>\r\n");
      out.write("	<tr><th width=\"120\">소 개</th>\r\n");
      out.write("		<td><textarea name=\"intro\" rows=\"3\" cols=\"48\">");
      out.print( user.getUserIntro() );
      out.write("</textarea></td></tr>\r\n");
      out.write("	<tr><th width=\"120\">선호 장르</th>\r\n");
      out.write("	<td>\r\n");
      out.write("		<table width=\"450\" style=\"color: black;\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"소설\" ");
      out.print( checked[0] );
      out.write("> 소설</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"경제/경영\" ");
      out.print( checked[1] );
      out.write("> 경제/경영</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"자기계발\" ");
      out.print( checked[2] );
      out.write("> 자기계발</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"시/에세이\" ");
      out.print( checked[3] );
      out.write("> 시/에세이</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"인문\" ");
      out.print( checked[4] );
      out.write("> 인문</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"국어/외국어\" ");
      out.print( checked[5] );
      out.write("> 국어/외국어</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"역사/풍속/신화\" ");
      out.print( checked[6] );
      out.write("> 역사/풍속/신화</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"사회/정치/법\" ");
      out.print( checked[7] );
      out.write("> 사회/정치/법</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"가정/생활/요리\" ");
      out.print( checked[8] );
      out.write("> 가정/생활/요리</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"여행/취미\" ");
      out.print( checked[9] );
      out.write("> 여행/취미</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"건강/의학\" ");
      out.print( checked[10] );
      out.write("> 건강/의학</td>\r\n");
      out.write("			<td><input type=\"checkbox\" name=\"preferred\" value=\"기타 장르\" ");
      out.print( checked[11] );
      out.write("> 기타 장르</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</td></tr>\r\n");
      out.write("	<tr height=\"35\"><th colspan=\"2\">\r\n");
      out.write("		<input type=\"submit\" value=\"수정하기\"> &nbsp; \r\n");
      out.write("		<input type=\"reset\" value=\"작성취소\"> &nbsp;\r\n");
      out.write("		<input type=\"button\" id=\"maingo\" value=\"메인으로\" onclick=\"return moveMain()\">\r\n");
      out.write("	</th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
