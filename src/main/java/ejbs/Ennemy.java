package ejbs;

public class Ennemy extends Entity {
	
	
	public Ennemy() {
		this.lifePoints = 10; 
		this.magicalAttackPoints = 1; 
		this.physicalAttackPoints = 1 ; 
		this.physicalDefense = 1; 
		this.magicalDefense = 1;
		this.name="generic";
	}
	public Ennemy(int lifePoints, int physicalAttackPoints, int magicalAttackPoints, int physicalDefense, int magicalDefense,String name) {
		this.lifePoints = lifePoints; 
		this.physicalAttackPoints = physicalAttackPoints; 
		this.magicalAttackPoints = magicalAttackPoints; 
		this.physicalDefense = physicalDefense; 
		this.magicalDefense = magicalDefense; 
		this.name=name;
	}
	@Override
	public void action(Entity e) {
		// TODO Auto-generated method stub
		
	}
}
