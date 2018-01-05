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
    <title>Title</title>
    <link rel="stylesheet" href="../css/registered.css">
    <script src="../js/registered.js"></script>
</head>
<body>
<div class="biaotou">
    <div class="san">
        <a href="" class="xuexin">学信网</a><span>|</span>
        <a href="" class="xuexin">学信档案</a><span>|</span>
        <a href="" class="xuexin">阳光高考</a><span>|</span>
        <a href="" class="xuexin">研招网</a><span>|</span>
        <a href="" class="xuexin">全国征兵网</a>
    </div>
    <div class="beijingtu"></div>
    <div class="xia">
        <a href="" class="xuexin">首页</a><span>|</span>
        <a href="" class="xuexin">联系我们</a>
    </div>
</div>

<div class="wenti">
    <div class="wentou">
        <span class="huanying">欢迎注册学信网账号</span>
        <span class="yiyou">已有学信网账号</span>
        <a href="#" class="denglu">立即登录</a>
    </div>
    <div class="wenxia">
        注册成功后可以使用中国研究生招生信息网、阳光高考、学信档案、全国征兵网提供的服务。(
        <a href="#">什么是学信网账号？</a>　
        <a href="#">了解更多</a>)
    </div>
    <div class="sangchuan" id="sangchuan">
        <form action="" method="post" hidden>
            <input type="file" name="file" id="file">
        </form>
        <img src="#" alt=""
             id="imges" class="imges">
        <span class="dianji">点击上传照片</span><br>
        <span class="yaoqiu">要求1寸免冠照片</span>
    </div>

    <form action="/ServletRegistered" method="post" id="form">
        <div class="form">
            <div class="Demo Demo3">
                <span class="zhi">手机号</span>
                <span class="xin">*</span>
                <input type="text" name="Phonenumber"
                       class="intext gaizhu" id="Phonenumber"
                       onclick="Phonenumber1()"
                       onblur="Phonenumber2()"
                >
                <span class="yanzheng" id="Phonenumbertest"></span>
            </div>
            <div class="Demo Demo3">
                <span class="zhi">校验码</span>
                <span class="xin">*</span>
                <input type="text" class="xiaoyanma gaizhu" id="yan">
                <input class="mianfe" type="button" value="免费获取">
            </div>
            <div class="Demo Demo2">
                <span class="zhi">密码</span>
                <span class="xin">*</span>
                <input type="password" name="Password"
                       class="intext gaizhu" id="Password"
                       onclick="Passwordtest()"
                       onblur="Passwordtest2()"
                >
                <span class="yanzheng" id="Passwordyan"></span>
            </div>
            <div class="strengthMeter"></div>
            <div class="Demo">
                <span class="zhi">密码确认</span>
                <span class="xin">*</span>
                <input type="password" name="Password"
                       class="intext gaizhu" id="Passwoed2"
                       onclick="PasswordDemo()"
                       onblur="PasswordDemo2()"
                >
                <span class="yanzheng" id="Passwordque"></span>
            </div>
            <div class="Demo Demo2">
                <span class="zhi">姓名</span>
                <span class="xin">*</span>
                <input type="text" name="name" class="intext gaizhu"
                       id="name" onclick="xinming()"
                       onblur="xinming2()"
                >
                <span class="yanzheng" id="yanxingming"></span>
            </div>
            <div class="Demo">
                <span class="zhi">证件类型</span>
                <span class="xin">*</span>
                <select name="Typeofcertificate" id="" class="intext2">
                    <option value="居民身份证">居民身份证</option>
                    <option value="港澳台身份证">港澳台身份证</option>
                    <option value="华侨身份证(无身份证者可填写护照号)">华侨身份证(无身份证者可填写护照号)</option>
                    <option value="其他">其他</option>
                </select>
            </div>
            <div class="Demo">
                <span class="zhi">证件号码</span>
                <span class="xin">*</span>
                <input type="text" name="LicenseNumber"
                       onblur="LicenseNumber2()" class="intext gaizhu"
                       id="LicenseNumber" onclick="LicenseNumber1()"
                >
                <span class="yanzheng" id="LicenseNumbertest"></span>
            </div>

            <div class="Demo Demo4">
                <span class="zhi zhi2">安全邮箱</span>
                <input type="text" name="Mailbox" class="intext gaizhu"
                       id="Mailbox" onclick="Mailboxtest1()"
                       onblur="Mailboxtest2()"
                >
                <span class="yanzheng" id="yanMailbox"></span>
            </div>
            <div class="Demo">
                <span class="zhi zhi2">密保问题1</span>
                <select name="UserSecurityQuestion1" id="UserSecurityQuestion1" class="intext2">
                    <option value="请选择">请选择</option>
                    <option value="您母亲的姓名是?">您母亲的姓名是?</option>
                    <option value="您配偶的生日是?">您配偶的生日是?</option>
                    <option value="您的学号(或工号)是?">您的学号(或工号)是?</option>
                    <option value="您母亲的生日是?">您母亲的生日是?</option>
                    <option value="您高中班主任的名字是?">您高中班主任的名字是?</option>
                    <option value="您父亲的姓名是?">您父亲的姓名是?</option>
                    <option value="您小学班主任的名字是?">您小学班主任的名字是?</option>
                    <option value="您父亲的生日是?">您父亲的生日是?</option>
                    <option value="您配偶的姓名是?">您配偶的姓名是?</option>
                    <option value="您初中班主任的名字是?">您初中班主任的名字是?</option>
                    <option value="您最熟悉的童年好友名字是?">您最熟悉的童年好友名字是?</option>
                    <option value="您最熟悉的学校宿舍室友名字是?">您最熟悉的学校宿舍室友名字是?</option>
                    <option value="对您影响最大的人名字是?">对您影响最大的人名字是?</option>
                </select>
                <span class="daan">答案</span>
                <input type="text" name="Answer1" class="intext gaizhu">
            </div>
            <div class="Demo">
                <span class="zhi zhi2">密保问题2</span>
                <select name="UserSecurityQuestion2" id="UserSecurityQuestion2" class="intext2">
                    <option value="请选择">请选择</option>
                    <option value="您母亲的姓名是?">您母亲的姓名是?</option>
                    <option value="您配偶的生日是?">您配偶的生日是?</option>
                    <option value="您的学号(或工号)是?">您的学号(或工号)是?</option>
                    <option value="您母亲的生日是?">您母亲的生日是?</option>
                    <option value="您高中班主任的名字是?">您高中班主任的名字是?</option>
                    <option value="您父亲的姓名是?">您父亲的姓名是?</option>
                    <option value="您小学班主任的名字是?">您小学班主任的名字是?</option>
                    <option value="您父亲的生日是?">您父亲的生日是?</option>
                    <option value="您配偶的姓名是?">您配偶的姓名是?</option>
                    <option value="您初中班主任的名字是?">您初中班主任的名字是?</option>
                    <option value="您最熟悉的童年好友名字是?">您最熟悉的童年好友名字是?</option>
                    <option value="您最熟悉的学校宿舍室友名字是?">您最熟悉的学校宿舍室友名字是?</option>
                    <option value="对您影响最大的人名字是?">对您影响最大的人名字是?</option>
                </select>
                <span class="daan">答案</span>
                <input type="text" name="Answer2" class="intext gaizhu">
            </div>
            <div class="Demo">
                <span class="zhi zhi2">密保问题3</span>
                <select name="UserSecurityQuestion3" id="UserSecurityQuestion3" class="intext2">
                    <option value="请选择">请选择</option>
                    <option value="您母亲的姓名是?">您母亲的姓名是?</option>
                    <option value="您配偶的生日是?">您配偶的生日是?</option>
                    <option value="您的学号(或工号)是?">您的学号(或工号)是?</option>
                    <option value="您母亲的生日是?">您母亲的生日是?</option>
                    <option value="您高中班主任的名字是?">您高中班主任的名字是?</option>
                    <option value="您父亲的姓名是?">您父亲的姓名是?</option>
                    <option value="您小学班主任的名字是?">您小学班主任的名字是?</option>
                    <option value="您父亲的生日是?">您父亲的生日是?</option>
                    <option value="您配偶的姓名是?">您配偶的姓名是?</option>
                    <option value="您初中班主任的名字是?">您初中班主任的名字是?</option>
                    <option value="您最熟悉的童年好友名字是?">您最熟悉的童年好友名字是?</option>
                    <option value="您最熟悉的学校宿舍室友名字是?">您最熟悉的学校宿舍室友名字是?</option>
                    <option value="对您影响最大的人名字是?">对您影响最大的人名字是?</option>
                </select>
                <span class="daan">答案</span>
                <input type="text" name="Answer3" class="intext gaizhu">
            </div>
            <div class="wendidi">
                <div class="tongyi">
                    <input type="checkbox" id="checkbox1"
                           onclick="checkbox()" checked>
                    <span class="tongyi">我已阅读并同意</span><a href="#" class="fuwu gaizhu">服务条款</a>
                </div>

                <div class="wenzhang">
                    <input type="submit" value="立即注册" class="zhuce" form="form">
                    <a href="">忘记密码?</a>|
                    <a href="">忘记用户名?</a>
                </div>
            </div>
        </div>
    </form>
</div>

<div class="dididi">
    <div class="wangyedi">
        <span class="nian">Copyright 2003-2017</span>
        <a href="" class="diclass">学信网</a>
        <span class="zheng">京ICP证030485号</span>
    </div>
</div>
</body>
</html>
