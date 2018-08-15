<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:使用ognl来获取valueStack中复杂数据</title>

</head>

<body>
	1.使用push存储数据获取
	<hr>
	<s:property value="[0].top.users" />
	<br>

	<s:iterator value="[0].top.users" var="user">
		username:<s:property value="#user.username" />
		<br>
		password:<s:property value="#user.password" />
		<hr>
	</s:iterator>

	<hr>

	<s:iterator value="[0].top.users">
		username:<s:property value="username" />
		<br>
		password:<s:property value="password" />
		<hr>
	</s:iterator>
	<hr>
	2.使用set存储数据
	<hr>
	<s:property value="users" />
	<br>

	<s:iterator value="users" var="user">
		username:<s:property value="#user.username" />
		<br>
		password:<s:property value="#user.password" />
		<hr>
	</s:iterator>

	<hr>

	<s:iterator value="users">
		username:<s:property value="username" />
		<br>
		password:<s:property value="password" />
		<hr>
	</s:iterator>
	<s:debug />
</body>
</html>
