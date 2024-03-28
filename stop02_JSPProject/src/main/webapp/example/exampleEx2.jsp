<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=3;
	int b=0;
%>
<h2>
** a와 b의 사칙연사 **<br><br>
a+b=<%=a+b%><br>
a-b=<%=a-b%><br>
a*b=<%=a*b%><br>
a/b=<%=a/b%><br> <%-- 0으로 나누어 error 발생 -> error.jsp 실행됨-- --%>
</h2>
</body>
</html>