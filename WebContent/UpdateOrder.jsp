<%@page import="com.cwl.entity.Order"%>
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
</head>
<body>
	<form action="OrderServlet" method="post">
	<input type="hidden" name="op" value="updatemes">
	<%
		Order o=(Order)request.getAttribute("order");
	%>
		<table class="table  table-hover" align="center">
			<tr>
				<td>序号</td>
				<td><input value="<%=o.getOdid() %>" name="odid"></td>
			</tr>
			<tr>
				<td>订单时间</td>
				<td><input value="<%=o.getOdate() %>" name=odate"></td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input value="<%=o.getOprice() %>" name="oprice"></td>
			</tr>
				<td>状态</td>
				<td><select name="omood">						
					<option value="待发货">待发货</option>
					<option value="已发货">已发货</option>
					<option value="申请退货">申请退货</option>
					<option value="已退货">已退货</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="reset" value="重置"></td>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>