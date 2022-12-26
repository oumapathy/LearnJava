package learnJava;

import java.util.ArrayList;

import java.util.Collections;  // Import the Collections class


public class LearnArrayList 
{
	
	/* 
	 * 
	 * The ArrayList class is a resizable array, which can be found in the java.util package.

		The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
		(if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added 
		and removed from an ArrayList whenever you want
	 */

	public static void main(String argv[])
	{
		
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		
		cars.clear();			//		To remove all the elements in the ArrayList
		    
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Mazda");// duplicate can be added

	    System.out.println(cars);
	    
	    String car1=cars.get(0); //		Access an item
	    System.out.println(car1);
	    
	    int size1= cars.size();	//		To find out how many elements an ArrayList
	    
	    cars.set(0, "Opel"); 	//		To modify an element
	    
	    for (int i = 0; i < cars.size(); i++) 
	    {
	        System.out.println(cars.get(i));
	    }
	    
	    cars.remove(0);			//		To remove an element
	    
	   
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // ArrayList of Integers
	    myNumbers.add(10);
	    myNumbers.add(35);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    System.out.println(myNumbers);
	    
	    Collections.sort(cars);  // Sort Array of Strings
	    System.out.println(cars);
	    for (String i : cars) 
	    {
	      System.out.println(i);
	    }
	    
	    Collections.sort(myNumbers);  // Sort Array of Integers 
	    System.out.println(myNumbers);
	    
	    
	    
		
	}

}
