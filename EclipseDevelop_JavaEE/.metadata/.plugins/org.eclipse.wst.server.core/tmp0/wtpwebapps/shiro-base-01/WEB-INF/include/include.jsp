<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- jstl 特殊字段格式化標簽，如常見的日格式轉換 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- 
	使用Maven构建Java Web项目时，关于jsp中引入js、css文件路径问题
	首先，确保jsp引入了jstl：
							<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

　　其次是具体的引用写法了，使用<c:url>标签：<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
 --%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!-- =================================css文件================================= -->
<link rel="stylesheet"
	href="<c:url value="/html/bootstrap/css/bootstrap.min.css"/>" />
<link rel="stylesheet"
	href="<c:url value="/html/bootstrap/css/bootstrap-responsive.min.css"/>" />
<link
	href="<c:url value="/html/bootstrap/css/bootstrap-datetimepicker.min.css"/>"
	rel="stylesheet" media="screen">
<!-- =================================js文件================================= -->
<script src="<c:url value="/html/jQuery/jquery3.2.1.min.js"/>"></script>
<script src="<c:url value="/html/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/html/bootstrap/js/bootstrap-datetimepicker.js"/>" charset="UTF-8"></script>
<script type="text/javascript"
	src="<c:url value="/html/bootstrap/js/locales/bootstrap-datetimepicker.zh-CN.js"/>"
	charset="UTF-8"></script>