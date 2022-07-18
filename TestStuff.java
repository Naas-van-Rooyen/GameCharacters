public class TestStuff
{
	public static void main(String []args)
	{
		
		Protagonist g1 = new Protagonist("15", "Mark", 10); // Inheritance example	
		GameCharacter g2 = new Protagonist("20", "Dave", 15); // Polymorphism example	
		GameCharacter g3 = new Antagonist("12", "Carl", 20); // Polymorphism example

		System.out.println(g2); // Implicit calling of the toString() method
		System.out.println(g2.toString()); // Explicit calling of the toString() method
		
		System.out.println(g2.getAbility()); // Implementation of the abstract method
		System.out.println(g3.getAbility());

	}
}