<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bookProc.jsp" method="POST">
		책제목: <input type="text" name="title"><br>
		책저자: <input type="text" name="author"><br>
		출판사: <input type="text" name="publisher"><br>
		<input type="submit" value="등록">
	</form>
</body>
</html>