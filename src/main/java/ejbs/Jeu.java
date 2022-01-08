package ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;



@Stateful
@SessionScoped
@LocalBean
public class Jeu 
{
	Personnage joueur;
	Ennemy firstEnnemy;
	Ennemy secondEnnemy;
	Actions nextAction = Actions.none; 
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
	
	
	public boolean isFirstEnnemySelected() {
		return firstEnnemySelected;
	}

	public void setFirstEnnemySelected(boolean firstEnnemySelected) {
		this.firstEnnemySelected = firstEnnemySelected;
	}

	public String tourJoueur()
	{
		String r�sultat = ""; 
		switch (nextAction) {
		case autoAttack:
			r�sultat = "Il lui reste ";
			if (firstEnnemySelected) r�sultat  += "" + joueur.autoAttack(firstEnnemy) +"PV";
			else r�sultat += "" + joueur.autoAttack(secondEnnemy) + "PV"; 
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
			
		}
		return r�sultat; 	
	}
	public String tourEnnemy() 
	{
		String r�sultat = "\n\n L'adversaire  a r�pliqu� ! "; 
		r�sultat +="\n " + (firstEnnemySelected ? firstEnnemy.autoAttack(joueur) : secondEnnemy.autoAttack(joueur)) + " de d�gats ! "; 
		return r�sultat; 
		
	}
	/*
	 * public static void main(String[] args) { Jeu jeu = new Jeu();
	 * jeu.setPersonnage(Personnage.createWarrior("noob")); jeu.setFirstEnnemy(new
	 * Ennemy()); jeu.setSecondEnnemy(new Ennemy()); System.out.println("joueur : "
	 * + jeu.getNomJoueur()); System.out.println("Ennemi 1 : " +
	 * jeu.getFirstEnnemy().getName()); System.out.println("Ennemi 2 : " +
	 * jeu.getSecondEnnemy().getName()); jeu.setNextAction(Actions.autoAttack);
	 * System.out.println(jeu.tourJoueur()); System.out.println(jeu.tourEnnemy());
	 * jeu.setNextAction(Actions.magicalAttack);
	 * System.out.println(jeu.tourJoueur()); System.out.println(jeu.tourEnnemy()); }
	 */

}
