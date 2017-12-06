<!DOCTYPE html>
<%@page import="com.cwl.entity.Flower"%>
<%@page import="com.cwl.entity.Cart"%>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <title>一生只送一人</title>
    <link href="css/public.css" rel="stylesheet" type="text/css" />
    <link href="css/topAndFoot.css" rel="stylesheet" type="text/css" />
    <link href="css/detaildsFoot.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="css/detailds.css" type="text/css">
    <script src="js/jquery-1.11.3.js"></script>
    <script src="js/topAndFoot.js"></script>
    <script src="js/details.js"></script>
    <script src="js/jquery.fly.js"></script>
    <script src="js/istrueEntry.js"></script>
    <script src="js/addShoppingCart.js"></script>
</head>
<body>
<!--*******************************************Top开始***********************************-->
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
<!--*******************************************nav开始***********************************-->
<div id="navBox">
    <div id="allNav">
        <div id="nav">
            <ul class="fistUl">
                <li><a href="ShowFlowerServlet?op=selectFresh">鲜花玫瑰</a></li>
                <li><a href="ShowFlowerServlet?op=selectForever">永生玫瑰</a></li>
                <li><a href="ShowFlowerServlet?op=selectJew">玫瑰珠宝</a></li>
                <li><a href="birthday.html">生日推荐</a></li>
                <li><a href="#">love&nbsp;roseonly</a></li>
                <li><a href="#">诺誓世界</a></li>
                <li><a href="#">专卖店</a></li>
            </ul>
            <ul class="ulLastLi">
                <li class="entry"><a href="entry.html">登录</a><a href="register.html">注册</a></li>
                <li class="successEntry showOrHide">
                    <a href="javascript:;">欢迎您</a>
                   <!--  <a class="havaName" href="#"></a> -->
                    <a class="cancel" href="javascript:;">注销</a>
                </li>
                <li> <a href="ShoppingCart.jsp" class="lastA"></a></li>
            </ul>
        </div>
        <!--*********************************二级菜单开始**************************-->
        <div class="ejcdDiv">
                <!--*****************二级菜单第一个*******************-->
            <div class="secondNavOne">
                <ul class="second_allUl">
                    <li><a href="#">玫瑰长盒</a></li>
                    <li><a href="#">玫瑰手捧</a></li>
                </ul>
                <dl>
                    <dt><a href="#">系列</a></dt>
                    <dd><a href="#">经典持续</a></dd>
                    <dd><a href="#">恒久真爱</a></dd>
                    <dd><a href="#">LINE FRIENDS 专属</a></dd>
                    <dd><a href="#">爱在满怀</a></dd>
                    <dd><a href="#">星座经典</a></dd>
                    <dd><a href="#">love&nbsp;oseonly</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdOne.jpg"/></a>

            </div>
            <!--*****************二级菜单第二个*******************-->
            <div class="secondNavOne secondNavTwo">
                <ul class="second_allUl">
                    <li><a href="#">音乐玫瑰</a></li>
                    <li><a href="#">玫瑰原盒</a></li>
                    <li><a href="#">玫瑰方盒</a></li>
                    <li><a href="#">玫瑰心形盒</a></li>
                    <li><a href="#">玫瑰长盒</a></li>
                </ul>
                <dl>
                    <dt><a href="#">系列</a></dt>
                    <dd><a href="#">星座经典</a></dd>
                    <dd><a href="#">为爱而生</a></dd>
                    <dd><a href="#">经典持续</a></dd>
                    <dd><a href="#">满满的爱</a></dd>
                    <dd><a href="#">love&nbsp;oseonly</a></dd>
                </dl>
                <dl>
                    <dt> </dt>
                    <dd><a href="#">全世爱</a></dd>
                    <dd><a href="#">甜蜜心动</a></dd>
                    <dd><a href="#">一生一世</a></dd>
                    <dd><a href="#">诗意童话</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdTow.jpg"/></a>
            </div>
            <!--****************二级菜单*第三个*******************-->
            <div class="secondNavOne secondNavThree">
                <ul class="second_allUl">
                    <li><a href="#">项链</a></li>
                    <li><a href="#">手链</a></li>
                    <li><a href="#">首饰</a></li>
                    <li><a href="#">对戒</a></li>
                    <li><a href="#">套装</a></li>
                </ul>
                <dl>
                    <dt><a href="ShowFlowerServlet?op=selectJew">玫瑰宝珠</a></dt>
                    <dd><a href="#">玫瑰经典</a></dd>
                    <dd><a href="#">星座经典</a></dd>
                    <dd><a href="#">生辰石</a></dd>
                    <dd><a href="#">恒久经典</a></dd>
                    <dd><a href="#">全心全意</a></dd>
                    <dd><a href="#">时光无痕</a></dd>
                </dl>
                <dl>
                    <dt><a href="ShowFlowerServlet?op=selectDec">玫瑰饰品</a> </dt>
                    <dd><a href="#">幸运精灵</a></dd>
                    <dd><a href="#">时光之吻</a></dd>
                    <dd><a href="#">爱之赞礼</a></dd>
                    <dd><a href="#">全心全意</a></dd>
                    <dd><a href="#">心心相印</a></dd>
                    <dd><a href="#">love&nbsp;oseonly</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdThree.jpg"/></a>
            </div>
            <!--****************二级菜单*第四个*******************-->
            <div class="secondNavOne secondNavFour">
                <ul class="second_allUl">
                    <li><a href="#">音乐玫瑰</a></li>
                    <li><a href="#">永生玫瑰</a></li>
                    <li><a href="#">鲜花玫瑰</a></li>
                    <li><a href="#">生辰石</a></li>
                    <li><a href="#">十二生肖</a></li>
                    <li><a href="#">礼品</a></li>
                    <li><a href="#">男士礼品</a></li>
                    <li><a href="#">送亲人朋友</a></li>
                </ul>
                <dl>
                    <dt><a href="#">当月星座</a></dt>
                    <dd><a href="#">天枰座</a></dd>
                    <dd><a href="#">水瓶座</a></dd>
                    <dd><a href="#">射手座</a></dd>
                    <dd><a href="#">水瓶座</a></dd>
                    <dd><a href="#">白羊座</a></dd>
                    <dd><a href="#">双子座</a></dd>
                    <dd><a href="#">狮子座</a></dd>
                </dl>
                <dl>
                    <dt></dt>
                    <dd><a href="#">天蝎座</a></dd>
                    <dd><a href="#">摩羯座</a></dd>
                    <dd><a href="#">双鱼座</a></dd>
                    <dd><a href="#">金牛座</a></dd>
                    <dd><a href="#">巨蟹座</a></dd>
                    <dd><a href="#">处女座</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdFour.jpg"/></a>
            </div>
            <!--*****************二级菜单第五个*******************-->
            <div class="secondNavOne secondNavFive">
                <ul class="second_allUl">
                    <li><a href="#">鲜花</a></li>
                    <li><a href="#">精选长盒</a></li>
                </ul>
                <dl>
                    <dt><a href="#">永生花</a></dt>
                    <dd><a href="#">方盒</a></dd>
                    <dd><a href="#">圆盒</a></dd>
                    <dd><a href="#">六角盒</a></dd>
                </dl>
                <dl>
                    <dt><a href="#">饰品</a></dt>
                    <dd><a href="#">项链</a></dd>
                    <dd><a href="#">手链</a></dd>
                    <dd><a href="#">耳饰</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdFive.jpg"/></a>
            </div>
            <!--*****************二级菜单第六个*******************-->
            <div class="secondNavOne secondNavFive">
                <ul class="second_allUl">
                    <li><a href="#">品牌故事</a></li>
                    <li><a href="#">产品故事</a></li>
                    <li><a href="#">明星时刻</a></li>
                    <li><a href="#">真爱见证</a></li>
                    <li><a href="#">活动咨询</a></li>
                    <li><a href="#">诺誓百科</a></li>
                </ul>
                <dl>
                    <dt><a href="#">节日百科</a></dt>
                    <dd><a href="#">母亲节百科</a></dd>
                    <dd><a href="#">520百科</a></dd>
                    <dd><a href="#">圣诞节百科</a></dd>
                </dl>
                <a href="#"><img src="images/ejcdSix.jpg"/></a>
            </div>
        </div>
    </div>
</div>
<!--*********************************二级菜单结束**************************-->
<!--**********************************购买和加入购物车部分********************************-->
<div id="itemShowBox">
    <div class="itemShow">
        <div class="itemShow_left">
            <dl>
                <dt></dt>
                <%
                	Flower f=(Flower)request.getAttribute("flower");
                %>
                <dd>
                    <span class="itemShow_left_left"></span>
                    <span class="itemShow_left_center"><%=f.getFname() %></span>
                    <span class="itemShow_left_right"></span>
                </dd>
            </dl>
        </div>
        <div class="itemShow_center">
            <div class="small-wrapper">
                <img src="images/<%=f.getFimg1() %>" />
                <div class="filter"></div>
            </div>
            <div class="large-wrapper">
                <img class="img-show" src="images/<%=f.getFimg1() %>">
            </div>
        </div>
     
        <div class="itemShow_right">
        <form action="CartServlet" method="post">
	        <input type="hidden" class="Name" name="user" value="">
	        <input type="hidden" class="count" name="count" value="1">
	        <input type="hidden" class="Fid" name="fid" value="<%=f.getFid() %>">
       
            <p class="itemShow_right_p1">经典永续-<span><%=f.getFname() %></span></p>
            <p class="itemShow_right_p2">&nbsp;<%=f.getFnote() %>&nbsp;<span><%=f.getFid() %></span></p>
            <div class="itemShow_right_money"><%=f.getFprice()%></div>
            <!-- <div class="itemShow_right_color"><p>可选颜色</p><span></span><span></span><span></span><span></span><span></span><span></span></div> -->
            <div class="itemShow_right_num">
                <p class="itemShow_right_nump1">购买数量：</p>
                <a href="javascript:;"><span class="itemShow_right_cut">-</span></a>
                <p class="itemShow_right_nump2" >1</p>
                <a href="javascript:;"><span class="itemShow_right_add">+</span></a>
            </div>
            <div  class="itemShow_right_by">
            <button type="submit" style="float:left">加入购物车</button>
           </form>
           <form action="Buyservlet" method="post" >
	        <input type="hidden" class="Name" name="user" value="">
	        <input type="hidden" class="count" name="count" value="1">
	        <input type="hidden" class="Fid" name="fid" value="<%=f.getFid() %>">
       
            <button type="submit"  style="float:left">立即购买</button>
            </form>
            </div>
          
            <div class="itemShow_right_smallImg">
                <img class="changeImgStyle" src="images/<%=f.getFimg1() %>" />
                <img src="images/<%=f.getFimg2() %>" />
                <img src="images/<%=f.getFimg3() %>" />
                <img src="images/<%=f.getFimg4() %>" />
                <img src="images/<%=f.getFimg5() %>" />
            </div>
        </div>
    </div>
</div>
<!--*******************************************详细介绍部分**********************************-->
<div id="mainBox">
    <div class="main">
      <img src="images/<%=f.getFimgs() %>" />
    </div>
</div>
    <!--**********************************信息提示部分********************************-->
<div id="main_buttomBox">
    <div class="main_buttom">
        <img src="images/14744289812792308.jpg" />
    </div>
    <div class="carAndExc">
        <div class="carAndExc_left">
            <p class="carAndExc_left_p1">Caring Notes</p>
            <p class="carAndExc_left_p2">保养物语</p>
            <p class="carAndExc_left_p3">细心呵护保养，成就roseonly永恒之美</p>
            <p class="carAndExc_left_p4"><a href="#">点击查看详情</a></p>
        </div>
        <div class="carAndExc_right">
            <p class="carAndExc_left_p1">Exchange</p>
            <p class="carAndExc_left_p2">退换条例</p>
            <p class="carAndExc_left_p3">下单后有任何问题，请及时联系客服</p>
            <p class="carAndExc_left_p4"><a href="#">点击查看详情</a></p>
        </div>
    </div>
    <hr />
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