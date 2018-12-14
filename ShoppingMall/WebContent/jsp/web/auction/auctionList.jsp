<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cn.edu.zzti.entity.AuctionDO"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<title>商品列表</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2" align="right">
				<!-- 引入页面信息,页头信息 --> <jsp:include page="/common/web/top.jsp" />
			</td>
		</tr>
		<tr valign="top">
			<td width="20%"><%@include file="/common/web/left.jsp"%>
				<!-- 引入共有页面信息,导航信息 --></td>
			<td align="center">
				<table border="1">
					<tr>
						<td>商品编号</td>
						<td>商品标题</td>
						<td>商品描述</td>
						<td>商品价格</td>
						<td></td>
					</tr>
					<%
						Object o = request.getAttribute("auctionList");
						if (o != null) {
							List<AuctionDO> list = (List<AuctionDO>) o;
							for (int i = 0; i < list.size(); i++) {
					%>
					<tr>
						<td><%=list.get(i).getId()%></td>
						<td><%=list.get(i).getTitle()%></td>
						<td><%=list.get(i).getDescription()%></td>
						<td><%=list.get(i).getPrice()%></td>
						<td><a
							href="<%=pageContext.getServletContext().getContextPath()%>/AddCartServlet?id=<%=list.get(i).getId()%>">加入购物车</a></td>
					</tr>
					<%
							}
						}
					%>

				</table>
			</td>
		</tr>
	</table>
</body>
</html>