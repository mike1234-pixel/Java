package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ARRAYLIST
		ArrayList<String> words = new ArrayList<String>();
		// flexible, resizable array
		// can add multiple data types
		// they will however be cast as objects by default in the array
		
		
		// Java is a type safe language - it forces the developer to know on every single line what a variable's data type is
		// <> GENERIC COLLECTIONS - forces data in an ArrayList to be of a particular type
		// enforcing type using <> is called 'Parameterisation'
		
		words.add("hello");
		words.add("world");
		System.out.println(words);
		words.remove("0");
		System.out.println(words);
		words.add("10");
		words.add("12.00");
		words.add("H");
		System.out.println(words);
		
		// Unless <> is specified...
		// object is the parent of every single data type in Java
		// .get() here returns an object, so...
		// have to cast object data type to string as follows:
		String item1 = (String) words.get(0);
		System.out.println(item1);
		Object item2 = words.get(1);
		System.out.println(item2);
		
		// LINKEDLIST
		// only complex data types can be inside the angle brackets in a LinkedList, not primitives
		// To get around this rather than using int we use the wrapper class Integer
		// Other wrapper classes: <Double><Float>
		// String is a complex data type anyway 
		
		// ArrayLists use array as the data structure, whereas LinkedLists use node objects
		
		// the array list is faster for retrieving data
		// the linked list is faster for manipulating data - to retrieve values the linked list has to be traversed
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(99);
		numbers.add(43);
		
		// number.remove(); would remove the first data value inserted - 1 in this case
		
		System.out.println(numbers.get(0) + numbers.get(1)); // should print 3
	
		for (int number: numbers) {
			System.out.println(number); // print: 1 2 99 43

		}
	}
