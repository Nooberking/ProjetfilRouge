package ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class Jeu 
{
	Personnage joueur=Personnage.createWarrior("FirstWarrior");
	Ennemy firstenemy= new Ennemy();

	
	public void Combat(Entity e1,Entity e2)
	{
		System.out.println(e1.autoAttack(e2));
		System.out.println(e2.autoAttack(e1));
	}
	public String CombatV2(Entity e1, Entity e2) {
		String displayCombat = "";
		displayCombat += "\n il reste "+ e1.autoAttack(e2) + "  à l'entité 1"; 
		displayCombat += "\n il reste "+ e2.autoAttack(e1) + " à l'entité 2"; 
		return displayCombat; 
		
	}
	public String testCombat() {
		return CombatV2(joueur, firstenemy); 
	}
	
	public void autoBattle(Entity e1,Entity e2)
	{
		boolean battleIsOver=false;
		String displayCombat = "";
		displayCombat += "\n il reste "+ e1.lifePoints+ "  à l'entité 1"; 

		while(!battleIsOver)
		{
			e1.autoAttack(e2);
			System.out.println( "\n il reste "+ e2.lifePoints + "points de vie  à " +e2.name);
			if(e2.lifePoints<=0)
			{
				battleIsOver=true;
				System.out.println("victoire de "+ e1.name);
			}
			else
			{
				e2.autoAttack(e1);
				System.out.println("\n il reste " + e1.lifePoints + "points de vie  à " + e1.name);
				if(e1.lifePoints<=0)
				{
					battleIsOver=true;
					System.out.println("victoire de " + e2.name);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		Personnage joueur=Personnage.createWarrior("FirstWarrior");
		Ennemy firstenemy= new Ennemy();
		Jeu j1= new Jeu();
		//j1.Combat(joueur, firstenemy);
		j1.autoBattle(joueur, firstenemy);
	}

}
