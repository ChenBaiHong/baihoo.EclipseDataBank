<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:%号用法</title>

</head>

<body>
	<%
		request.setAttribute("username", "tom");
	%>
	<s:property value="#request.username" default="hello"/><br>
	
	<s:property value="%{#request.username}"/><br>
	
	<s:property value="%{'#request.username'}"/><br>
	
	<hr>
	<s:textfield name="abc" value="%{#request.username}"/>
</body>
</html>
