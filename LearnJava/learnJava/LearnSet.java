package learnJava;
import java.util.HashSet; // Import the HashSet class

/*
 * A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

 * 
 * 
 */
public class LearnSet 
{

	public static void main(String argv[])
	{
		
	
		HashSet<String> cars = new HashSet<String>();		//	Create a HashSet object called cars that will store strings:
		cars.add("Volvo");									//	The HashSet class has many useful methods. For example, to add items to it, use the add() method:
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");									// even though added twice, it will occur only once in the set
	    cars.add("Mazda");
	    cars.add("Mazda");
	    System.out.println("Printing all the elements in cars: ");
	    System.out.println(cars);
	    System.out.println("-----------------------------");
	    
	    if (cars.contains("Mazda"))
	    	System.out.println("Yes mazda is present");
	    
	    cars.remove("Volvo");								//	To remove an item, use the remove() method:
	    System.out.println(cars);
	    
	    System.out.println(cars.size());					//	To find out how many items there are, use the size method
	    
	    for (String i : cars) 								//	Loop through the items of an HashSet with a for-each loop:
	    {
	    	  System.out.println(i);
	    }
	    
	    
	    cars.clear();										//	To remove all items, use the clear() method:
	    System.out.println(cars);
	    
	    
	    /*
	     * Items in an HashSet are actually objects. In the examples above, we created items (objects) of type "String". 
	     * Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. 
	     * For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
	     */
	    
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);

	    // Show which numbers between 1 and 10 are in the set
	    for(int i = 1; i <= 10; i++) 
	    {
	      if(numbers.contains(i)) 
	      {
	        System.out.println(i + " was found in the set.");
	      } else 
	      {
	        System.out.println(i + " was not found in the set.");
	      }
	    }

	}

}
