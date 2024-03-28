<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.include("test.jsp");
%>
	<h3>--include 전 --</h3>
	<jsp:forward page="test.jsp"/>
	<h3>--include 후 --</h3>
</body>
</html>