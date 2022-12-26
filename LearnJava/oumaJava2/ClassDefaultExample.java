package oumaJava2;

public class ClassDefaultExample 
{

	public ClassDefaultExample()
	{
	
	}
	public void callingMethodInDefaultClass()
	{
	
		ClassDefaultAccess my = new ClassDefaultAccess();
		my.printing();
	}
	public static void main(String argv[])
	{
		System.out.println("default example");
	}
	

}

// This is a default Access modifier for a class. This is visible only within the same package. Cannot be accessed outside the package.
class ClassDefaultAccess
{

	String name = "Somthing";
	void printing()
	{
		System.out.println("Pringing from myLocal Class and printing() Method");
	}

}