package Collections5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		
		// a LinkedHashMap preserves the order in which the data was inserted.
		// An alternative to a HashMap or a LinkedHashMap is a TreeMap which sorts the keys in their natural order, which in the case of strings is alphabetic
		LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		
		// in a HashMap every piece of data is considered an entry, which contains a key and a value
		// words --> definitions
		// complex data types only, no primitives.
		// each key / value is referred to as an 'entry set'
		
		// .put() to add data to HashMap
		dictionary.put("Duck", "A swimming beast hailing from Scotland, whom the simple Scotch folk call 'the beastie'.");
		dictionary.put("Stunning", "Bruce Jenner");
		dictionary.put("Brave", "Bruce Jenner");
		
		System.out.println(dictionary);
		
		for (String word: dictionary.keySet()) {
			
			System.out.println(word);// prints the keys
			System.out.println(dictionary.get(word)); // prints the values
			
		}
		
		System.out.println("________________PRINT KEY AND VALUE________________");
		
		// to print both the key and value:
		for( Map.Entry<	String, String> entry : dictionary.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		
	}

}
