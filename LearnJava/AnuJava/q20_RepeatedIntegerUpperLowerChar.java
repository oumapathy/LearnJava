package AnuJava;

import java.util.HashMap;
import java.util.HashSet;

public class q20_RepeatedIntegerUpperLowerChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				System.out.println("WJP to find total number of repeated integers, uppercase and lowercase character in the give string\n\n");
				
				String st = "anu oumapathy Ouma Olive Anu Anu9 9 8 7 58";
				System.out.println("original string: "+st);
				HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
				
				for(int i=0;i<st.length();i++)
				{
					char key=st.charAt(i);
					if (hash.containsKey(key))
					{
						int count=hash.get(key)+1;
						hash.put(key, count);
					}
					else
						hash.put(key, 1);
				}
				
				
				int count_integer=0;
				int count_upper=0;
				int count_lower=0;
				for(char ch:hash.keySet())
				{			
					//if it already contains the char, means this is 2nd time, so repeated, let us add the respective count now.
					if (hash.get(ch)<2)
						continue;
					if ((ch>='A')&&(ch<='Z'))
						count_upper++;
					
					if ((ch>='a')&&(ch<='z'))
						count_lower++;
					
					if ((ch>='0')&&(ch<='9'))
						count_integer++;
				}
				
				System.out.println("Repeated integers: "+count_integer);
				System.out.println("Repeated Upper: "+count_upper);
				System.out.println("Repeated Lower: "+count_lower);
	}

}
