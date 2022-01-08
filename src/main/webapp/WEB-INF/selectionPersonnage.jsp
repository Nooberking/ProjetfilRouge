<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles/style1.css" />
<title>selection du personnage</title>
</head>

<body>

	<h1>Choisis ton personnage :</h1>

	<form method="post" action="/ProjetFilRouge/CreationPersonnage">
		<p>
			<label for="pseudo"> Nom du personnage :</label> <input type="text"
				name="pseudo" id="pseudo">
		</p>
		<p>
			Veuillez choisir la classe : 
			<input type="radio" name="choixPerso" class="choixPerso guerrier" value="guerrier" id="guerrier" /> <label
				for="guerrier">guerrier</label>
				<input type="radio" name="choixPerso" class="choixPerso mage" value="mage" id="mage" /> 
				<label for="mage">mage</label>
		</p>
		<input type="submit" value="Confirmer" />
	</form>

	<c:out value="${jeu.getNomJoueur()}" />




</body>
</html>