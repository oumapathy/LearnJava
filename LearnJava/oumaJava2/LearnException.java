package learnJava;

/*
 * https://rollbar.com/blog/java-exceptions-hierarchy-explained/#:~:text=The%20class%20at%20the%20top,direct%20subclasses%20%2D%20Exception%20and%20Error.&text=The%20Exception%20class%20is%20used,application%20may%20need%20to%20handle.
 * 
 */

public class LearnException 
{

	public LearnException() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//shouldThrowException();
		testCatchException();
		//throwsException();

	}
	
	public static void shouldThrowException()
	{
		int[] myNumbers = {1, 2, 3};
	    System.out.println(myNumbers[10]); // error!
	}
	
	public static void throwsException()
	{
		if (10<20)
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	}
	
	public static void testCatchException()
	{
	
		int[] myNumbers = {1, 2, 3};
	
		try 
		{
		    //System.out.println(myNumbers[10]); // error!
		    int i = 2/0;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			  //  Block of code to handle errors
			System.out.println("\t\t\t ArrayIndexOutOfBoundsException EXCEPTION");

			System.out.println("The Exception Captured is getMessage(): "+e.getMessage());
			System.out.println("The Exception Captured is getLocalizedMessage(): "+e.getLocalizedMessage());
			e.printStackTrace();

		} 
		
		catch(ArithmeticException e) 
		{
			  //  Block of code to handle errors
			System.out.println("\t\t\t ArithmeticException EXCEPTION");

			System.out.println("The Exception Captured is getMessage(): "+e.getMessage());

		} 
		catch(Exception e) 
		{
			System.out.println("\t\t\t OTHER EXCEPTION");
			System.out.println("The Exception Captured is getMessage(): "+e.getMessage());
			
		}
		
		finally 
		{
			System.out.println("AFter the try and catch, in finally");
		}
	}

}
