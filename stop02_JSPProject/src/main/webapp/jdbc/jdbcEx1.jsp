<%@page import="java.sql.Statement"%>
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
	
	
	Statement stmt = conn.createStatement();
	
	stmt.executeUpdate("create table test(id varchar2(5), pwd varchar2(5))");
	
	stmt.executeUpdate("insert into test values('aa','11')");
	stmt.executeUpdate("insert into test values('bb','22')");
	stmt.executeUpdate("insert into test values('cc','33')");
	
	stmt.close();
	conn.close();
%>
</body>
</html>