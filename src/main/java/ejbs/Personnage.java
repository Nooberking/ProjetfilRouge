package ejbs;

public class Personnage extends Entity {
	private int gold; 
    // idée : ajouter liste objets

	@Override
	public int attack(Entity e) {
		// TODO Auto-generated method stub
				if (physicalAttackPoints > magicalAttackPoints) e.lifePoints -= physicalAttackPoints - e.physicalAttackPoints; 
				else e.lifePoints -= magicalAttackPoints - e.magicalDefense; 
				return e.lifePoints;
	}
	public static Personnage createWarrior()  {
		Personnage p = new Personnage(); 
		p.lifePoints = 20; 
		p.physicalAttackPoints = 5 ; 
		p.magicalAttackPoints = 0 ;
		p.physicalDefense = 3; 
		p.magicalDefense = 3; 
		return p; 
	}
	public static Personnage createWizard()  {
		Personnage p = new Personnage(); 
		p.lifePoints = 15; 
		p.physicalAttackPoints = 1 ; 
		p.magicalAttackPoints = 8;
		p.physicalDefense = 2; 
		p.magicalDefense = 4; 
		return p; 
	}

}
