package oumaJava2;
import java.util.ArrayList;
import java.util.Scanner;


public class test 
{



	public static void main(String[] args) 
	{
		welcomeScreen();
		LearnVariable learnVariable = new LearnVariable();
		LearnTypeCasting learnTypeCasting = new LearnTypeCasting();
		LearnString learnString = new LearnString();
		ElseIf elseIf = new ElseIf();
		LearnFor learnFor = new LearnFor();
		LearnArray learnArray = new LearnArray();
		LearnMethod learnMethod = new LearnMethod();
		LearnClass learnClass = new LearnClass();
		LearnEnum learnEnum = new LearnEnum();
		LearnUserInputs learnUserInputs = new LearnUserInputs();
		LearnJavaDate learnJavaDate = new LearnJavaDate();
		LearnArrayList learnArrayList = new LearnArrayList();
		LearnLinkedList learnLinkedList = new LearnLinkedList();

		LearnHashMap learnHashMap = new LearnHashMap();
		LearnSet learnSet = new LearnSet();
		
		Student s = new Student();
		
		 ArrayList<Student> myNumbers = new ArrayList<Student>(); // ArrayList of Integers
		 myNumbers.add(s);
		 
		 Student anu = new Student();
		 myNumbers.add(anu);
		 
		 
		
		
		

		
		
		
	

		//asciiPrinting();
		//LearnPackages learnPackages = new LearnPackages();
		//learnWhile();
		//learnDoWhile();		
		//learnSwitch();
		//learnArray();
		//learnFunction();
		//learnClass();
		//learnDefaultClass();
		//learnModifier();
	}
	
	public static void asciiPrinting()
	{
		String st = "Friday started for you already?";
		for (int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			int j=ch;
			System.out.print(j+" ");
			
		}
	}
	
	
	public static void learnWhile()
	{
		Scanner sc = new Scanner(System.in);
		String name = "dummy string";
		while(!name.equals("thanya"))
		{
			 System.out.print("Enter the name of the user: ");
			 name = sc.nextLine();
		}
	}// learnWhile()
	public static void learnDoWhile()
	{
		Scanner sc = new Scanner(System.in);
		String name;
		do 
		{
			 System.out.print("Enter the name of the user: ");
			 name = sc.nextLine();
		}
		while(!name.equals("thanya"));
	}// learnDoWhile()
	
	public static void learnSwitch()
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int day = Integer.parseInt(st);
		switch (day)
		{
			case 1 : 				
				System.out.println("Saturday holiday");
				break;
			case 2 : 				
				System.out.println("Sunday holiday");
				break;
			default:
				System.out.println("working day");
		}
		
	}// learnSwitch()
	
	

	



	public static void welcomeScreen()
	{
		System.out.println("Welcome to the Java world - Ouma");
	}
	


	
	
}// for class test



