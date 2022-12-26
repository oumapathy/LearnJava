package AnuJava;

public class q13_ReverseOftheString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String st = "one two three four five";
		String ar[] = st.split(" ");
		System.out.println(st);
		for(int i=ar.length-1;i>=0;i--)
			System.out.print(ar[i]+" ");
		System.out.println();
			

	}

}
