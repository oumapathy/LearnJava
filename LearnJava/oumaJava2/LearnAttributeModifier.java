package learnJava;

public class LearnAttributeModifier 
{
	final String final_name = "final name";	 // Final cannot be over written
	static String static_name = "Static name"; // static is one copy for all objects, its for a class. 
	//abstract String abstract_name = "abstract name"; // abstract can only be used in abstract class

	public LearnAttributeModifier(String static_name1)
	{
		static_name = static_name1;
	}
	
	public void testing()
	{
//		final_name = "modifying final"; --> Cannot modify a final attribute
		;
		System.out.println("Static_name: "+static_name);
	
	}
	
	
}

