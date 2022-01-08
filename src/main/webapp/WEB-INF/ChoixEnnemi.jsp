<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles/style2.css"/>
<title>Choix de l'adversaire</title>
</head>
<body>
	<c:if test="${empty start}">
		<p>
		Il est temps pour toi de choisir ton adversaire <c:out value= "${jeu.getNomJoueur()}"/> !
		<form method="get" action="/ProjetFilRouge/Combat">
		<input type="submit" value="Let's go !">
		</p>
		</form>
	</c:if>
	
	<c:if test="${!empty start}">
		<h1>Choisis ton adversaire !</h1>
	
		<form method="post" action="/ProjetFilRouge/Combat">
			<input type="radio" name="ennemi" value="ennemi1" id="ennemi1" /> 
			<label for="ennemi1">premier ennemi : <c:out value= "${firstEnnemy.getName()}"/></label>
			<div class="Ennemy">
				<ul>
					<li>lifepoints : <c:out value= "${firstEnnemy.getLifePoints()}"/></li>
					<li>physicalAttackPoints : <c:out value= "${firstEnnemy.getPhysicalAttackPoints()}"/></li>
					<li>magicalAttackPoints : <c:out value= "${firstEnnemy.getMagicalAttackPoints()}"/></li>
					<li>physicalDefense : <c:out value= "${firstEnnemy.getPhysicalDefense()}"/></li>
					<li>magicalDefense: <c:out value= "${firstEnnemy.getMagicalDefense()}"/></li>
				</ul>
			</div>
			<br /> <input type="radio" name="ennemi" value="ennemi2" id="ennemi2" />
			<label for="ennemi2"> deuxième ennemi : <c:out value= "${secondEnnemy.getName()}"/> </label>
			<div class="Ennemy">
				<ul>
					<li>lifepoints : <c:out value= "${secondEnnemy.getLifePoints()}"/></li>
					<li>physicalAttackPoints : <c:out value= "${secondEnnemy.getPhysicalAttackPoints()}"/></li>
					<li>magicalAttackPoints : <c:out value= "${secondEnnemy.getMagicalAttackPoints()}"/></li>
					<li>physicalDefense : <c:out value= "${secondEnnemy.getPhysicalDefense()}"/></li>
					<li>magicalDefense: <c:out value= "${secondEnnemy.getMagicalDefense()}"/></li>
				</ul>
			</div>
			<br /> <input type="submit" value="Fight !" />
		</form>
	</c:if>
</body>
</html>