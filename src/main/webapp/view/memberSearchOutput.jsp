<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.dev.vo.MemberVO"%>

<jsp:include page="/menu.jsp"/>
<div class="container jumbotron">
	<h3>검색 결과</h3>
	<c:if test="${!empty member }">
	<h3> ${member.id} / ${member.passwd} / ${member.name} / ${member.mail} /</h3>
	</c:if>
	<c:if test="${empty member}">
		<h3>등록된 회원 정보가 없습니다</h3>
	</c:if>
</div>

</body>
</html>