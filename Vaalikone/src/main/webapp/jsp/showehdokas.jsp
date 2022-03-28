<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.Ehdokas" %>   
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fish application</title>

<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">
<script src="myscriptfile.js"></script>

</head>
<body>
<h2>Fish application</h2>
<ol>
<c:forEach var="Ehdokas" items="${requestScope.fishlist}" >
<li>${ehdokkaat.ehdokas_id}: ${ehdokkaat.etunimi} <a href='/delete?id=${ehdokkaat.ehdokas_id}'>delete</a> <a href='/readtoupdate?id=${ehdokkaat.ehdokas_id}'>update</a>
</c:forEach>
</ol>

<%
ArrayList<Ehdokas> EhdokkaatList=(ArrayList<Ehdokas>)request.getAttribute("ehdokaslist");

for (int i=0;EhdokkaatList!=null && i<EhdokkaatList.size();i++){
	Ehdokas f=EhdokkaatList.get(i);
	out.println(f.getId()+": "+f.getEtunimi()+"<a href='/delete?id="+f.getId()+"'>delete</a> <a href='/readtoupdate?id="+f.getId()+"'>update</a>");
}
%>





</body>
</html>