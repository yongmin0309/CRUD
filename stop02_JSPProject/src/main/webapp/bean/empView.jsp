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
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="vo" class="com.edu.beans.EmpVo"/>
<jsp:setProperty property="*" name="vo"/>

import bean.EmpVo;

EmpVO vo = new EmpVO();
vo.setName(request.getParameter("name"));
vo.setPhone(request.getParameter("phone"));
vo.setAddr(request.getParameter("addr"));

이름 : <%=vo.getName() %><br> // <jsp:getProperty property="name" name="vo"/>
전화 : <%=vo.getPhoen() %><br>
주소 : <%=vo.getAddr() %><br>

</body>
</html>