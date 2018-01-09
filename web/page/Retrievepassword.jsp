<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 18-1-5
  Time: 下午2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<a href="../images/topLogo_chsi.png"></a>
<meta charset="UTF-8">
<title>找回密码_学信网</title>
<link rel="stylesheet" href="../css/Retrievepassword.css">
<link rel="icon" sizes="any" href="../imges/favicon.ico">
<script src="../js/Retrievepassword.js"></script>
</head>
<body>

<div class="tou">
    <div class="tu"></div>
</div>
<div class="atou">
    <a href="../page/registered.jsp">用户注册</a>
    <span>|</span>
    <a href="">登录</a>
    <span>|</span>
    <a href="../html/Retrievebangzhu.html">帮助</a>
</div>
<div class="regleft1">
<div class="regleftBG">
    <div class="zuo">
        <div class="tu2"></div>
        <div class="shiming zhuche">实名注册</div>
        <div class="shiming"><a href="">注册账号</a></div>
        <div class="shiming"><a href="">找回密码</a></div>
        <div class="shiming"><a href="">实名信息填写</a></div>
        <div class="shiming"><a href="">系统登录</a></div>
        <div class="shiming"><a href="../html/Retrievebangzhu.html">帮助中心</a></div>
    </div>
</div>
<div class="regleftBG2">
    <div class="zhong">
        <div class="zhongsang">
            学信网账号 - 找回密码
        </div>
        <form action="/Servletpassword" method="post" id="form1">
            <div class="zhongjian">
                <div class="password">
                    <span class="yonghuming">用户名</span>
                    <span class="xin">*</span>
                    <input type="text" id="password" name="password" class="input"
                           onclick="password1()" onblur="password2()"
                    >
                    <span class="sapn" id="password1"></span>
                </div>
                <div class="yanzheng">
                    <div class="captchBlock" id="captchBlock" style="display: none">
                        <span class="x" onclick="functt()">×</span>
                        <div class="zhengma" id="code" onclick="createCode()"></div>
                        <div class="kanbuqing" onclick="createCode()">看不清,换一张</div>
                    </div>
                    <span class="yanzhengma">验证码</span>
                    <span class="xin">*</span>
                    <input type="text" id="yanzhengma" class="input"
                           onclick="yanzhengma1()" onblur="yanzhengma2()"
                    >
                    <span class="sapn" id="span3"></span>
                </div>
                <a href="../page/Retrieveusername.jsp" class="wpassword">忘记用户名?</a>

            </div>
        </form>
        <input type="submit" class="sumbit" id="btn" value="确定" onclick="login()">
    </div>
    </div>
</div>
<div class="dididi">
    <div class="wangyedi">
        <span class="nian">Copyright 2003-2018</span>
        <a href="" class="diclass">学信网</a>
        <span>京ICP证030485号</span>
    </div>
</div>
</body>
</html>
