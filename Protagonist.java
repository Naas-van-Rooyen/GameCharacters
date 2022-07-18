public class Protagonist extends GameCharacter
{
	private String damage_boost;
	
	public Protagonist()
	{
		this("0");
	}
	
	public Protagonist(String damage_boost)
	{
		this(damage_boost, "Name", 0);
	}
	
	public Protagonist(String damage_boost, String name, int health)
	{
		super(name, health);
		this.damage_boost = damage_boost;
	}
	
	public void setDamage_boost(String damage_boost)
	{
		this.damage_boost = damage_boost;
	}
	
	public String getDamage_boost()
	{
		return damage_boost;
	}
	
	public String getAbility()
	{
		return "Protagonist activated a damage boost of " + getDamage_boost();
	}
	
	@Override
	public String toString()
	{
		return "You created a protagonist with name: " + getName() + ", health: " + getHealth() + ", and special ability - damage boost - of: " + getDamage_boost();
	}
}