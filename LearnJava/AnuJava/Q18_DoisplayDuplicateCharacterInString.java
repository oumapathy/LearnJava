package AnuJava;

import java.util.HashMap;

public class Q18_DoisplayDuplicateCharacterInString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("WJP to display duplicate character in string\n\n");
		
		String st = "anu oumapathy";
		System.out.println("original string: "+st);
		
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if (hash.get(ch)==null)
			{
				hash.put(ch, 1);
			}
			else
			{
				int count=hash.get(ch);
				hash.put(ch,count+1);
			}
		}
		
		System.out.println("Duplicate Chars  are");
		for (Character ch : hash.keySet()) 		//	// Print keys and values
		{
			int count=hash.get(ch);
			if (count>1)
				System.out.print(ch+" ");
		}
		System.out.println();
		
		for (Character ch : hash.keySet()) 		//	// Print keys and values
		{
	//		System.out.println("key: " + ch + " value: " + hash.get(ch));
		}
		
		

	}

}
