package learnJava;

public class LearnInterfaceClass 
{

	public LearnInterfaceClass() 
	{
		// TODO Auto-generated constructor stub
		
		NewBill mybill=null;
		
		int menu = 2;
		switch (menu)
		{
			case 1:
			{
				mybill = new Indiabill();
				break;
			}
			case 2:
			{
				mybill = new Japanbill();
				break;
			}
			
		}
		
		mybill.print_bill();

		
	}

}

interface NewBill
{
	void print_bill();
}
interface Employee
{
	String get_employee_name(String first, String last);
}



//------------------
class Indiabill implements NewBill, Employee
{
	public String get_employee_name(String first, String last)
	{
		return "first" + " "+ last;
	}
	public void print_bill()
	{
		String symbol="Rs";
		double total = 101.0;
		System.out.println("WALLMAR, 12, 12th Cross Bharathi Nagar, Pondicherry ");
		System.out.println("-------------------------------------------------- ");
		
		System.out.print("Bill Amount: "+total);
		System.out.println(symbol);
		System.out.println("Sales person: "+get_employee_name("Anu","Ouamapathy"));
		System.out.println();
		
	}
}

//below class wil be implemented by japan team
class Japanbill implements NewBill, Employee
{
	public String get_employee_name(String first, String last)
	{
		return "last" + " "+ first;
	}
	
	public void print_bill()
	{
		String symbol = "¥";
		double total = 101.0;
		System.out.println("WALLMAR, 2-2-1 Ojima Koto-Ku Tokyo, 136-0072 Japan ");
		System.out.println("-------------------------------------------------- ");
		System.out.println("Sales person: "+get_employee_name("Anu","Ouamapathy"));
		System.out.print("Bill Amount: "+total);
		System.out.print(symbol);
		
	}
}


//....................... INTERFACE .....................

interface  MyInterface1
{
	//	Interface attributes are by default public, static and final
	int interfaceInt=100;
	
	//	Interface methods are by default abstract and public
	//	An interface cannot contain a constructor (as it cannot be used to create objects)

	void start();
	void end();
}



class ImplementInterface implements MyInterface1
{
	public void start() 
	{
		System.out.println("Start in ImpelemntInterface)");
	}
	public void end() 
	{
		System.out.println("End in ImpelemntInterface)");
	}

}


//	Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
//	However, it can be achieved with interfaces, because the class can implement multiple interfaces.
//	Note: To implement multiple interfaces, separate them with a comma (see example below).

interface  MyInterface2
{
	String interfaceString="Some String";	
	void print();
}
class ImplementMultipleInterfaces implements MyInterface1, MyInterface2
{
	public void start() 
	{
		System.out.println("Start2 in ImplementMultipleInterfaces)");
	}
	public void end() 
	{
		System.out.println("End2 in ImplementMultipleInterfaces)");
	}
	public void print() 
	{
		System.out.println("Print in ImplementMultipleInterfaces)");
	}

}
