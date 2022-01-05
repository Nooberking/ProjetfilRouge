<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
	<h1>Hello World !</h1>
	<h2>Combat entité 1 VS entité 2</h2>
	<c:out value="${jeu.testCombat()}" />
</body>
</html>