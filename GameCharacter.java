public abstract class GameCharacter //abstract superclass.
{
	private String name;
	private int health;
	
	public GameCharacter() //default constructor.
	{
		this("Name", 0);
	}
	
	public GameCharacter (String name, int health) //constructor with parameters
	{
		this.name = name;
		this.health = health;
	}
	
	public void setName(String name) //mutator method
	{
		this.name = name;
	}	
	
	public String getName() //accessor method
	{
		return name;
	}
	
	public void setHealth(int health) //mutator method
	{
		this.health = health;
	}
	
	public int getHealth() //accessor method
	{
		return health;
	}
	
	public abstract String getAbility(); // abstract method
	
}

