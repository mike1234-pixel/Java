// INVOKING METHODS in class Methods

package java_basics;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Hello");
		
		// print method belongs to variable "out" which is part of 	"System" class
		
		// invoke method
		// (invoking method that belongs to MyUtils class)
	MyUtils.printSomeStuff("hello JAVA WORLD!");
	
	int myBigNum = MyUtils.printSomeStuff(25);
	System.out.println(myBigNum);
	
	MyUtils.sum2Numbers(9, 100);
	
	// capturing returned result in var:
	int myVar = MyUtils.add10(99);
	
	System.out.println(myVar);
	}
	
	
}

// DEFINING METHODS in class MyUtils

package java_basics;

public class MyUtils {

	// create method -- declare data type of parameter
	// can create different methods that take different data types as arguments, 
	// when invoking Java will figure out which version to run depending on the args you pass to it
	public static void printSomeStuff(String message) {
		System.out.println(message);
	}
	
	public static int printSomeStuff(int number) {
		int result = number + 5550;
		return result;
	}
	
	public static void sum2Numbers(int firstNum, int secondNum) {
		System.out.println(firstNum + secondNum);
	}
	
	// void methods cannot return a value
	// the 'int' preceding the function name is the return type (data type to be returned)
	public static int add10(int numeroUno) {
		int result = numeroUno+10;
		return result;
	}
}

// ---------------------------------------
// KEYWORDS
// first line of method definition referred to as the "method signature"
// inside the curly braces is the method body
// VOID = method does not return anything
// PUBLIC = "access modifier" - manages visibility of methods and variables
// if private then method should be used locally
// STATIC makes the method belong directly to its class, (as opposed to an instance of its class)

// to import a class from another package: import someOtherPackage.ExampleClassOne;
