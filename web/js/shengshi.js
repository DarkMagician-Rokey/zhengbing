/**
 * Created by ttc on 17-12-28.
 */
function shengshi() {
    var sheng = document.getElementById("province");
    var shi = document.getElementById("city");
    if (sheng.value == "辽宁省")
    {

        shi.innerHTML = " ";
        var t = ["新民市", "大连市", "沈阳市", "锦州市", "盘锦市", "辽阳市"];
        for (var i = 0; i < t.length; i++)
        {
            document.getElementById("city").innerHTML += "<option value='" + t[i] + "'>" + t[i] + "</option>";
        }
    }


    if (sheng.value == "黑龙江省") {

        shi.innerHTML = " ";
        var t = ["鹤岗市", "鸡西市", "牡丹江市", "七台河市", "佳木斯市", "黑河市"];
        for (var i = 0; i < t.length; i++) {
            shi.innerHTML += "<option value='" + t[i] + "'>" + t[i] + "</option>";
        }

    }

    if (sheng.value == "吉林省") {

        shi.innerHTML = " ";
        var t = ["吉林市", "长春市", "松原市", "敦化市", "延吉市", "通化市"];
        for (var i = 0; i < t.length; i++) {
            shi.innerHTML += "<option value='" + t[i] + "'>" + t[i] + "</option>";
        }
    }

}