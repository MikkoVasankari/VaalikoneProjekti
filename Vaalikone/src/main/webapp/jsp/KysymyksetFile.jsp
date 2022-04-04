<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="data.kysymys"%>
<%@ page import= "javax.servlet.RequestDispatcher" %>


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

	<h3>
		Tervetuloa vaalikoneen kysymys osion tässä osiossa sinun olisi
		tarkoitus vasta kysymyksiin vaihtoehdoilla 1 - 5. <br>(1 = Täysin
		eri mieltä, 5 = Täysin samaa mieltä)
	</h3>
	<form method='post'action='/showTulokset'>
		<table>

			<%
			ArrayList<kysymys> kysymyslista = (ArrayList<kysymys>) request.getAttribute("kysymyslista");
			
			
			for (int i = 0; kysymyslista != null && i < kysymyslista.size(); i++) {
				kysymys k = kysymyslista.get(i);
				out.println(" Kysymys." + k.getId());
				out.println("<br>");
				out.println(k.getKysymys());
				out.println("<br>");
				out.println("<input type='radio' name=" + 'q' + k.getId() + "  value='1'> 1");
				out.println("<input type='radio' name=" + 'q' + k.getId() + "  value='2'> 2");
				out.println("<input type='radio' name=" + 'q' + k.getId() + "  value='3'> 3");
				out.println("<input type='radio' name=" + 'q' + k.getId() + "  value='4'> 4");
				out.println("<input type='radio' name=" + 'q' + k.getId() + "  value='5'> 5");
				out.println("<br>");
			}
			%>
		

		</table>
		<br>
		<button type="submit" name="kysymyksetSubmit" id="kysymyksetSubmit"
			onclick="location.href='/showTulokset'">Siirry
			tuloksiin</button>
	</form>
	<br>
	
	<button type="submit" onclick="location.href='index.html'">Palaa
		takaisin</button>
</body>
</html>