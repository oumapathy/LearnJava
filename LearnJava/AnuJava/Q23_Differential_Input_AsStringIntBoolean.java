package AnuJava;
import java.util.*;


public class Q23_Differential_Input_AsStringIntBoolean {

	public static void main(String[] args) 
	{
		System.out.println("WJP to differentiate input as string, int or bool \n");
		Scanner sc=new Scanner(System.in);
		if (sc.hasNextInt())
		{
			int i = sc.nextInt();
			System.out.format("%d Its an Integer",i);
		}
		else if (sc.hasNextBoolean())
		{
			boolean b=sc.nextBoolean();
			System.out.format("%b Its an Boolean",b);
			
		}
		else 
		{
			String st=sc.next();
			System.out.format("%s Its a String",st);
		}


	}

}
