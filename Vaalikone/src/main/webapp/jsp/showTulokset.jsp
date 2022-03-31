<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="data.Tulos"%>
<%@ page import="data.kysymys"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vastaukset</title>
</head>
<body>

	<%
	
	ArrayList<Tulos> vastauslista = (ArrayList<Tulos>) request.getAttribute("vastaukset");
	for (int i = 0; vastauslista != null && i < vastauslista.size(); i++) {
		Tulos t = vastauslista.get(i);
		out.println(" Kysymys: " + t.getId() + " vastaus: " + t.getVastaus());
		out.println("<br>");
	}
	
	%>


</body>
</html>