package AnuJava;

import java.util.HashSet;

public class q17_FindTotalIntUpperLowerChar 
{

	public static void main(String[] args) 
	{
		System.out.println("WJP to find total number of integers, uppercase and lowercase character in * the give string\n");
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char ch='A';ch<='Z';ch++)
			myUpper.add(ch);
		for(char ch='a';ch<='z';ch++)
			myLower.add(ch);
		for(char ch='0';ch<='9';ch++)
			myInteger.add(ch);
		
		String st = "oumapathy 12345 RITHIKA";
		int integer_count=0;
		int lower_count=0;
		int upper_count=0;
		
		Character.is
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if ((ch>='A') && (ch<='Z'))
				
			if (myInteger.contains(ch))
				integer_count++;
			if (myUpper.contains(ch))
				upper_count++;
			if (myLower.contains(ch))
				lower_count++;
		}
		
		
		
		System.out.println(st);
		System.out.println(myUpper+" total: "+upper_count);
		System.out.println(myLower+" total: "+lower_count);
		System.out.println(myInteger+" total: "+integer_count);
		
		
		
	}

}
