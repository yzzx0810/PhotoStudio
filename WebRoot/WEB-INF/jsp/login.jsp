<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>
	<div id="login">
		<span>Photo Studio of Xinxin in Yangzhou</span>
		<form action="http://localhost:8080/PhotoStudio/login" method="post">
			<span>用户名</span><br>
			<input type="text" name="username"><br>
			<span>密码</span><br>
			<input type="password" name="password"><br>
			<input type="submit" value="登录">
		</form>
	</div>
</body>
</html>