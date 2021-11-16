package ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public abstract class Items 
{
	protected String ItemName;
	public  abstract void itemEffect(Entity e);

}
