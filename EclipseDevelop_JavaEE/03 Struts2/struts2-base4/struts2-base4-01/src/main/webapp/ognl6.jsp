<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>演示:进行投影操作</title>

</head>

<body>
	<s:property value="ps" />
	<br> 1.使用iterator进行遍历
	<br>
	<s:iterator value="ps" var="p">
		名称:<s:property value="#p.name" />
		<br>
		价格:<s:property value="#p.price" />
		<br>
		数量:<s:property value="#p.count" />
		<br>
		<hr>
	</s:iterator>

	<hr>
	2.对集合进行投影，只得到指定的属性
	<br>

	<s:iterator value="ps.{name}" var="pname">
		<s:property value="#pname" />
	</s:iterator>

	<hr>
	3.将ps中价格大于1000的商品得到
	<br>
	<s:iterator value="ps.{?#this.price>1000}" var="p">
		名称:<s:property value="#p.name" />
		<br>
		价格:<s:property value="#p.price" />
		<br>
		数量:<s:property value="#p.count" />
		<br>
		<hr>
	</s:iterator>

	<hr>
	4.将ps中价格大于1000的商品名称得到:
	<br>
	<s:iterator value="ps.{?#this.price>1000}.{name}" var="pname">
		<s:property value="#pname" />
		<br>
		<hr>
	</s:iterator>

	<s:debug />
</body>
</html>
