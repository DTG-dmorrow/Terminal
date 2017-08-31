package entity.EnemyCharacter;

import entity.Character;

public abstract class Enemy extends Character {
	
	//---------------------------Variables---------------------------------
	private double enemyBoostRatio;
	private EnemyType type = null;

	
	//--------------------------Constructors-------------------------------
	public Enemy(String newName, double newAttack, double newHealth, int newLevel) {
		super(newName, newAttack, newHealth, newLevel);
	}
	
	
	//-------------------------Other Methods---------------------------------
	
	
	
	
	//------------------------Mutator Methods----------------------------------
	public double getEnemyBoostRatio()
	{
		return enemyBoostRatio;
	}
	
	public void setEnemyBoostRatio(double newRatio)
	{
		this.enemyBoostRatio = newRatio;
	}

}
