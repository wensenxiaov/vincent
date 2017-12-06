<%@page import="com.cwl.entity.Flower"%>
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
				<th style="text-align: center">序号</th>
				<th style="text-align: center">名称</th>
				<th style="text-align: center">价格</th>
				<th style="text-align: center">类型</th>
				<th style="text-align: center">系列</th>
				<th style="text-align: center">颜色</th>
				<th style="text-align: center">样式</th>
				<th style="text-align: center">库存</th>
				<th style="text-align: center">简介</th>
				<th style="text-align: center">品牌</th>
				<th style="text-align: center">详图</th>
				<th colspan="2">操作</th>
			</tr>
			
			<%
			List<Flower> list=(List<Flower>)request.getAttribute("list");
				
				int i=1;
				for(Flower f : list){
			%>
			<tr class="danger" style="text-align : center">
				<td style="vertical-align: middle"><%=i %></td>
				<td style="vertical-align: middle"><%=f.getFname() %></td>
				<td style="vertical-align: middle"><%=f.getFprice() %></td>
				<td style="vertical-align: middle"><%=f.getFtype().getTname()%></td>
				<td style="vertical-align: middle"><%=f.getFgroup() %></td>
				<td style="vertical-align: middle"><%=f.getFcolor() %></td>
				<td style="vertical-align: middle"><%=f.getFstyle() %></td>
				<td style="vertical-align: middle"><%=f.getFnum() %></td>
				<td style="vertical-align: middle"><%=f.getFnote() %></td>
				<td style="vertical-align: middle"><%=f.getFbrand() %></td>
				<th style="vertical-align: middle ; text-align:center"><img src="images/<%=f.getFimg1() %>" style="width : 20% ;" align="center" ></th>	
				<td style="vertical-align: middle"><a href="FlowerServlet?op=delete&fid=<%=f.getFid() %>"><input type="button" value="删除" ></a></td>
				<td style="vertical-align: middle"><a href="FlowerServlet?op=update&fid=<%=f.getFid() %>"><input type="button" value="修改" ></a></td>
			</tr>
			<%
				i++;}
			%>
			<tr >
				<td colspan="15"  align="center">
				<a href="InsertFlower.jsp"><input type="button" value="增加产品" ></a>
				
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>