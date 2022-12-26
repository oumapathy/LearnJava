 package learnJava;

public class LearnMethod 
{

	public LearnMethod() 
	{
		methodOverLoading();
	}
	
	
	//	static means that the method belongs to the Main class and not an object of the Main class. 
	
	// void means that this method does not have a return value.
	public void myStaticMethod() 
	{
		
	}
	
	
	//	With method overloading, multiple methods can have the same name with different parameters:
	
	static int plusMethod(int x, int y) 
	{
		  return x + y;
	}
	
	/* Cannot overload method with same parameter type/number and different return type. Parameter should be different for method overloading.
	static String plusMethod(int x, int y) 
	{
		  return "Method overloading String return";
	}*/

	static double plusMethod(double x, double y) 
	{
		  return x + y;
	}

	public static void methodOverLoading() 
	{
		int myNum1 = plusMethod(8, 5);
		  double myNum2 = plusMethod(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
	}
	
	

} // class LearnMethod
