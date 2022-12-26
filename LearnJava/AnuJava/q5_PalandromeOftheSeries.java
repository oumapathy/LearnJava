package AnuJava;

public class q5_PalandromeOftheSeries 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ar[] = {10,20,30,55,55,30,20,10};
		boolean pal = true;
		for(int i=0;i<ar.length/2;i++)
		{
			int j=ar.length-i-1;
		//	System.out.println("ar["+i+"]="+ar[i]+" : ar["+j+"]="+ar[j]);
			if (ar[i]!=ar[j])
				pal = false;
		}
		if (pal)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
