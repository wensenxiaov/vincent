/**
 * Created by Administrator on 2016/10/5.
 */
$(function(){
    $(window).load(function(){
       if(window.localStorage.getItem("a")=="true"){
           haveLogin();
       }else{
           notLogin();
       }
    });
   //登陆过
    function haveLogin(){
        $(".entry").addClass("showOrHide").next().removeClass("showOrHide");
        $(".havaName").html(window.localStorage.getItem("haveName"));
        $(".havaName").attr("href","http://localhost:8080/FlowerShop/OrderServlet?op=selectByName&user="+window.localStorage.getItem("haveName"));
        $(".top_right_lastA").attr("href","http://localhost:8080/FlowerShop/CartServlet?op=select&user="+window.localStorage.getItem("haveName"));
        $(".Name").val(window.localStorage.getItem("haveName"));
    }
    //没登陆过
    function notLogin() {
        $(".successEntry").addClass("showOrHide").prev().removeClass("showOrHide");
        $(".top_right_lastA").attr("href","http://localhost:8080/FlowerShop/entry.html");
    }
    //点击注销
    $(".cancel").click(function(){
        window.localStorage.a=false;
        window.localStorage.removeItem("haveName");
        notLogin();
    });
});
