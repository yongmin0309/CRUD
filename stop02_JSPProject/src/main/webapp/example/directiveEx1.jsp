<%@page import="java.util.Random"%>
<%@page import="java.util.Calendar"%>

<%@ page info="JSP를 공부중입니다" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=getServletInfo() %><br><br>
<%
	Calendar cal=Calendar.getInstance();
	int year=cal.get(Calendar.YEAR);
	int month=cal.get(Calendar.MONTH)+1;
	int day=cal.get(Calendar.DAY_OF_MONTH);
	
	Random rd=new Random();
	int per=rd.nextInt(101);
%>
오늘날짜 :<%=year%>년<%=month%>월<%=day%>일<br>
오늘운세 : <%=per%>퍼센트
</body>
</html>