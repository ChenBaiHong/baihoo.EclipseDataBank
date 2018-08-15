<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>

</head>

<body>
	<form action="${pageContext.request.contextPath}/regist" method="post">
		username:<input type="text" name="username"><br>
		password:<input type="password" name="password"><br>
		hobby:<input type="checkbox" name="hobby" value="eat">吃<input
			type="checkbox" name="hobby" value="drink">喝<input
			type="checkbox" name="hobby" value="play">玩<br> age:<input
			type="text" name="age"><br> birthday:<input type="text"
			name="birthday"><br> <input type="submit" value="注册">
	</form>
</body>
</html>
