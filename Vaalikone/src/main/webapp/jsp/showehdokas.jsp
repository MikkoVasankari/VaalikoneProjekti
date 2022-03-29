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
<script src="myscriptfile.js"></script>

</head>
<body>
<h2>2022 Meemi vaali ehdokkaat</h2>
<ol>



</ol>

<%
ArrayList<Ehdokas> EhdokkaatList=(ArrayList<Ehdokas>)request.getAttribute("ehdokkaat");

for (int i=0;EhdokkaatList!=null && i<EhdokkaatList.size();i++){
	Ehdokas f=EhdokkaatList.get(i);
	out.println(f.getId()+f.getEtunimi()+f.getKotipaikkakunta()+f.getIka()+f.getAmmatti()+f.getKommentti());
}
%>





</body>
</html>