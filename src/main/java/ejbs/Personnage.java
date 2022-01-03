package ejbs;

import java.util.ArrayList;

public class Personnage extends Entity {
	private int gold; 
    // idée : ajouter liste objets
	ArrayList<Items> inventaire;
	
	public static Personnage createWarrior(String name)  {
		Personnage p = new Personnage(); 
		p.lifePoints = 20; 
		p.physicalAttackPoints = 5 ; 
		p.magicalAttackPoints = 0 ;
		p.physicalDefense = 3; 
		p.magicalDefense = 3;
		p.name=name;
		p.inventaire=new ArrayList<Items>();
		p.inventaire.add(new MagicalBomb());
		return p; 
	}
	public static Personnage createWizard(String name)  {
		Personnage p = new Personnage(); 
		p.lifePoints = 15; 
		p.physicalAttackPoints = 1 ; 
		p.magicalAttackPoints = 8;
		p.physicalDefense = 2; 
		p.magicalDefense = 4;
		p.name=name;
		p.inventaire=new ArrayList<Items>();
		p.inventaire.add(new PhysicalBomb());
		return p; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void action(Entity e) {
		// TODO Auto-generated method stub
		
	}

}
