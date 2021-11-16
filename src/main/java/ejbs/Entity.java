package ejbs;

public abstract class Entity {
	protected int lifePoints; 
	protected int physicalAttackPoints; 
	protected int magicalAttackPoints; 
	protected int physicalDefense; 
	protected int magicalDefense;
	protected String name;
	
	public abstract void action (Entity e);
	
	public int autoAttack(Entity e) {
		// TODO Auto-generated method stub
				if (physicalAttackPoints > magicalAttackPoints) e.lifePoints -= physicalAttackPoints - e.physicalAttackPoints; 
				else e.lifePoints -= Math.max(magicalAttackPoints - e.magicalDefense, 0); 
				return e.lifePoints;
	}
}
