<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>

</head>

<body>
		<s:fielderror/>
		<s:actionerror/>		
	<form action="${pageContext.request.contextPath}/login" method="post">
		username:<input type="text" name=username><br>
		password:<input type="password" name="password"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>
