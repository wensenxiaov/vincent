<%@page import="com.cwl.entity.Order"%>
<%@page import="com.cwl.serviceImp.FlowerServiceImp"%>
<%@page import="com.cwl.service.FlowerService"%>
<%@page import="java.util.List"%>
<%@page import="com.cwl.entity.Flower"%>
<%@page import="com.cwl.entity.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.cwl.entity.Cart"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>一生只送一人</title>
    <link href="css/public.css" rel="stylesheet" type="text/css" />
    <link href="css/topAndFoot.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.11.3.js"></script>
    <link rel="stylesheet" href="css/shoppingCart.css">
    <script src="js/istrueEntry.js"></script>
    <script src="js/shoppingCart.js"></script>
</head>
<body>
<!--***************************** **************Top开始***********************************-->
<div id="topBox"> 
    <div id="top">
        <img class="top_child_img" src="images/logo_03.gif"/>
        <div class="top_text">roseonly一生只送一人</div>
        <ul class="top_right">
            <li class="entry"><a href="entry.html">登录</a><a href="register.html">注册</a></li>
            <li class="successEntry showOrHide">
                <a href="javascript:;">欢迎您</a>
                <a class="havaName" href="#"></a>
                <a class="cancel" href="javascript:;">注销</a>
            </li>
             <li><a href="jsp/shoppingCart.jsp" class="top_right_lastA" >~`_`~<span></span></a> </li>
          </ul>
    </div>
</div>
<!--*******************************************Top结束***********************************-->
<!--*******************************************bigLogo开始***********************************-->
<div id="bigLogoBox">
    <div id="bigLogo"><a href="MainPageServlet">roseonly.</a></div>
</div>
<!--*******************************************bigLogo结束***********************************-->
<!--********************************************购物车页面**********************************-->
<div id="shoppingCartBox">
    <div class="shoppingCart">
        <div class="shoppingCart_top">
            <h3>我的订单</h3>
           
        </div>
        <div class="shoppingCart_center">
            <table Cellspacing="0">
                <tbody>
                   <tr class="shoppingCart_center_first_tr">
                        <td class="shoppingCart_center_td1">订单时间</td>
                        <td class="shoppingCart_center_td2">品牌</td>
                        <td class="shoppingCart_center_td3">商品名称</td>
                        <td class="shoppingCart_center_td5">总价</td>
                        <td class="shoppingCart_center_td6">状态</td>
                    </tr>
                   <%
               

	               	List<Order> list=(List<Order>)request.getAttribute("list");
	
	           		FlowerService fs=new FlowerServiceImp();
	               	
	       			double sum=0;
	       			for(Order o: list){
	               
                	Flower f=fs.selectFlower(o.getOid());
                		
                   %>
                   
                     <tr class="shoppingCart_center_second_tr">
                             <td class="shoppingCart_center_td1"><%=o.getOdate() %></td>
                             <td class="shoppingCart_center_td2"><%=f.getFbrand() %></td>
                             <td class="shoppingCart_center_td3" align="center"><img src="images/<%=f.getFimg1() %>"><span><%=f.getFname() %>&nbsp;<%=f.getFnote() %>&nbsp;<%=f.getFstyle() %>&nbsp;</span></td>
                             <td class="shoppingCart_center_td5"><%=o.getOprice() %></td>
                             <td class="shoppingCart_center_td6"><%=o.getOmood() %></td>
                        </tr>
                    
                     <%
                     	sum += (o.getOprice());
                     %>
                      <%
                    	}
                     %>
                </tbody>
            </table> 
            <p class="allMoney"><span>元</span><i><%=sum %></i><span>合计：</span></p>
           
           
           
        </div>
        <div class="shoppingCart_bottom">
            <h2>订单帮助</h2>
            <p>热线电话：400-1314-520</p>
            <p>客服邮箱:service@roseonly.com  客服工作时间：周一至周日9:00-21:00</p>
            <p>如果您在下单过程中遇到问题，请与我们联系。因为鲜花商品对配送时效有特殊要求，订购后请随时登录查询物流状态。</p>
        </div>
    </div>
</div>
<!--******************************底部******************************************-->
<div id="food_topBox">
    <div class="foot_top">
        <div class="foot_top_left">
            <p>.roseonly</p>
            <div>
                <span>关注我们</span>
                <a href="#"><img src="images/xlwb.png" /></a>
                <img src="images/wxtb.png" />
            </div>
        </div>
        <div class="foot_top_center">
            <dl>
                <dt>新手指南</dt>
                <dd><a href="#">购物流程</a></dd>
                <dd><a href="#">支付方式</a></dd>
                <dd><a href="#">常见问题</a></dd>
            </dl>
            <dl>
                <dt>售后服务</dt>
                <dd><a href="#">退款说明</a></dd>
                <dd><a href="#">保养物语</a></dd>
            </dl>
            <dl>
                <dt>物流配送</dt>
                <dd><a href="#">配送方式</a></dd>
                <dd><a href="#">配送服务</a></dd>
            </dl>
            <dl>
                <dt>关于我们</dt>
                <dd><a href="#">联系我们</a></dd>
                <dd><a href="#">加入我们</a></dd>
            </dl>
        </div>
        <div class="foot_top_right">
            <img src="images/foodTopRight.jpg" />
        </div>
        <img src="images/QR-big.jpg" title="这是微信二维码图" />
    </div>
</div>
<div id="foot_centerBox">
    <div class="foot_center">
        <img src="images/phone.jpg"/>
    </div>
</div>
<div id="foot_buttomBox">
    <div class="foot_buttom">
        京ICP备13007738号 京公网安备11010502023922 www.roseonly.com.cn；诺誓（北京）商业股份有限公司
    </div>
</div>
</body>
</html>