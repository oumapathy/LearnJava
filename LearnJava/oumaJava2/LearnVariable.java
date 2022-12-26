package oumaJava2;

import java.util.Scanner;

public class LearnVariable 
{

	public LearnVariable() 
	{
		//Decalartion of variable
		
		byte byte1; 	// Type byte , use one byte, Stores whole numbers from -128 to 127
		short short1;	// 2 bytes, Stores whole numbers from -32,768 to 32,767
		
		String name; // Type String
		int i; 		// 4 bytes, Type int, Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long long1;	// 8 bytes, Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		char ch; 	// 2 bytes, Type char
		float fl; 	// 4 bytes, Type float, max 32 bit, 3.40282347 x 10^38, 1.40239846 x 10^45, Sufficient for storing 6 to 7 decimal digits
		double d;	//	8 bytes, Type double , max 64 bit, 1.7976931348623157 x 10308, 4.9406564584124654 x 10-324, Sufficient for storing 15 decimal digits
		boolean b;	// 1 bit, Type boolean True or False
		
		
		//Assignment
		name = "Oumapathy";
		i = 100;
		ch = 'A';
		fl = 0.23f;
		d = 2343.34f;
		b = true;
		byte1=1;
		
				
		//Using Variable
		System.out.println(name);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(fl);
		System.out.println(d);
		System.out.println(b);
		System.out.println("Byte : "+byte1);

		if (b)
			System.out.println("Its True");
		else
			System.out.println("Its false");
		
		learnIntegerConversion();
		multipleVariables();


		
	}
	public void multipleVariables()
	{
		int x = 5, y = 6, z = 50; 		// Many varaibles declared in single line.
		x = y = z = 50;					// Assigned single value to multiple varible.
	}
	
	public  void learnIntegerConversion()
	{
		String integerInString = "1001";
		int i = Integer.parseInt(integerInString);
		
		if (i == 1001)
		{
			System.out.println("its 1001");
		}
	} // learnIntegerConversion

}
