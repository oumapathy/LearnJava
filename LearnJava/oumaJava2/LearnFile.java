package learnJava;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LearnFile {

	public LearnFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Learn java File handling");
		usingFile();
	}
	static void usingFile()
	{
		String filename = "/Users/sarangao/Downloads/filetest.txt"; 
		String filename1 = "/Users/sarangao/Downloads/input.txt";

		try
		{
			/* Creating a new file */
			File f = new File(filename);
			
			boolean fileCreated = f.createNewFile();
			
			if (fileCreated)
				System.out.println("Yes file created "+filename);
			else
				System.out.println("No, file NOT created "+filename);

			/* Reading a file */
			char[] array = new char[100];
			FileReader input = new FileReader(filename1);

		      // Reads characters
		    input.read(array);
		    
		    System.out.println("Data in the file:");
		    System.out.println(array);

		      // Closes the reader
		     input.close();
		     
		     /* Writing to a file */
		     String data = "This is the data in the output file";
		     // Creates a Writer using FileWriter
		     FileWriter output = new FileWriter("/Users/sarangao/Downloads/output.txt");

		     // Writes string to the file
		     output.write(data);
		     System.out.println("Data is written to the file.");

		     // Closes the writer
		     output.close();
			
				
			//f.createNewFile();
			
			
		}
		catch (Exception e)
		{
			System.out.println("Cannot create file: "+e.getMessage());
		}
		
	}

}
