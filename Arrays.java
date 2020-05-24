package java_basics;

public class Arrays {

public static void main(String[] args) {
	
	// declaring and initialising array with 100 slots - array has ability to store 100 elements.
	// integer array can only store integers
	int [] values = new int[100];
	
	values[0] = 1000; // first arr value
	values[99] = 93432; // last arr value
	
	// all slots not assigned data are initialised with 0
	System.out.println(values[99]);
	
	String [] words = new String[] {"My", "name", "is", "Mike"};
	
	System.out.println(words[3]);
	}
}
