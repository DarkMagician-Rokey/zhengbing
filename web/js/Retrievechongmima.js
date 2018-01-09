/**
 * Created by ttc on 18-1-4.
 */
function Passwordtest() {
    document.getElementById("span1").innerHTML = "请填写密码";
}
function Passwordtest2() {
    var Password = document.getElementById("password").value;
    var zhi;

    if (Password == "") {
        zhi = "密码不能为空";
    } else if (!(/^[0-9A-Za-z]{6,30}$/.test(Password))) {
        zhi = "密码长度应在6-30个字符之间";
    } else {
        zhi = "";
    }
    var html = '<span class="error">' + zhi + '</span>';
    document.getElementById("span1").innerHTML = html;
}

function PasswordDemo() {
    document.getElementById("span2").innerHTML = "再填写一遍密码";
}
function PasswordDemo2() {
    var password1 = document.getElementById("password").value;
    var password2 = document.getElementById("password2").value;
    var zhi;

    if (password1 != password2) {
        zhi = "两次填写的密码不一致";
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
        document.getElementById("span1").innerHTML='<span class="error">密码不能为空</span>';
        return false;
    } else if(y!=n)
    {
        document.getElementById("span2").innerHTML='<span class="error">两次密码不一致</span>';
        return false;
    }
    alert("修改成功！");
    // session.getAttribute("newpassword");
    document.getElementById("form1").submit();
}
