/**
 * Created by ttc on 17-12-28.
 */
window.onload=function () {
    document.getElementById("").onclick=function () {
        document.getElementById("file").onclick;
        return;
    }

    document.getElementById("file").onchange=function () {

        var xhr=new XMLHttpRequest();

        open("post","/ServletUpload");
        send();

        xhr.onreadystatechange=function () {
            if(xhr.statusText==4){
                if(xhr.status==200||xhr.status==304){
                  document.getElementById("").src=xhr.responseText;
                }
            }
        }
        return;
    }
}