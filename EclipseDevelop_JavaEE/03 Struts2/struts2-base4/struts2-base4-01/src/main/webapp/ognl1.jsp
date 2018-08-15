<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>演示:使用ognl来通过对象调用方法</title>
	
  </head>
  
  <body>
  		<s:property value="'abc'.length()"/>
  		<hr>
  		
  		<s:property value="@java.lang.Math@max(10,20)"/>
  </body>
</html>
