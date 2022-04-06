<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="data.Ehdokas"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="tyyli.css">

<title> Vastaukset </title>
</head>
<body>

	<h3>
		Ehdokas jolla suurimmat pisteet on meidän suosittelema :D 
	</h3>

	<%
	ArrayList<Ehdokas> ehdokasJaPisteet = (ArrayList<Ehdokas>) request.getAttribute("vastaukset");
	ArrayList<Ehdokas> ehdokasLista = (ArrayList<Ehdokas>) request.getAttribute("ehdokkaat");
	
	for (int i = 0; ehdokasLista != null && i < ehdokasLista.size(); i++) {
	
		Ehdokas vastaus = ehdokasJaPisteet.get(i);
		Ehdokas e = ehdokasLista.get(i);
		out.println("Ehdokkaan " + e.getEtunimi() + " " + " Pisteet " + vastaus.getTulos()
		
		);
		out.println("<br>");
	
	}
	%>


</body>
</html>