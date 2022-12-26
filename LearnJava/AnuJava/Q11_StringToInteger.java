package AnuJava;

public class Q11_StringToInteger {

	public static void main(String[] args) 
	{
		System.out.println("WJP to convert string to int\n");
		// Using collection class
		String st="1234";
		System.out.println("Original String: "+st);
		int num=0;
		for(int i=0;i<st.length();i++)
		{
			int digit=st.charAt(i)-'0';
			num=num*10+digit;
			System.out.println((int)st.charAt(i)+"  "+digit);
		}
		System.out.println(num);
	}

}
