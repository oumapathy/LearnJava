package AnuJava;

public class q19_DisplayNumberOfOccurancesOfChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("WJP to display number of occurrence of all character *");
		String st = "Oumapathy";
		char ch='a';
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if (st.charAt(i)==ch)
					count++;
		}
		System.out.println("Number of occurances of ["+ch+"] in ["+st+"] is "+count);

	}

}
