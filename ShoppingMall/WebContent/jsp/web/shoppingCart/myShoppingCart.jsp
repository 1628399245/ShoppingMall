<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cn.edu.zzti.entity.CartDO"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的购物车</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2" align="right"><jsp:include
					page="/common/web/top.jsp" /></td>
		</tr>
		<tr valign="top">
			<td width="20"><%@include file="/common/web/left.jsp"%>
			</td>
			<td align="center">
				<form action="" method="post">
					<table border="1">
						<tr>
							<td colspan="7" align="center">我的购物车</td>
						</tr>
						<tr>
							<td></td>
							<td>商品编号</td>
							<td>商品名称</td>
							<td>商品数量</td>
							<td>商品单价</td>
							<td>商品总价</td>
							<td>操作列表</td>
						</tr>
						<%
							Object o = request.getAttribute("cartList");
							if (o != null) {
								List<CartDO> list = (List<CartDO>) o;
								for (int i = 0; i < list.size(); i++) {
						%>
						<tr>
							<td><input type="checkbox" name="slctedOrder"
								value="<%=list.get(i).getAuctionDO().getId()%>"></td>
							<td><%=list.get(i).getAuctionDO().getId()%></td>
							<td><%=list.get(i).getAuctionDO().getTitle()%></td>
							<td><%=list.get(i).getNumber()%>
							<td><%=list.get(i).getAuctionDO().getPrice()%></td>
							<td><%=list.get(i).getTotlePrice()%>
							<td>
								<!-- <a href="<%=pageContext.getServletContext().getContextPath()%> /web/RemoveCartServlet?id=
								<%=list.get(i).getAuctionDO().getId()%>">删除此商品</a> --> <a
								href="<%=pageContext.getServletContext().getContextPath()%>
								/RemoveCartServlet?id=
								<%=list.get(i).getAuctionDO().getId()%>">删除此商品</a>
							</td>
						</tr>
						<%
							}
							}
						%>
						<tr>
							<td colspan="7" align="right">
								<!--  <a href="<%=pageContext.getServletContext().getContextPath()%>/web/getAllAuction">继续购物</a></td> -->
								<a
								href="<%=pageContext.getServletContext().getContextPath()%>/GetAllAuctionServlet">继续购物</a>
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>