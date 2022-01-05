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
		String r�sultat = ""; 
		switch (nextAction) {
		case autoAttack:
			r�sultat = "Il lui reste ";
			if (firstEnnemySelected) r�sultat  += "" + joueur.autoAttack(firstEnnemy);
			else r�sultat += "" + joueur.autoAttack(secondEnnemy); 
			break;
			
		case magicalAttack:
			if (firstEnnemySelected) r�sultat  = "" + joueur.magicalAttack(firstEnnemy);
			else r�sultat += "" + joueur.magicalAttack(secondEnnemy); 
			break;
			
		case physicalAttack:
			if (firstEnnemySelected) r�sultat  = "" + joueur.physicalAttack(firstEnnemy);
			else r�sultat += "" + joueur.physicalAttack(secondEnnemy); 
			break;

		default:
			r�sultat = "pas de combat ";
			break;
		}
		return r�sultat; 	
	}


}
