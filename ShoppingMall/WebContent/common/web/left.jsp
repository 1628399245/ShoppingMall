<%@ page language = "java" import = "java.util.*" pageEncoding="UTF-8" %>
<!-- 首页系统分为三部分,"页头","导航"和"内容界面",该jspf文件为导航.  -->
<table>
<tr><td><a href = "<%=pageContext.getServletContext().getContextPath() %>/GetPersonalServlet">个人中心</a></td></tr>
<tr><td><a href = "<%=pageContext.getServletContext().getContextPath() %>/GetAllAuctionServlet">全部商品</a></td></tr>
<tr><td><a href = "<%=pageContext.getServletContext().getContextPath() %>/CartListServlet">我的购物车</a></td></tr>
</table>