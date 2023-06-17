<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align=center>customer details</h1>
<jsp:useBean id="cst" class="jsp.nani.customer"></jsp:useBean>
<jsp:setProperty property="*" name="cst"/>
<jsp:getProperty property="id" name="cst"/><br>
<jsp:getProperty property="name" name="cst"/><br>
<jsp:getProperty property="city" name="cst"/>
</body>
</html>