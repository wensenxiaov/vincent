<%@page import="com.cwl.entity.Flower"%>
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
	<form action="FlowerServlet" method="post">
	<input type="hidden" name="op" value="update2">
	<%
		Flower f=(Flower)request.getAttribute("flower");
	%>
		<table class="table  table-hover" align="center">
			<tr>
				<td rowspan="12"><img src="images/<%=f.getFimg1()%>"></td>
				<td></td>
			</tr>
			<tr>
				<td>序号</td>
				<td><input value="<%=f.getFid() %>" name="fid"></td>
			</tr>
			<tr>
				<td>名称</td>
				<td><input value="<%=f.getFname() %>" name="fname"></td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input value="<%=f.getFprice() %>" name="fprice"></td>
			</tr>
			<tr>
				<td>系列</td>
				<td><input value="<%=f.getFgroup() %>" name="fgroup"></td>
			</tr>
			<tr>
				<td>库存</td>
				<td><input value="<%=f.getFnum() %>" name="fnum"></td>
			</tr>
			<tr>
				<td>简介</td>
				<td><input value="<%=f.getFnote() %>" name="fnote"></td>
			</tr>
			<tr>
				<td>类型</td>
				<td><select name="ftid">						
					<option value="1">鲜花玫瑰</option>
					<option value="2">永生玫瑰</option>
					<option value="3">玫瑰珠宝</option>
					<option value="4">玫瑰饰品</option>
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