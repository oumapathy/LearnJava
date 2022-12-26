package oumaJava2;

import oumaJava2.A.A1;

public class learnJava 
{

	class B
	{
		B()
		{
			System.out.println("Constrcotor of B");
		}
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		System.out.println("Oumapathy");
		A a = new A();
		
		A.A1 a1 =  a.new A1();
		
		learnJava l = new learnJava();
		learnJava.B b = l.new B();
		*/
		Anu anu1 = new Anu();
		anu1.name = "anu ouampathy";
		
		
		Anu.Rithika rithika1 = anu1.new Rithika();
		rithika1.school = "irvington";
		
		
		

	}

}

class Anu
{
	String name;
	int age;
	class Rithika
	{
		String school;
	}
}

class A
{
	String st;
	int i;
	class Anu
	{
		
	}
	
	
	
	A()
	{
		System.out.println("Constructor A()");
	}
	class A1
	{
		A1()
		{
			System.out.println("Constructor A1()");
		}		
	}
	
	
}
