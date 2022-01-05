package ejbs;



public class Personnage extends Entity {
	
	
	public static Personnage createWarrior(String name)  {
		Personnage p = new Personnage(); 
		p.lifePoints = 20; 
		p.physicalAttackPoints = 5 ; 
		p.magicalAttackPoints = 0 ;
		p.physicalDefense = 5; 
		p.magicalDefense = 3;
		p.name=name;
		return p; 
	}
	public static Personnage createWizard(String name)  {
		Personnage p = new Personnage(); 
		p.lifePoints = 15; 
		p.physicalAttackPoints = 1 ; 
		p.magicalAttackPoints = 8;
		p.physicalDefense = 2; 
		p.magicalDefense = 6;
		p.name=name;
	
		return p; 
	}
	
	public String physicalAttack(Entity e)
	{
		if (physicalAttackPoints > e.physicalDefense) 
		{
			e.lifePoints -= Math.max(physicalAttackPoints - e.physicalDefense, 0); 
			return "Tu lui a infligé " + (physicalAttackPoints - e.physicalDefense) + " de dégâts ! \nIl lui reste " + e.lifePoints + " points de vie."; 
		}
		else
		{
			return "Aucun dégât infligé ! \nIl lui reste " + e.lifePoints + " points de vie.";
		}
		
	}

	public String magicalAttack(Entity e)
	{
		if (magicalAttackPoints > e.magicalDefense) 
		{
			e.lifePoints -= Math.max(magicalAttackPoints - e.magicalDefense, 0); 
			return "Tu lui a infligé " + (magicalAttackPoints - e.magicalDefense) + " de dégâts ! \nIl lui reste " + e.lifePoints + " points de vie."; 
		}
		else
		{
			return "Aucun dégât infligé ! \nIl lui reste " + e.lifePoints + " points de vie.";
		}
	}
	@Override
	public String toString() {
		return name;
	}
	
}
