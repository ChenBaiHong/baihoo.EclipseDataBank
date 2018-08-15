<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- 
	使用Maven构建Java Web项目时，关于jsp中引入js、css文件路径问题
	首先，确保jsp引入了jstl：
							<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

　　其次是具体的引用写法了，使用<c:url>标签：<link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
 --%>
<html>
	<head>
		<title>Welcome To Struts2</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		
		<link rel="stylesheet" href="<c:url value="/welcome/assets/css/main.css"/>" />
		<noscript><link rel="stylesheet" href="<c:url value="/welcome/assets/css/noscript.css"/>" /></noscript>
		
	</head>
	<body class="is-preload">
		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<div class="logo">
							<span class="icon fa-diamond"></span>
						</div>
						<div class="content">
							<div class="inner">
								<h1>歡迎來到struts2的世界</h1>
								<p>WelcomeTo Struts2 <a href="#">HTML5 UP</a> and released<br />
								进入struts2 <a href="${pageContext.request.ContextPath}/hello">startup</a> .</p>
							</div>
						</div>
						<nav>
							<ul>
								<li><a href="#intro">Intro</a></li>
								<li><a href="#work">Work</a></li>
								<li><a href="#about">About</a></li>
								<li><a href="#contact">Contact</a></li>
							</ul>
						</nav>
					</header>
					<footer id="footer">
						<p class="copyright">&copy; baiHoo. 使用: <a href="#">baiHoo </a>.</p>
					</footer>
			</div>
			<div id="bg"></div>
			
			<script src="<c:url value="/welcome/assets/js/jquery.min.js"/>"></script>
			<script src="<c:url value="/welcome/assets/js/browser.min.js"/>"></script>
			<script src="<c:url value="/welcome/assets/js/breakpoints.min.js"/>"></script>
			<script src="<c:url value="/welcome/assets/js/util.js"/>"></script>
			<script src="<c:url value="/welcome/assets/js/main.js"/>"></script>
	</body>
</html>
