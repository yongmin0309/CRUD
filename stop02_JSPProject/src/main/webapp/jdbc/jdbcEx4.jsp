<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
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
	InitialContext ic = new InitialContext();

	DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
	
	Connection conn = ds.getConnection();
	
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