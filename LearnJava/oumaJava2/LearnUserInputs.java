package learnJava;

import java.util.Scanner;

public class LearnUserInputs 
{

	public LearnUserInputs() 
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
	    System.out.print("Enter username: ");
	    String userName = myObj.nextLine();  // Read user input - String
	    System.out.println("Username is: " + userName);  // Output user input
	    
	    
	    int i = myObj.nextInt();  // Read user input - int
	    System.out.println(i);  

	    /* 
	     * 	nextBoolean()	Reads a boolean value from the user
			nextByte()	Reads a byte value from the user
			nextDouble()	Reads a double value from the user
			nextFloat()	Reads a float value from the user
			nextInt()	Reads a int value from the user
			nextLine()	Reads a String value from the user
			nextLong()	Reads a long value from the user
			nextShort()	Reads a short value from the user
	     */
	    

	    
	    
		
	}

}
