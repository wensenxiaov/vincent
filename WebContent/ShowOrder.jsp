<%@page import="com.cwl.entity.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="//apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
</style>
</head>
<body>
	<form>
		<table class="table  table-hover"  >
			<tr align="center">
				<th style="text-align: center">订单编码</th>
				<th style="text-align: center">发件人</th>
				<th style="text-align: center">收件人电话</th>
				<th style="text-align: center">收件人地址</th>
				<th style="text-align: center">收件人邮编</th>
				<th style="text-align: center">商品状态</th>
				<th style="text-align: center">商品价格</th>
				<th style="text-align: center">订单时间</th>
				<th style="text-align: center">收件人姓名</th>
				<th colspan="2">操作</th>
			</tr>
			
			<%
			List<Order> list=(List<Order>)request.getAttribute("list");
				
				int i=1;
				for(Order o: list){
			%>
			<tr class="danger" style="text-align : center">
				<td style="text-align: center"><%=o.getOdid() %></td>
				<td style="text-align: center"><%=o.getOname() %></td>
				<td style="text-align: center"><%=o.getOtel() %></td>
				<td style="text-align: center"><%=o.getOaddr()%></td>
				<td style="text-align: center"><%=o.getOaddr() %></td>
				<td style="text-align: center"><%=o.getOmood() %></td>
				<td style="text-align: center"><%=o.getOprice() %></td>
				<td style="text-align: center"><%=o.getOdate()%></td>
				<td style="text-align: center"><%=o.getOrname() %></td>
		<td style="vertical-align: middle"><a href="OrderServlet?op=update&odid=<%=o.getOdid() %>"><input type="button" value="修改" ></a></td>
			</tr>
			<%
				i++;}
			%>
		</table>
	</form>
</body>
</html>