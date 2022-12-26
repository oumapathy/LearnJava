 package learnJava;

import java.util.Scanner;

public class LearnArray 
{

	public LearnArray() 
	{
		learnArrayUsage();
		multidimensionalArray();

	}
	
	public static void learnArrayUsage()
	{
		Scanner sc = new Scanner(System.in);
		String st ;

		//	To declare an array, define the variable type with square brackets:

		String[] name = new String[5]; // String array declaration and String Array creation.
		for(int i=0;i<5;i++)
		{
			System.out.print(i+"Enter name of the student: ");
			st = sc.nextLine();
			name[i] = st; 	
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]); 	
		}	
		
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // String array static initilization
		for (int i=0;i<7;i++) System.out.println(days[i]);
		
		
		int marks[] = {10,30,50,40}; // integer array static initilization 
		for (int i=0;i<marks.length;i++) System.out.println(marks[i]); //  array length 
		
		int[][] matrix = { {0,20,30}, {100,300,400}};  // Multi dimentional array declaration and static initialization
		int k = matrix[1][1]; // accessing multi dimensional array [row][col]
		System.out.println("Value of the array in multi dimentional array: "+k);
		
	}// learnArray()
	
	public void multidimensionalArray()
	{
		int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };		// Initialization and Decalartion
		int x = myNumbers2[1][2]; 								// Accessing indidivudal element
		System.out.println(x); // Outputs 7
		
		// Looping through array
		for (int i = 0; i < myNumbers2.length; ++i) 
		{
		      for(int j = 0; j < myNumbers2[i].length; ++j) 
		      {
		        System.out.println(myNumbers2[i][j]);
		      }
		}
	
	}//multidimensionalArray()

}
