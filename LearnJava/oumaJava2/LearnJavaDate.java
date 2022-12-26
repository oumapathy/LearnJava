package learnJava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class LearnJavaDate 
{
	/*
	 * Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. 
	 * The package includes many date and time classes.  
	 */
	

	public LearnJavaDate() 
	{
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    LocalTime  localTime= LocalTime.now(); // To display like 19:24:19.280962
	    System.out.println(localTime);
	    
	    LocalDateTime localDateTime = LocalDateTime.now(); // To display like 2022-08-31T19:24:19.281055
	    System.out.println(localDateTime);
	    
	    // Formating date
	    System.out.println("Before formatting: " + localDateTime);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = localDateTime.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}
