<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/memberProc" method="post">
	ID : <input type="text" name="id"/> <br>
	비밀번호 : <input type="password" name="passwd"/> <br>
	이름 : <input type="text" name="name"/> <br>
	E-Mail : <input type="text" name="mail"/> <br>
	<input type="submit" value="가입">
</form>
</body>
</html>