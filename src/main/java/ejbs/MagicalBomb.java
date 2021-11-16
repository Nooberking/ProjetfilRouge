package ejbs;

public class MagicalBomb extends Items {

	public final int  MAGICAL_BOMB_DAMMAGES = 20;
	@Override
	public void itemEffect(Entity e)
	{
		e.lifePoints-=Math.max(MAGICAL_BOMB_DAMMAGES-e.magicalDefense,0);
		
	}

}
