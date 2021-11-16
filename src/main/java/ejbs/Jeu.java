package ejbs;

public class Jeu 
{

	
	public void Combat(Entity e1,Entity e2)
	{
		System.out.println(e1.attack(e2));
		System.out.println(e2.attack(e1));
	}
	public static void main(String[] args) {
		
		Personnage joueur=Personnage.createWarrior();
		Ennemy firstenemy= new Ennemy();
		Jeu j1= new Jeu();
		j1.Combat(joueur, firstenemy);
	}

}
