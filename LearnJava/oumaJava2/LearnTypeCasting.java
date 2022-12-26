package learnJava;

public class LearnTypeCasting 
{

	public LearnTypeCasting() 
	{
		/* Java Type Casting
			Type casting is when you assign a value of one primitive data type to another type.
			
			In Java, there are two types of casting:
			
			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		 */
		
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble; // Manual casting: double to int
	    
	    System.out.println(myInt+" "+myDouble+" "+myDouble2+" "+myInt2);

	}

}
