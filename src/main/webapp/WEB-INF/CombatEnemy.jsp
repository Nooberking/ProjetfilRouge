<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles/style4.css"/>
<title>combat</title>
</head>
<body>
	<h1>Choisis ton personnage :</h1>

	<form method="post" action="/ProjetFilRouge/Combat">
		<div id="global">
			<h1>Score du joueur (nombre d'enemis battus avant)</h1>
			<div id="EnemyStats">
				<h1>Nom de l'enemy</h1>
				<p>
					Points de vies / Points de vie max
					<c:out value="${jeu.firstEnemy.lifePoint}" />
				</p>
				<p>
					Defense magique
					<c:out value="${jeu.firstEnemy.magicalDefense}" />
				</p>
				<p>
					Defense physique
					<c:out value="${jeu.firstEnemy.physicalDefense}" />
				</p>

			</div>
			<div id=JoueurStats>
				<h1>
					Nom de l'enemy
					<c:out value="${jeu.joueur.name}" />
				</h1>
				<p>
					Points de vies / Points de vie max
					<c:out value="${jeu.joueur.lifePoint}" />
				</p>


			</div>
		</div>


		<input type="submit" value="Combattre" />
	</form>

</body>
</html>