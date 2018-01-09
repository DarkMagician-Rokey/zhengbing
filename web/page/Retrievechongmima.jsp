<%--
  Created by IntelliJ IDEA.
  User: ttc
  Date: 18-1-5
  Time: 下午2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>重置密码_学信网</title>
    <link rel="stylesheet" href="../css/Retrievechongmima.css">
    <link rel="icon" sizes="any" href="../images/favicon.ico">
    <script src="../js/Retrievechongmima.js"></script>

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
            学信网账号 - 重置密码
        </div>
        <form action="/Servletchongmima" method="post" id="form1">
            <input type="text" name="userpassword"
                   value="${userpassword}"
                   hidden>
            <div class="zhongjian">
                <div class="password">
                    <span class="yonghuming">密码</span>
                    <span class="xin">*</span>
                    <input type="password" id="password" name="password" class="input"
                           onclick="Passwordtest()" onblur="Passwordtest2()"
                    >
                    <span class="sapn" id="span1"></span>
                </div>
                <div class="xingming">
                    <span class="yonghuming">密码确认</span>
                    <span class="xin">*</span>
                    <input type="password" id="password2" class="input"
                           onclick="PasswordDemo()"
                           onblur="PasswordDemo2()"
                    >
                    <span class="sapn" id="span2"></span>
                </div>

            </div>
        </form>
        <input type="submit" class="sumbit" id="sumbit"
               value="确定"
               onclick="login()" >
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
