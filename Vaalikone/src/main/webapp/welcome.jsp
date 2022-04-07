<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="javax.servlet.RequestDispatcher"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin sivusto</title>
</head>
<link rel="stylesheet" href="tyyli.css">
<link href="css/style.css" rel="stylesheet">

<body>
	<div class="wrapper">
		<%
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
			response.setHeader("Pragma", "no-cache"); //HTTP 1.0
			response.setHeader("Expires", "0"); //Proxies

			if (session.getAttribute("name") == null) {
				response.sendRedirect("login.jsp");
			}
		%>

		<h1>ADMIN SIVUSTO</h1>
		<br></br> Tervetuloa käyttäjä: ${name} <br></br> <br></br> <a
			href='/showKysymysAdmin' class="button1">MUOKKAA KYSELYITÄ</a> <br></br>
		<br></br>


		<form action="logout"></form>
		<input type="submit" value="Logout">

	</div>
</body>
</html>