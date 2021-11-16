package ejbs;

public class PhysicalBomb extends Items {
		
	public final int PHYSICAL_BOMB_DAMMAGES=20;
	
	@Override
	public void itemEffect(Entity e) 	
	{
		e.lifePoints-=Math.max(PHYSICAL_BOMB_DAMMAGES-e.magicalDefense,0);	
	}


}
