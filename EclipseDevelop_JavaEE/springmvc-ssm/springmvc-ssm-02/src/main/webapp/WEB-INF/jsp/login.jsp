<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<!-- 包含所需的頭文件 -->
<%@ include file="/WEB-INF/include/include.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆</title>
</head>
<body>
	<form action="${ctx }/login/userLogin.do" method="post">
		<table>
			<tr>
				<td colspan="2" align="center">首頁登陸</td>
			</tr>
			<tr>
				<td>用戶名稱:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>用戶密碼</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登陸"></td>
			</tr>
		</table>
	</form>
</body>
</html>