package ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Jeu 
{
	
	Personnage joueur=Personnage.createWarrior();
	Ennemy firstenemy= new Ennemy();
	
	public void Combat(Entity e1,Entity e2)
	{
		System.out.println(e1.attack(e2));
		System.out.println(e2.attack(e1));
	}
	public String CombatV2(Entity e1, Entity e2) {
		String displayCombat = "";
		displayCombat += "\n il reste "+ e1.attack(e2) + " à l'entité 1"; 
		displayCombat += "\n il reste "+ e2.attack(e1) + " à l'entité 2"; 
		return displayCombat; 
		
	}
	public String testCombat() {
		return CombatV2(joueur, firstenemy); 
	}
	public static void main(String[] args) {
		
		Personnage joueur=Personnage.createWarrior();
		Ennemy firstenemy= new Ennemy();
		Jeu j1= new Jeu();
		j1.Combat(joueur, firstenemy);
	}

}
