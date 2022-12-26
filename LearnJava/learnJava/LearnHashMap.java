package learnJava;

import java.util.HashMap; // import the HashMap class

public class LearnHashMap  
{
	/*
	 * Java HashMap 
	 * 
	 * In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with 
	 * an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of 
	 * another type (e.g. a String).
	 * 
	 * One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, 
	 * or the same type, like: String keys and String values:
	 * 
	 */

	public static void main(String argv[])
	{
		LearnHashMap l = new  LearnHashMap();
		
		
	}
	public LearnHashMap() 
	{
		// TODO Auto-generated constructor stub
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Add keys and values (Country, City)
	    capitalCities.put("England", "Londonn");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    String city = capitalCities.get("England"); //To access a value in the HashMap, use the get() method and refer to its key
	    System.out.println(city);
	    
	    int size1 = capitalCities.size();					//	To find out how many items there are
	    System.out.println(size1);
	    
	    for (String i : capitalCities.keySet()) 		// 	Use the keySet() method if you only want the keys.
	    {
	    	  System.out.println("value in hash: "+i);
	    }
	    
	    for (String i : capitalCities.values()) 		//	use the values() method if you only want the values
	    {
	      System.out.println(i);
	    }
	    
	    for (String i : capitalCities.keySet()) 		//	// Print keys and values
	    {
	    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    capitalCities.remove("England");		// To remove an item, use the remove() method and refer to the key:
	    
	    capitalCities.clear();					//	To remove all items
	    
	    // **********  for Integer Value *****
	    
	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) 
	    {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
	    


	}

}
