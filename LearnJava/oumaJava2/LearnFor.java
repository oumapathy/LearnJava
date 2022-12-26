package learnJava;

import java.util.Scanner;

public class LearnFor 
{

	public LearnFor() 
	{
		forStatement();
		learnBreak();
		forEach();

	
	}
	public void forEach()
	{
		/*
		 * for (type variableName : arrayName) {
			  // code block to be executed
			}
		
		*/
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
	}
	public static void forStatement()
	{
		/* 	Statement 1 is executed (one time) before the execution of the code block.

			Statement 2 defines the condition for executing the code block.

			Statement 3 is executed (every time) after the code block has been executed.
		 */
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		// increment by 2
		for(int i=1;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		// Decrement
		System.out.println("Decement");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		// For-each loop
		System.out.println("For Each loop");
		String[] cars = { "Bmw", "Tesla", "Honda", "Kia", "Maruthi"};
		for ( String mycar: cars)
		{
			System.out.println(mycar);
		}
		
		// Continue - break from current block , but continues the for statement.
		// break - breaks from for loop
		for(int i=1;i<=10;i++)
		{
			if (i==3) continue;
			System.out.println(i);
			if (i==5) break;
		}
		
	}// For
	
	public static void learnBreak()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.print("Enter name of user: ");
			String name = sc.nextLine();
			if (name.equals("ouma"))
				continue;
			System.out.println("REst of the code executes");
			
			// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
			
			
			if (name.equals("thanya"))
				break;
		}
		System.out.println("End of the program");

	} // learnBreak()


}
