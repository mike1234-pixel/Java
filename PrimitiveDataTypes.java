package java_basics;

public class VariablesContinued {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 9;
		// long data type for bigger numbers, add L to end of num
		long bigNumber = 10000000000000L;
		// short - max capacity = just over 32,000
		short shortNum = 32000;
		// byte - max capacity = 127
		byte reallySmallNum = 127;
		// default choice for decimal values
		double decimalVariable = 394.001;
		// data type float is also available
		boolean decision = true;
		// single character in single quotes
		char letter = 'b';
		
		System.out.println(num + bigNumber + shortNum + reallySmallNum);
	}
	
}

	// A NOTE ON STRINGS...
	// Unlike the other primitive data types, String is backed by a class specification and does not use a keyword
	// A string in Java is therefore an object and an instance of the String class
	
	package Strings;

public class Strings {
	
	public static void(String[] args) {
		
		String a = "hello";	
		String b = "there";
		
//		if(a == "hello") {
//			// DON'T USE THIS.
//		}
		
		// when comparing strings...
		
		if(a.equals("hello")){
			// USE THIS.
			// or for not equal ... !a.equals("hello")
			// to ignore case use .equalsIgnoreCase()
	}
}
