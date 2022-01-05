package ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;



@Stateful
@LocalBean
public class Jeu 
{
	Personnage joueur;
	Ennemy firstEnnemy;
	Ennemy secondEnnemy;
	Actions nextAction; 
	boolean firstEnnemySelected; 
	
	public String getNomJoueur()
	{
		return joueur.toString();
	}
	
	public void setPersonnage(Personnage joueur) {
		this.joueur = joueur;
	}
	
	public Personnage getPersonnage()
	{
		return this.joueur;
		
	}
	
	public Ennemy getFirstEnnemy() {
		return firstEnnemy;
	}

	public void setFirstEnnemy(Ennemy firstEnnemy) {
		this.firstEnnemy = firstEnnemy;
	}

	public Ennemy getSecondEnnemy() {
		return secondEnnemy;
	}

	public void setSecondEnnemy(Ennemy secondEnnemy) {
		this.secondEnnemy = secondEnnemy;
	}

	public Actions getNextAction() {
		return nextAction;
	}

	public void setNextAction(Actions nextAction) {
		this.nextAction = nextAction;
	}
	
	public String tourJoueur()
	{
		String résultat = ""; 
		switch (nextAction) {
		case autoAttack:
			résultat = "Il lui reste ";
			if (firstEnnemySelected) résultat  += "" + joueur.autoAttack(firstEnnemy);
			else résultat += "" + joueur.autoAttack(secondEnnemy); 
			break;
			
		case magicalAttack:
			if (firstEnnemySelected) résultat  = "" + joueur.magicalAttack(firstEnnemy);
			else résultat += "" + joueur.magicalAttack(secondEnnemy); 
			break;
			
		case physicalAttack:
			if (firstEnnemySelected) résultat  = "" + joueur.physicalAttack(firstEnnemy);
			else résultat += "" + joueur.physicalAttack(secondEnnemy); 
			break;

		default:
			résultat = "pas de combat ";
			break;
		}
		return résultat; 	
	}


}
