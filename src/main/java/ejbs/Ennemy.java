package ejbs;

import java.util.Random;

public class Ennemy extends Entity {
	
	
	public Ennemy() {
		Random random = new Random();
		this.lifePoints = random.nextInt(10); 
		this.magicalAttackPoints =random.nextInt(10); 
		this.physicalAttackPoints =random.nextInt(10) ; 
		this.physicalDefense =random.nextInt(10); 
		this.magicalDefense = random.nextInt(10);
		this.name= NomsEnnemis.aleatoire().name() ;
	}
	public Ennemy(int lifePoints, int physicalAttackPoints, int magicalAttackPoints, int physicalDefense, int magicalDefense,String name) {
		this.lifePoints = lifePoints; 
		this.physicalAttackPoints = physicalAttackPoints; 
		this.magicalAttackPoints = magicalAttackPoints; 
		this.physicalDefense = physicalDefense; 
		this.magicalDefense = magicalDefense; 
		this.name=name;
	}
	
}
