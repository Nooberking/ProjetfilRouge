<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Choix de l'adversaire</title>
</head>
<body>
	<h1>Choisis ton adversaire ! </h1>
	
	<form method="post" action="/ProjetFilRouge/Combat">
	<input type="radio" name="ennemi" value="ennemi1" id="ennemi1" /> 
		<label for="ennemi1">premier ennemi : </label>
		<div class="Ennemy">
			<ul>
				<li>lifepoints</li>
				<li>physicalAttackPoints</li>
				<li>magicalAttackPoints</li>
				<li>physicalDefense</li>
				<li>magicalDefense</li>	
			</ul>
		</div>
		<br/>
		<input type="radio" name="ennemi" value="ennemi2" id="ennemi2" /> 
		<label for="ennemi2"> deuxième ennemi : </label>
		<div class="Ennemy">
			<ul>
				<li>lifepoints</li>
				<li>physicalAttackPoints</li>
				<li>magicalAttackPoints</li>
				<li>physicalDefense</li>
				<li>magicalDefense</li>	
			</ul>
		</div>
		<br/>
		<input type="submit" value="Fight ! " />
	</form>

</body>
</html>