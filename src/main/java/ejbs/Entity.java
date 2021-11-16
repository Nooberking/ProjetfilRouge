package ejbs;

public abstract class Entity {
	protected int lifePoints; 
	protected int physicalAttackPoints; 
	protected int magicalAttackPoints; 
	protected int physicalDefense; 
	protected int magicalDefense; 
	
	public abstract int attack (Entity e); 
}
