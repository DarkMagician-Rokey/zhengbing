/**
 * Created by ttc on 17-12-27.
 */
//主图
function img() {
        window.location.href="/page/login.jsp";
}
//编辑个人资料
window.onload=function edit() {
    var email=document.getElementById("email").innerText;
    console.log(email);
    if(email!="游客,点击登陆"){
        console.log("ready");
        var ed=document.getElementById("ed");
            ed.innerHTML=",编辑个人资料";
        ed.onclick=function () {
            document.getElementById("submit").click();

        }
    }

}
//点击游客
function login() {
    location.href="/page/login.jsp";
}

//兵役登记
function bingyi() {
    location.href="/servlet/ServletDengji";
}

//应征报名
function baoming() {
    location.href="/servlet/ServletBaoming";
}


