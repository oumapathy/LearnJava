package oumaJava2;

import java.util.Arrays;
import java.util.HashSet;

public class hathaton {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		q15_UniqueWords("oumapathy anu rithika anu ouma sarangapany rajeswari anu ");
		System.out.println(q16_removeGivenCharFromString("Oumapathy",'p'));
		

	}
	static String q16_removeGivenCharFromString(String st,char ch)
	{
		int i = st.indexOf(ch);
		System.out.println("Index:"+i);
		st = st.substring(0, i)+st.substring(i+1);
		return st;
		
	}
	static void q15_UniqueWords(String st)
	{
		String ar[] = st.split(" ");
		print(ar);
		HashSet<String> cars = new HashSet<String>(Arrays.asList(ar));
		System.out.println("Unique set");
		System.out.println(cars);
	}
	
	static void print(String[] ar)
	{
		for (int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
	}

}
