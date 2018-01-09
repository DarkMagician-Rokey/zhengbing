<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 17-12-28
  Time: 上午11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆——全国征兵网</title>
    <link rel="stylesheet" href="../css/denglu.css">
    <script src="../js/denglu.js"></script>
</head>
<body>
<div class="zhengt">
    <div class="head">
        <div class="zitou">
            <a href="../html/shouye.html"> <strong>全国征兵网</strong></a>
        </div>
        <span class="youce00">
          <a href="../page/Home.jsp">全国征兵网首页|</a>
          <a href="">用户须知|</a>
          <a href="">联系我们</a>
      </span>
    </div>
    <div class="zhongjian000">
        <img src="../images/1002.jpg" alt="" no-repeat center>
        <span class="liucheng">
         <span class="gxbmlc">
             <div class="nb001" onclick="dl1()" id="dl1"><strong>男兵报名流程</strong>
             </div>
             <!--1.点男兵报名流程字体变绿色 出现下划线 显示1-7的流程 女兵报名流程字体为黑色 鼠标放在上面
             不点击仍为绿色-->
             <div class="nv002" onclick="dl2()" id="dl2"><strong>女兵报名流程</strong>
             </div>
             <!--<div  class="zz03" onclick="dl3()" id="dl3"><strong>直招士官报名流程</strong>-->
             <!--</div>-->
         </span>

     </span>
    </div>

    <div class="nblc">
        <div class="">
            <div class="wsbm" onmouseenter="dl4()" onmouseleave="dl5()">1.网上报名</div>
            <!--(1)鼠标放在指定位置显示-->
            <div class="cscj" onmouseenter="dl6()" onmouseleave="dl7()">2.初审初检</div>
            <div class="tjzs" id="tj03" onmouseenter="dl8()" onmouseleave="dl9()">3.体检政审</div>
            <div class="zfdc" id="zf04" onmouseenter="dl20()" onmouseleave="dl21()">4.走访调查</div>
            <br>
            <div class="pzrw" id="pz07" onmouseenter="dl26()" onmouseleave="dl27()" >7.批准入伍</div>
            <div class="zbgs" id="zb06"onmouseenter="dl24()" onmouseleave="dl25()">6.张榜公示</div>
            <div class="ydxb" onmouseenter="dl22()" onmouseleave="dl23()">5.预定新兵</div>
        </div>
    </div>
    <img id="png1" class="bm001" src="../images/报名.png" alt="">
    <!--(2)-->
    <img id="png2" class="cs002" src="../images/初审.png" alt="">
    <img id="png3" class="tj003" src="../images/体检.png" alt="">
    <img id="png4" class="zf004" src="../images/走访排查.png" alt="">
    <img id="png5" class="yd005" src="../images/预定新兵.png" alt="">
    <img id="png6" class="zb006" src="../images/张榜公示.png" alt="">
    <img id="png7" class="pz007" src="../images/批准入伍.png" alt="">

    <div class="denglu001">
     <span class="denglu002">
         <div class="dl006">登录</div>
         <div class="qsy">(请使用<a href="">学信网账号</a>进行登录)</div>
     </span>
        <div class="x01"> <hr></div>

        <form action="/ServletLogin" method="post" id="form">
        <div class="shouji">
            <input type="text" placeholder="手机号/身份证号/邮箱" name="email">
        </div>
        <div class="mima">
            <input type="password" placeholder="密码">
        </div>
        </form>

        <div class="zhyhm">
            <a href="../page/Retrieveusername.jsp">找回用户名</a>
        </div>
        <div class="zhmm">
            <a href="../page/Retrievepassword.jsp">找回密码</a>
        </div>
        <div class="denglu004"  onclick="login()"><strong>登录</strong></div>
        <div class="zhuce004" onclick="register()">注册</div>
        <input type="submit" id="submit" form="form" hidden>
    </div>
</div>
</body>
</html>
