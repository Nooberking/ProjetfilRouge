<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Combat ! </title>
</head>
<body>
	<c:choose>
	
		<c:when test="${gameOver}">
	
		<h1> Game Over</h1>
		
		<p>Tu as tenu jusqu'au tour <c:out value="${tour}"/> </p>
			
		</c:when>
		
		<c:when test="${battleOver }">
		<h1> Well Played !!</h1>
		
		Il est temps d'affronter le prochain ennemi ! 
		<form method="get" action="/ProjetFilRouge/Combat">
		<input type="submit" value="Let's Go ! ">
		</form>
		</c:when>
		
		<c:otherwise>
		
			<h1>Combat n°<c:out value="${tour}"/></h1>
			<div>
				<h2><c:out value="${jeu.getNomJoueur()}"/></h2>
				<ul>
					<li>lifepoints : <c:out value= "${jeu.getPersonnage().getLifePoints()}"/></li>
					<li>physicalAttackPoints : <c:out value= "${jeu.getPersonnage().getPhysicalAttackPoints()}"/></li>
					<li>magicalAttackPoints : <c:out value= "${jeu.getPersonnage().getMagicalAttackPoints()}"/></li>
					<li>physicalDefense : <c:out value= "${jeu.getPersonnage().getPhysicalDefense()}"/></li>
					<li>magicalDefense: <c:out value= "${jeu.getPersonnage().getMagicalDefense()}"/></li>
				</ul>
				
			</div>
			<div>
				<h2>VS</h2>
			</div>
			<c:if test="${jeu.firstEnnemySelected}">
				<div>
					<h2><c:out value="${jeu.getFirstEnnemy().getName()}"/></h2>
					<ul>
						<li>lifepoints : <c:out value= "${jeu.getFirstEnnemy().getLifePoints()}"/></li>
						<li>physicalAttackPoints : <c:out value= "${jeu.getFirstEnnemy().getPhysicalAttackPoints()}"/></li>
						<li>magicalAttackPoints : <c:out value= "${jeu.getFirstEnnemy().getMagicalAttackPoints()}"/></li>
						<li>physicalDefense : <c:out value= "${jeu.getFirstEnnemy().getPhysicalDefense()}"/></li>
						<li>magicalDefense: <c:out value= "${jeu.getFirstEnnemy().getMagicalDefense()}"/></li>
					</ul>
					
				</div>
			</c:if>
			<c:if test="${!jeu.firstEnnemySelected}">
				<div>
					<h2><c:out value="${jeu.getSecondEnnemy().getName()}"/></h2>
					<ul>
						<li>lifepoints : <c:out value= "${jeu.getSecondEnnemy().getLifePoints()}"/></li>
						<li>physicalAttackPoints : <c:out value= "${jeu.getSecondEnnemy().getPhysicalAttackPoints()}"/></li>
						<li>magicalAttackPoints : <c:out value= "${jeu.getSecondEnnemy().getMagicalAttackPoints()}"/></li>
						<li>physicalDefense : <c:out value= "${jeu.getSecondEnnemy().getPhysicalDefense()}"/></li>
						<li>magicalDefense: <c:out value= "${jeu.getSecondEnnemy().getMagicalDefense()}"/></li>
					</ul>
				</div>
			</c:if>
			<form method="post" action="/ProjetFilRouge/Combat">
				<input type="radio" name="action" value="autoAttack" id="autoAttack" /> 
				<label for="autoAttack">Auto-attaque</label>
				<input type="radio" name="action" value="physicalAttack" id="physicalAttack" /> 
				<label for="physicalAttack">Attauqe physique</label>
				<input type="radio" name="action" value="magicalAttack" id="magicalAttack" /> 
				<label for="magicalAttack">Attaque magique</label>
				<input type="submit" value="valider mon choix">
			</form>
			
		</c:otherwise>
	</c:choose>
	
	
	

</body>
</html>