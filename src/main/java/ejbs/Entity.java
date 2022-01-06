package ejbs;

public abstract class Entity {
	protected int lifePoints; 
	protected int physicalAttackPoints; 
	protected int magicalAttackPoints; 
	protected int physicalDefense; 
	protected int magicalDefense;
	protected String name;
	
	
	
	public int getLifePoints() {
		return lifePoints;
	}



	public int getPhysicalAttackPoints() {
		return physicalAttackPoints;
	}



	public int getMagicalAttackPoints() {
		return magicalAttackPoints;
	}



	public int getPhysicalDefense() {
		return physicalDefense;
	}



	public int getMagicalDefense() {
		return magicalDefense;
	}



	public String getName() {
		return name;
	}



	public int autoAttack(Entity e) {
		// Permet d'attaquer automatiquement l'entité e
				if (physicalAttackPoints > magicalAttackPoints) e.lifePoints = Math.max(e.lifePoints - Math.max(physicalAttackPoints - e.physicalDefense,0),0) ; 
				else e.lifePoints = Math.max(e.lifePoints - Math.max(magicalAttackPoints - e.magicalDefense, 0),0); 
				return e.lifePoints;
	}
	
	
}
