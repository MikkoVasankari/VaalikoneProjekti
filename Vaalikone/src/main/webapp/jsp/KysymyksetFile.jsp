<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.kysymys" %>  

    
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

	<table>
<%
ArrayList<kysymys> kysymyslista=(ArrayList<kysymys>)request.getAttribute("kysymyslista");

for (int i=0;kysymyslista!=null && i<kysymyslista.size();i++){
	kysymys k=kysymyslista.get(i);
	
	out.println("<tr> <td> Kysymys." + k.getId() + " "+ k.getKysymys() + "</td> </tr>");
	
}
%>
<!--  
		<tr>
			<td colspan="2" style="font-weight: bold;">Kysymys 1:</td>

		</tr>
	-->	
	</table>
</body>
</html>