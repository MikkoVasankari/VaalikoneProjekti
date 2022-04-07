<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="data.kysymys"%>
<%@ page import="javax.servlet.RequestDispatcher"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="tyyli.css">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="wrapper1">
		<%
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
			response.setHeader("Pragma", "no-cache"); //HTTP 1.0
			response.setHeader("Expires", "0"); //Proxies
			if (session.getAttribute("username") == null) {
				response.sendRedirect("login.jsp");
			}
			%>




	<br></br>
	<br></br>
	
	<a href='/showKysymysAdmin'>Muokkaa kyselyitä --- Tämä on tällä hetkellä toimiva</a>
	
	<br></br>
	<br></br>
	</div>

	<form action="logout"></form>
	<input type="submit" value="Logout">
</body>
</html>