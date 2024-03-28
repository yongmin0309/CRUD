
<%@page import="java.sql.ResultSet"%>
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
		
		ResultSet rs = stmt.executeQuery("select * from test");
		
		while (rs.next()){
			out.println("<br>" + rs.getString("id") + ":" + rs.getString(2));
		}
		
		rs.close();
		stmt.close();
		conn.close();
%>
	
</body>
</html>