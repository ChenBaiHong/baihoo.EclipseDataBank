<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>第一种struts2处理异步请求</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/my.js"></script>
<script type="text/javascript">
	function hello() {
		//1.得到XMLHttpRequest对象
		var xmlhttp = getXmlHttpRequest();

		//2.设置回调函数.
		xmlhttp.onreadystatechange = function() {

			if (xmlhttp.status == 200 && xmlhttp.readyState == 4) {

				alert(xmlhttp.responseText);
			}
		};
		//3.open
		xmlhttp.open("GET", "${pageContext.request.contextPath}/ajax1?msg="
				+ document.getElementById("t").value);

		//4.send
		xmlhttp.send(null);
	}
</script>
</head>

<body>
	<input type="text" id="t">
	<input type="button" value="提交" onclick="hello();">
</body>
</html>
