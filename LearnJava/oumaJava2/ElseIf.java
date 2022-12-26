package learnJava;

import java.util.Scanner;

public class ElseIf {

	public ElseIf() 
	{
		
		// Short hand elseif 
		// variable = (condition) ? expressionTrue :  expressionFalse;
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		learnIf();
		learnIfElse();
	}
	
	public static void learnIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of user: ");
		String name = sc.nextLine();
		if (name.equals("avinash"))
		{
			System.out.println("Is a bad boy.");
		}
		System.out.println("End of program");
	}
	
	public static void learnIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of user: ");
		String name = sc.nextLine();
		if (name.equals("avinash"))
		{
			System.out.println("Is a bad boy.");
		}
		else if (name.equals("rithika"))
		{
			System.out.println("Is a bad girl");
		}
		else
		{
			System.out.println("is good boy/girl");
		}
		int mark = 49;
		// Single line Else If
		String grade = (mark<50) ? "FAIL": "PASS";
		
		System.out.println(grade);
		System.out.println("End of program");
	}
}
