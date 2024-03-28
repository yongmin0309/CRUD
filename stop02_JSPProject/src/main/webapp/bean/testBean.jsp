<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ex" class="com.edu.beans.TestBean"/>
	<jsp:setProperty property="name" name="ex" value="개나리"/>
	나의 이름은 <jsp:getProperty property="name" name="ex"/> 입니다
	<br>
	
	<jsp:setProperty property="name" name="ex" value="민들레"/>
	나의 이름은 <jsp:getProperty property="name" name="ex"/> 입니다
</body>
</html>