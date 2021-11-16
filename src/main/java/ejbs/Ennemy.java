package ejbs;

public class Ennemy extends Entity {
	
	@Override
	public int attack(Entity e) {
		// TODO Auto-generated method stub
		if (physicalAttackPoints > magicalAttackPoints) e.lifePoints -= physicalAttackPoints - e.physicalAttackPoints; 
		else e.lifePoints -= magicalAttackPoints - e.magicalDefense; 
		return e.lifePoints;
	}
	public Ennemy() {
		this.lifePoints = 10; 
		this.magicalAttackPoints = 1; 
		this.physicalAttackPoints = 1 ; 
		this.physicalDefense = 1; 
		this.magicalDefense = 1; 
	}
	public Ennemy(int lifePoints, int physicalAttackPoints, int magicalAttackPoints, int physicalDefense, int magicalDefense) {
		this.lifePoints = lifePoints; 
		this.physicalAttackPoints = physicalAttackPoints; 
		this.magicalAttackPoints = magicalAttackPoints; 
		this.physicalDefense = physicalDefense; 
		this.magicalDefense = magicalDefense; 
	}
}
