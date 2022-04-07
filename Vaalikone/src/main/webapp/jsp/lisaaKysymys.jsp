<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lisää kysymys</title>
</head>
<body>
<h2>Lisää kysymys</h2>
<form action='/lisaaKysymys' method='post'>
Kysymys numero: <input type='text' name='id' ><br>
Kysymys: <input type='text' name='kysymys'><br>
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html>