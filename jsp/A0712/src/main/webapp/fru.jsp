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
	String idc = "sol";
	String pwc = "1234";
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals(idc) && pw.equals(pwc)){
			session.setAttribute("id1", id);
			session.setMaxInactiveInterval(600);
			response.sendRedirect("suc.jsp?id="+id);
			// jsp:forward 는 값이 전부 노출됨
		}
		else{
			%>
			<script>
				alert("아이디 혹은 비밀번호가 틀렸습니다");
				history.go(-1);
			</script>
			<%
		}
		%>
</body>
</html>