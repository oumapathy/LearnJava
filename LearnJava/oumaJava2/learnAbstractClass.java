package learnJava;

public class learnAbstractClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bill mybill=null;
		
		int menu = 2;
		switch (menu)
		{
			case 1:
			{
				mybill = new India_bill();
				break;
			}
			case 2:
			{
				mybill = new Japan_bill();
				break;
			}
			
		}
		
		mybill.print_bill();
		
		
		
			

	}

}

abstract class Bill
{
	String symbol="$";
	double total = 101;
	abstract void print_bill();
}

//------------------
// india team develosp the below class
class India_bill extends Bill
{
	void print_bill()
	{
		symbol="Rs";
		System.out.println("WALLMAR, 12, 12th Cross Bharathi Nagar, Pondicherry ");
		System.out.println("-------------------------------------------------- ");
		
		System.out.print("Bill Amount: "+total);
		System.out.println(symbol);System.out.println();
		
	}
}

// below class wil be implemented by japan team
class Japan_bill extends Bill
{
	
	void print_bill()
	{
		symbol = "¥";
		System.out.println("WALLMAR, 2-2-1 Ojima Koto-Ku Tokyo, 136-0072 Japan ");
		System.out.println("-------------------------------------------------- ");
		
		System.out.print("Bill Amount: "+total);
		System.out.print(symbol);
		
	}
}