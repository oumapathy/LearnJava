package AnuJava;

public class q16_RemvoeGivenCharInString 
{

	public static void main(String[] args) 
	{
		System.out.println("Write a method that will remove given character from the String? ");
		String st = "Oumapathy is a smart boy. And Rithika is a bad girl";
		char ch='b';
		int i=st.indexOf(ch);
		System.out.println(st);
		String first_half=st.substring(0, i);
		String second_half=st.substring(i+1);
		String new_string =first_half+second_half;
		System.out.println(new_string);
	}
}
