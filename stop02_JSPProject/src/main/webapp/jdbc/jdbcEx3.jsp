<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	Class.forName("oracle.jdbc.driver.OracleDriver");

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url,"hr","1234");
	
	PreparedStatement pstmt = conn.prepareStatement("insert into test values(?,?)");
	
	pstmt.setString(1, "dd");
	pstmt.setString(2, "44");

	pstmt.close();
	conn.close();
%>
</body>
</html>