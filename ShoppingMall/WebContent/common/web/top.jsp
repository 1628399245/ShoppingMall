<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ page import = "cn.edu.zzti.entity.UserDO" %>
<!-- 首页系统分为三部分,"页头","导航"和"内容界面",该jsp为页头.  -->
<%
Object o = session.getAttribute("user");
if(o != null){
	UserDO user = (UserDO)o;
%>
前端商城欢迎您,<%=user.getUsername()%>
<% }else{
%>
<a href = "login.jsp">请登录</a>
<%
}
%>