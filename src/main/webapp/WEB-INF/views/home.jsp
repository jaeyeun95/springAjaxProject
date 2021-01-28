<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>AJAX</title>
	<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<h1 align="center">Spring에서의 AJAX 사용 테스트 페이지</h1>
	
	<ol>
		<li>
			서버쪽 컨트롤러 값 보내기
			<button id="btn1">테스트</button>
			<div id="d1"></div>
		</li>
		<script>
			$(function({
				$("#btn1").on("click",function(){
					$.ajax({
						url:"test1.do",
						type:"post",
						data:{name:"신사임당",age:47},
						success:function(data){
							console.log(data);
						}, error:function(request,status,errorDate){
							alert("error code : " + request.status + "\n"
									+ "message : " + reuqest.responseText
									+ "error : " + errorData);
						}
					});
				});
			}));
		</script>
	</ol>
	
	
</body>
</html>
