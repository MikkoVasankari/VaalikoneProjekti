<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.Ehdokas" %>   
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ehdokkaat</title>

<link rel="stylesheet" type="text/css" href="tyyli.css">



</head>
<body>

	<h2><u>2022 Meemi vaali ehdokkaat</u></h2>
	<h4>
	Vaaliehdokkaat ovat tarkkaan ammattilaisten avulla valittuja yksilöitä,<br>
	joilla kaikkilla on ainutlaatuinen persoona ja ulkonäkö.<br>
	Tällä sivulla voit katsoa ehdokkaiden tietoja.
	
	</h4>

	
		<%
		ArrayList<Ehdokas> EhdokkaatList=(ArrayList<Ehdokas>)request.getAttribute("ehdokkaat");
		
		for (int i=0;EhdokkaatList!=null && i<EhdokkaatList.size();i++){
			Ehdokas f=EhdokkaatList.get(i);
			
			int id = f.getId();
			String etunimi = f.getEtunimi();
			String paikkakunta = f.getKotipaikkakunta();
			int ika = f.getIka();
			String ammatti = f.getAmmatti();
			String kommentti = f.getKommentti();
			
			out.println(
			"<table>" +
			"<th>" + "<h3>" +  f.getId() + ". " + f.getEtunimi()  + "</h3>" + "</th>" + 
			"</table>" +
			
			"<table>" +
			"<tr>" +
			"<th>" + "Kotipaikkakunta: " + "</th>" + "<td>" + f.getKotipaikkakunta() + "</td>" +
			"</tr>" + 
						
			"<tr>" +
			"<th>" + "Ikä: " + "</th>" + "<td>" + f.getIka() + "</td>" +
			"</tr>" + 
			
			"<tr>" +
			"<th>" + "Ammatti: " + "</th>" + "<td>" + f.getAmmatti() + "</td>" +
			"</tr>" + 
			
			"<tr>" +
			"<th>" + "Kommentti: " + "</th>" + "<td>" + f.getKommentti() + "</td>" +
			"</tr>" + 
			
			"</table>" 
			);
		
			out.println("<br>" + "<br>" + "<br>" );
			//out.println(f.getId()+f.getEtunimi()+f.getKotipaikkakunta()+f.getIka()+f.getAmmatti()+f.getKommentti());
		}
		%>
	




</body>
</html>