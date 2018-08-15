<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:构造集合</title>

</head>

<body>
	1.可以使用#来构建一个Map集合
	<br>

	<s:iterator value="#{'name':'tom','age':20}" var="entry">
		<s:property value="#entry.key" />----<s:property value="#entry.value" />
		<br>
	</s:iterator>


	<hr>
	2.可以构建List集合
	<br>
	<s:iterator value="{'aa','bb','cc'}" var="v">
		<s:property value="#v" />
		<br>
	</s:iterator>

	<hr>
	3.手动创建一个集合，在struts2中是结合表单标签使用的
	<br>
	<s:form>
		<s:radio list="{'男','女'}" name="sex"></s:radio>
		
		<s:radio list="#{'男':'male','女':'female'}" name="sex"></s:radio>
		
		
		<s:select list="{'a','b','c'}" name="aa"></s:select>
		
			<s:select list="#{'a':'aaa','b':'bbb','c':'ccc'}" name="aa"></s:select>
	</s:form>
</body>
</html>
