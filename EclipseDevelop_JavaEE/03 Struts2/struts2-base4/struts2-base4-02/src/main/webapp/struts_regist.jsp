<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>

</head>

<body>


	<form action="${pageContext.request.contextPath}/regist.action"
		method="get">
		<s:token/>
		username:<input type="text" name="username"><br>
		password:<input type="password" name="password"><br> <input
			type="submit" value="注册">
	</form>
</body>
</html>
