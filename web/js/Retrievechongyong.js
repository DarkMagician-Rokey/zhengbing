/**
 * Created by ttc on 18-1-5.
 */
function Passwordtest() {
    document.getElementById("span1").innerHTML = "请填写手机号";
}
function Passwordtest2() {
    var Password = document.getElementById("password").value;
    var zhi;

    if (Password == "") {
        zhi = "手机号不能为空";
    } else if (!(/^1\d{10}$/.test(Password))) {
        zhi = "手机号长度为11位数字";
    }else if (!(/^1[34578]\d{9}$/.test(Password))) {
        zhi = "手机号格式不正确";
    } else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("span1").innerHTML = html;
}

function PasswordDemo() {
    document.getElementById("span2").innerHTML = "请输入从手机上收到的验证码";
}
function PasswordDemo2() {
    var password2 = document.getElementById("password2").value;
    var zhi;

    if (password2 =="") {
        zhi = "验证码不能为空";
    } else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("span2").innerHTML = html;
}

function login() {
    var n = document.getElementById("password").value;
    var y = document.getElementById("password2").value;

    if(n=="")
    {
        document.getElementById("span1").innerHTML='<span class="error">用户名不能为空</span>';
        return false;
    } else if(y=="")
    {
        document.getElementById("span2").innerHTML='<span class="error">验证码不能为空</span>';
        return false;
    }
    alert("修改成功！");
    document.getElementById("form1").submit();
}