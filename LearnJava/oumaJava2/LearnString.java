package oumaJava2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LearnString {

	public static void  main(String[] argv)
	{
		/* https://www.w3schools.com/java/java_strings.asp
		 * 
		 * 
		 */
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt1.toLowerCase());   // Outputs "hello world"
		
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); // Outputs 7
		
		CharSequence sub = txt2.subSequence(5, 20);
		System.out.println(sub.toString());
		System.out.println("Char at 0:"+sub.charAt(1));
		
		System.out.println("--------- String Split --------");
		String[] stringAr = txt2.split(" ");
		
		print(stringAr);
		String r=reverse("Oumapathy");
		System.out.println("REversed string :"+r);
		
		UniqueWords("oumapathy anu rithika anu ouma sarangapany rajeswari anu ");
		

	}
	static void print(String[] ar)
	{
		for (int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
	}
	static String reverse(String st)
	{
		String st1="";
		for(int i=0;i<st.length();i++)
		{
			st1=st.charAt(i)+st1;
		}
		return st1;
	}
	
	

}
