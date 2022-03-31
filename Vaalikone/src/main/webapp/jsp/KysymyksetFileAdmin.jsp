<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="data.kysymys"%>
<%@ page import="javax.servlet.RequestDispatcher"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
	text-align: center;
}

table {
	margin-left: auto;
	margin-right: auto;
}
</style>


<title>Vaalikone kysely</title>
</head>
<body>
	<h1>Admin vastaa</h1>



	<%
		ArrayList<kysymys> kysymyslista = (ArrayList<kysymys>) request.getAttribute("kysymyslista");

		for (int i = 0; kysymyslista != null && i < kysymyslista.size(); i++) {
			kysymys k = kysymyslista.get(i);
			out.println("<br>");
			out.println(" Kysymys." + k.getId());
			out.println("<br>");
			out.println(k.getKysymys());
			out.println("<br>");
			out.println("<a href='/readtoupdate?id="+k.getId()+"'>update question</a>");
			out.println("<br>");
		}
	%>


	<br></br>
	<br></br>



	<button type="submit" onclick="location.href='index.html'">Palaa
		takaisin</button>
</body>
</html>