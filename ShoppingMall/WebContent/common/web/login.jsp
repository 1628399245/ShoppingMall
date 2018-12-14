<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href = "<%=basePath %>">
<title>登陆界面</title>
</head>
<body>
	<%
	String error = (String)request.getAttribute("errorInfo");
	if(error != null){
		out.print("<font color ='red'>"+error+"</font><br>");
	}
	%>
	<form action = "LoginServlet" method = "post">
	用户名:<input type = "text" name = "username"/><br>
	密码:　<input type = "text" name = "password"/><br>
	<input type = "submit" value ="登录">
	</form>

</body>
</html>