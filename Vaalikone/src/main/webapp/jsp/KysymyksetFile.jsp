<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="data.kysymys"%>


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
	<h1>Vaalikone kysely</h1>

	<h3>Tervetuloa vaalikoneen kysymys osion tässä osiossa sinun olisi
		tarkoitus vasta kysymyksiin vaihtoehdoilla 1 - 5. <br>(1 = Täysin eri
		mieltä, 5 = Täysin samaa mieltä)
	</h3>

	<table>
		<%
		ArrayList<kysymys> kysymyslista = (ArrayList<kysymys>) request.getAttribute("kysymyslista");
		
		for (int i = 0; kysymyslista != null && i < kysymyslista.size(); i++) {
			kysymys k = kysymyslista.get(i);
			
// 			out.println("<tr>");
// 			out.println("<td> Kysymys." + k.getId() + " " + k.getKysymys() + "</td>");
// 			out.println("<input type='radio' name='radio1'> 1");
// 			out.println("</tr>");
			int kysymysnum = k.getId();
			
			out.println(" Kysymys." + k.getId() + " " + k.getKysymys());
			out.println("<br>");
			out.println("<input type='radio' name="+kysymysnum +" value = '1'> 1");
			out.println("<input type='radio' name="+kysymysnum +" value = '2'> 2");
			out.println("<input type='radio' name="+kysymysnum +" value = '3'> 3");
			out.println("<input type='radio' name="+kysymysnum +" value = '4'> 4");
			out.println("<input type='radio' name="+kysymysnum +" value = '5'> 5");
			out.println("<br>");
		}
		%>
		
		<!--  
		<tr>
			<td colspan="2" style="font-weight: bold;">Kysymys 1:</td>

		</tr>
	-->
	</table>

	<button type="button">Siirry tulokset</button>
	<button type="button">Palaa takaisin</button>
	
</body>
</html>