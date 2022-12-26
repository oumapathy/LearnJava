package AnuJava;
import java.lang.Character;

public class Q22_intToString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=1234;
		System.out.println("Using Integer class: "+Integer.toString(i));
		System.out.println("Using String: "+String.valueOf(i));	
		System.out.println("Using String format:"+String.format("%d", i));
		
		
		String st="";
		while (i>0)
		{
			int a = i/10;
			int b = a*10;
			int digit = i-b;
			
			System.out.println(a+" "+b+" "+digit);
			i= i/10;
			st=digit+st;
		}
		System.out.println("The string is: "+st);
		
		String st1="1234";
		int j= Integer.parseInt(st);
		
		
	
		
		
	}

}
