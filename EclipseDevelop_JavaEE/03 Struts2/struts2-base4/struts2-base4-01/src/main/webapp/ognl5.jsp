<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:使用el获取valueStack数据</title>

</head>

<body>
	ognl获取:<s:property value="username"/><br>
	el获取:${username}
	<br>	
	<s:debug />
</body>
</html>
