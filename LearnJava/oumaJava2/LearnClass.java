package learnJava;

import learnJava.LearnInnerClass.MyInnerClass;

// Since i am subclassing this class, should not use final
//final public class LearnClass 


//	Modifier , refer https://www.w3schools.com/java/java_modifiers.asp



// 	To create a class, use the keyword class:
public class LearnClass 

{
	//	class attributes are variables within a class
	int i;
	//	The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
	final double pi = 22f/7;

	/*  LEARN ACCESS MODIFIER FOR CONSTRUCTOR  */
	
	// Public Constructor . Can be access outside a package also.
	public LearnClass() 
	{
		System.out.println("Public Constructor");
		ChildClass childClass = new ChildClass(); // Instantiating child class
	//	ChildAbstractClass childAbstractClass = new ChildAbstractClass(); Cannot instantiatiate an abstract class
		ImpelemntedAbstractClass impelemntedAbstractClass = new ImpelemntedAbstractClass();
		
		ImplementInterface implementInterface = new ImplementInterface();
		implementInterface.start();
		implementInterface.end();
		
		ImplementMultipleInterfaces implementMultipleInterfaces = new ImplementMultipleInterfaces();
		implementMultipleInterfaces.start();
		implementMultipleInterfaces.end();
		implementMultipleInterfaces.print();
		System.out.println("Testing constructor.");
	//	LearnClassPublic learnClassPublic = new LearnClassPublic(); // Instantiating child class
	//	ChildClass childClass1 = new ChildClass(); // Instantiating child class
		SuperChildClass superChildClass = new SuperChildClass(); // Instantiating child class
		
		System.out.println("Testing polymorphism");
		Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();

		LearnInnerClass learnInnerClass =  new LearnInnerClass();
		LearnInnerClass.MyInnerClass myInnerClass = learnInnerClass.new MyInnerClass(); 	// Creation of Inner class instance
		myInnerClass.print();
		//LearnInnerClass.PrivateInnerClass privateInnerClass = learnInnerClass.new PrivateInnerClass(); 	// Creation of Inner class instance
		
		//	An inner class can also be static, which means that you can access it without creating an object of the outer class:
		LearnInnerClass.StaticInnerClass staticInnerClass = new LearnInnerClass.StaticInnerClass();
		
		

	}
	
	// This is a private (access modifier) constructor. Can be accessed only within the same class
	private LearnClass(int i) {System.out.println("Private Constructor");}
	
	// This is default (access modifier) for Constructor. Can be accessed within the same package.
	LearnClass(String name) {System.out.println("Default Constructor, "+name);}
	
	public void callingPrivateConstuctorWithinAClass()
	{
		LearnClass myclass1 = new LearnClass(1);
		System.out.println("calling Private Constuctor Within A Class");
	
	}
	
}


