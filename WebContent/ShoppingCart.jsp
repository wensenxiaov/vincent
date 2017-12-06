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
            <h3>我的购物车</h3>
           
        </div>
        <div class="shoppingCart_center">
            <table Cellspacing="0">
                <tbody>
                   <tr class="shoppingCart_center_first_tr">
                        <td class="shoppingCart_center_td1">序号</td>
                        <td class="shoppingCart_center_td2">品牌</td>
                        <td class="shoppingCart_center_td3">商品名称</td>
                        <td class="shoppingCart_center_td4">单价</td>
                        <td class="shoppingCart_center_td5">数量</td>
                        <td class="shoppingCart_center_td6">操作</td>
                    </tr>
                   <%
               

	               	List<Cart> list=(List<Cart>)session.getAttribute("list");
	
	           		FlowerService fs=new FlowerServiceImp();
	               	
	       			double sum=0;
	       			String clear=null;
	       			for(Cart c: list){
	               
                	Flower f=fs.selectFlower(c.getCfid());
                	int price=Integer.parseInt(f.getFprice());
                		
                   %>
                   
                     <tr class="shoppingCart_center_second_tr">
                             <td class="shoppingCart_center_td1"><%=f.getFid() %></td>
                             <td class="shoppingCart_center_td2"><%=f.getFbrand() %></td>
                             <td class="shoppingCart_center_td3" align="center"><img src="images/<%=f.getFimg1() %>"><span><%=f.getFname() %>&nbsp;<%=f.getFnote() %>&nbsp;<%=f.getFstyle() %>&nbsp;</span></td>
                             <td class="shoppingCart_center_td4"><%=price*c.getCcount()  %></td>
                             <td class="shoppingCart_center_td5"><input value="<%=c.getCcount() %>"></td>
                             <td class="shoppingCart_center_td6"><a href="CartServlet?op=deleteCart&cfid=<%=c.getCfid() %>&user=<%=c.getCname() %>">删除</a></td>
                        </tr>
                    
                     <%
                     	sum += (price*c.getCcount());
                     	clear=c.getCname();
                     %>
                      <%
                    	}
                     %>
                </tbody>
            </table> 
            <p class="allMoney"><span>元</span><i><%=sum %></i><span>合计：</span></p>
           <a href ="javascript:if(confirm('确实要清空购物车吗?'))location='CartServlet?op=delete&cname=<%=clear %>'">清空购物车</a>
           
            <div class="byOrEctBy"><a href="order.jsp"><i>立刻结算</i></a><a href="MainPageServlet"><p>继续购买</p></a></div>
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