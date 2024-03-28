<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script 
src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<title>회원관리 프로젝트</title>
</head>
<body>
	<nav class="navbar navber-expand-sm bg-dark navber-dark" style="margin-bottom:30px">
		<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/index.jsp">처음화면</a></li>
				  	
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/view/memberInsert.jsp">회원가입</a></li>
				  	
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/view/memberSearch.jsp">회원검색</a></li>
				  	
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/view/memberUpdate.jsp">회원수정</a></li>
				  	
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/view/memberDelete.jsp">회원삭제</a></li>  
				  		  	
				<li class="nav-item"><a class="nav-link"
				  	href="/dev/memberList.do">모든회원보기</a></li>
		</ul>
	</nav>
</body>
</html>