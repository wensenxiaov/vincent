<%@page import="com.cwl.entity.Client"%>
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
		<table class="table  table-hover table-striped" >
			<tr>
				<th style="text-align: center">用户序号</th>
				<th style="text-align: center">用户姓名</th>
				<th style="text-align: center">用户电话</th>
				<th style="text-align: center">用户邮箱</th>
			</tr>
			
			<%
			List<Client> list=(List<Client>)request.getAttribute("list");
				
				int i=1;
				for(Client c : list){
			%>
			<tr class="danger">
				<td style="text-align: center"><%=i %></td>
				<td style="text-align: center"><%=c.getCname() %></td>
				<td style="text-align: center"><%=c.getCtel() %></td>
				<td style="text-align: center"><%=c.getCmail()%></td>
				<td style="text-align: center"><a href="ClientServlet?op=delete&cid=<%=c.getCid() %>"><input type="button" value="删除" ></a></td>
			</tr>
			<%
				i++;}
			%>
		</table>
	</form>
</body>
</html>