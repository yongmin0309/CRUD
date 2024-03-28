<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num1" value="${20}"/>
<c:set var="num2">35</c:set>
<c:out  value="${num1}"/> <br>

 num1 + num2 = ${num1 + num2 }<br><br>
 
 <c:forEach var="num" begin="1" end="10" step="1">
 		${num} &nbsp;&nbsp;&nbsp;
</c:forEach> <br><br>
<%
	String[] color={"red","green","blue"};
%> 		

<c:set var="colName" value="<%=color %>"/>
<c:forEach items="${ColName}" varStatus="status">
	${status.count}&nbsp;&nbsp;&nbsp;;${colName[status.index]} <br>
</c:forEach><br><br>

<c:forTokens var="car" items="벤츠,소나타,제네시스,아우디,포르쉐" delims=",">
	${car}<br>
</c:forTokens><br><br>
</body>
</html>