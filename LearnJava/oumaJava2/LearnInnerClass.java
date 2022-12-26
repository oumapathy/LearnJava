package learnJava;

public class LearnInnerClass 
{
	String outerClassString = "Ouma outer class string";	//	
	static class StaticInnerClass
	{
		StaticInnerClass() {System.out.println("StaticInner Class constructor");}
		String staticString="oumapathy";
		
	}
	
	public LearnInnerClass() {System.out.println("Outer Class constructor");}
	
	
	/*  Private inner classes is not visible outside the class.
	 * Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, 
	 * declare the class as private:
	 */
	
	private class PrivateInnerClass
	{
		PrivateInnerClass() {System.out.println("Private Inner Class constructor: ");}
	}
	
	public class MyInnerClass
	{
		// One advantage of inner classes, is that they can access attributes and methods of the outer class:
		MyInnerClass() {System.out.println("The inner class Constructor."+outerClassString);}
		
		
		void print()
		{
			System.out.println("The inner classes.");
			PrivateInnerClass privateInnerClass = new PrivateInnerClass();
			
		}
	
	}

}
