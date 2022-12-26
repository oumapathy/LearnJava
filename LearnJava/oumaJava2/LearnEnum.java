package learnJava;

public class LearnEnum 
{
	
	/* An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
	To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
	Note that they are normally  be in uppercase letters (not a must): 
	
	Difference between Enums and Classes:
	-------------------------------------
	An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, 
	static and final (unchangeable - cannot be overridden).

	An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

	Why And When To Use Enums?
	Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
	
	*/
	
	
	enum Level
	{
		LOW,
		MED,
		HIGH,
		superhigh
	}
	
	

	public LearnEnum() 
	{
		System.out.println(Level.LOW);
		System.out.println(Level.superhigh);
		
		Level myVar = Level.MED;
		

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MED:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;
	    }

	    // The enum type has a values() method, which returns an array of all enum constants. 
	    // This method is useful when you want to loop through the constants of an enum:
	    
	    for (Level myVar2 : Level.values()) 
	    {
	    	  System.out.println(myVar2);
	    }
	    
		
		
	}

}
