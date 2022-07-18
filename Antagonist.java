public class Antagonist extends GameCharacter
{
	private String damage_resistance;
	
	public Antagonist()
	{
		this("0");
	}
	
	public Antagonist(String damage_resistance)
	{
		this(damage_resistance, "Name", 0);
	}
	
	public Antagonist (String damage_resistance, String name, int health)
	{
		super(name, health);
		this.damage_resistance = damage_resistance;
	}
	
	public void setDamage_resis(String damage_resistance)
	{
		this.damage_resistance = damage_resistance;
	}
	
	public String getDamage_resis()
	{
		return damage_resistance;
	}
	
	public String getAbility()
	{
		return "Antagonist activated a damage resistance of " + getDamage_resis();
	}
	
	@Override
	public String toString()
	{
		return "You created a antagonist with name: " + getName() + ", health: " + getHealth() + ", and special ability - damage resistance - of: " + getDamage_resis();
	}
}