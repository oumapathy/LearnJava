package learnJava;

// This is a public class, which can access outside the package
public class LearnClassPublic 
{

	public LearnClassPublic() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("LearnClassPublic() ");
	}
}
// Cannot have two public class in single file
//public class ChildClass


 class ChildClass extends LearnClassPublic
{
	ChildClass() {System.out.println("ChildClass() of LearnClassPublic()");}
	
}

class SuperChildClass extends ChildClass
{
	// 	In subclasses, the constrcttor of the super class is first executed followed by constructor of the subclass.
	SuperChildClass() {System.out.println("SuperChildClass() of LearnClassPublic() of LearnClassPublic()");}
	
}


//************ Defaut Class Access Modifier ***********
//Class without modifier is called default class and its accessible by classes in the same pacakge
 class exampleProtected
{

}

//************  Final Class Access Modifier ***********
//final modified for class cannot be subclassed
final class exampleForFinal
{

}
//class subClassForFinal extends exampleForFinal   		<---- This cannot be done for a final class.



// **************** ABSTRACT **********************

// Abstract class cannot be instantiated and may have partially implemented methods. If not implemented should have the keywoard 
// abstract in methods

abstract class AbstractClass
{
	AbstractClass() {System.out.println("Absract class");}
	abstract void myprinting();
}

// Abstract clas can be extended, but still remains Abstract (i.e. canoot be instantiated.
abstract class ChildAbstractClass extends AbstractClass
{
	ChildAbstractClass() {System.out.println("Child Absract class");}

}

// A class can extend abstract class, but should implement all abstract methods if we want them to be instantiated.
class ImpelemntedAbstractClass extends ChildAbstractClass
{
	ImpelemntedAbstractClass() {}
	void myprinting() {System.out.println("ImplementedAbstracTclass myprinting()");}
}


// ************ POLYMORPHISM **********

class Animal 
{
	  public void animalSound() 
	  {
	    System.out.println("The animal makes a sound");
	  }
}

class Pig extends Animal 
{
	public void animalSound() 
	{
		//	use super attribute to call methods from parent class.
		super.animalSound();
	    System.out.println("The pig says: wee wee");
	 }
}




class Dog extends Animal 
{
	  public void animalSound() 
	  {
	    System.out.println("The dog says: bow wow");
	  }
}
