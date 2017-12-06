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
	<form action="InsertFlowerServlet" enctype="multipart/form-data" method="post">
	
		<table class="table  table-hover" align="center">
			
			<tr>
				<td align="center">序号</td>
				<td><input  name="fid"></td>
			</tr>
			<tr>
				<td align="center">名称</td>
				<td><input name="fname"></td>
			</tr>
			<tr>
				<td align="center">价格</td>
				<td><input  name="fprice"></td>
			</tr>
			<tr>
				<td align="center">类型</td>
				<td><select name="ftid">						
					<option value="1">鲜花玫瑰</option>
					<option value="2">永生玫瑰</option>
					<option value="3">玫瑰珠宝</option>
					<option value="4">玫瑰饰品</option>
				</select></td>
			</tr>
			<tr>
				<td align="center">系列</td>
				<td><input  name="fgroup"></td>
			</tr>
			<tr>
				<td align="center">颜色</td>
				<td><input  name="fcolor"></td>
			</tr>
			<tr>
				<td align="center">样式</td>
				<td><input  name="fstyle"></td>
			</tr>
			<tr>
				<td align="center">简介</td>
				<td><input  name="fnote"></td>
			</tr>
			<tr>
				<td align="center">库存</td>
				<td><input  name="fnum"></td>
			</tr>
			<tr>
				<td align="center">品牌</td>
				<td><input  name="fbrand"></td>
			</tr>
			
			<tr>
				<td align="center">类型参数</td>
				<td><input  name="ftype"></td>
			</tr>
			<tr>
				<td align="center">详情图</td>
				<td><input  name="fimgs" type="file"></td>
			</tr>
			<tr>
				<td align="center">图一</td>
				<td><input  name="fimg1" type="file"></td>
			</tr>
			<tr>
				<td align="center">图二</td>
				<td><input  name="fimg2" type="file"></td>
			</tr>
			<tr>
				<td align="center">图三</td>
				<td><input  name="fimg3" type="file"></td>
			</tr>
			<tr>
				<td align="center">图四</td>
				<td><input  name="fimg4" type="file"></td>
			</tr>
			<tr>
				<td align="center">图五</td>
				<td><input  name="fimg5" type="file"></td>
			</tr>
			<tr>
				<td  align="center"><input type="reset" value="重置"></td>
				<td  align="center"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>