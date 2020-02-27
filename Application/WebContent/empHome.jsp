<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Hi" + session.getAttribute("ename"));
%>
<h1>
<a href="/Application/jobDetails.html">PostJob?</a>
<a href="/Application/EmpLogout">Logout?</a>

</h1>
</body>
</html>