// SKYLARK 에서 사용중인 쿠키 로직

/**
 * 쿠키 값을 셋팅한다.
 *
 * @param name : 쿠키 명
 * @param value : 저장할 값
 * @param expiredays : 저장할 기간
 * @example gfn_com_setCookie("userid", "done", 7) => userid 쿠키에 "done" 값을 7일간 저장 gfn_com_setCookie("userid", "done", -1) => userid 쿠키 삭제
 */
function gfn_com_setCookie(name, value, expiredays) {
    var today = new Date();
    today.setDate(today.getDate() + expiredays);
    document.cookie = name + "=" + escape(value) + "; path=/; expires=" + today.toGMTString() + ";";
};

/**
 * 셋팅한 쿠키 값을 가져온다.
 *
 * @param name : 쿠키 명
 * @return 쿠키 명에 해당하는 쿠키 값 가져온다
 * @example var ret = gfn_com_getCookie("userid")
 */
function gfn_com_getCookie(name) {
    var cook = document.cookie + ";";
    var idx = cook.indexOf(name, 0);
    var val = "";
    if (idx != -1) {
        cook = cook.substring(idx, cook.length);
        begin = cook.indexOf("=", 0) + 1;
        end = cook.indexOf(";", begin);
        val = unescape(cook.substring(begin, end));
    }
    return val;
};