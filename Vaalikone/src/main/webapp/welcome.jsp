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
</head>
<body>


	Welcome ${username}



	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		response.setHeader("Expires", "0"); //Proxies

		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<h3>ADMIN SÄÄTÄÄ TÄÄLLÄ</h3>

<%
			ArrayList<kysymys> kysymyslista = (ArrayList<kysymys>) request.getAttribute("kysymyslista");
			
			
			for (int i = 0; kysymyslista != null && i < kysymyslista.size(); i++) {
				kysymys k = kysymyslista.get(i);
				out.println(" Kysymys." + k.getId());
				out.println("<br>");
				out.println(k.getKysymys());

			}
			%>




	<br></br>
	<br></br>
	
	<a href='/showKysymysAdmin'>Muokkaa kyselyitä --- Tämä on tällä hetkellä toimiva</a>
	
	<br></br>
	<br></br>
	

	<form action="logout"></form>
	<input type="submit" value="Logout">
</body>
</html>