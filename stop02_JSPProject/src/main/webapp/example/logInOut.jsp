<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.isNew()||session.getAttribute("id")==null){
	
 %>
	<%
		String msg = (String)request.getAttribute("error");
		if(msg==null) msg=""; //out.print(msg); 가능
	%>
	<%=msg %>
	<form action="requestEx.jsp" method="POST">
			ID: <input type="text" name="id"><br>
			비밀번호 <input type="password" name="pwd"><br>
			
			
			<input type="submit" value="로그인">
	</form>
	<%}else{%>
		<a href="requestEx.jsp">로그아웃</a>
	<%} %>
</body>
</html>