package AnuJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class q15_PrintUniqueWordOfString {

	public static void main(String[] args) 
	{
		System.out.println("Given a string print the unique words of the string\n\n");
		
		String st = "one two three four five four three two one ouma";
		String ar[]=st.split(" ");
		
		HashMap<String, Integer> unique = new HashMap<String, Integer>();

		for(String st1:ar)
		{
			System.out.print(st1+" ");
			if (unique.get(st1)==null)
			{
				unique.put(st1, 1);
			}
			else
			{
				int count=unique.get(st1);
				unique.put(st1,count+1);
			}
		}
		System.out.println();
		
		System.out.println("Unique words are");
		for (String i : unique.keySet()) 		//	// Print keys and values
		{
			int count=unique.get(i);
			if (count==1)
				System.out.println(i);
		}
		
		for (String i : unique.keySet()) 		//	// Print keys and values
		{
		//	System.out.println("key: " + i + " value: " + unique.get(i));
		}
		
		

	}

}
