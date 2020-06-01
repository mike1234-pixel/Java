import java.io.File;
import java.io.FileNotFoundException; // for error handling
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	// *** taking input from user and giving response (via the console) ***	
		for (int i = 0; i <= 10; i++) {
			Scanner input = new Scanner(System.in);
			if (i == 0) {
			System.out.println("Enter text.");	
			} else if (i == 1) {
				System.out.println("Enter more text.");
			} else if (i == 2) {
				System.out.println("Enter more text again.");
			} else if (i == 3) {
				System.out.println("Enter more text again please.");
			} else if (i == 4) {
				System.out.println("Enter even more text.");
			} else if (i == 5) {
				System.out.println("Enter even more text again.");
			} else if (i == 6) {
				System.out.println("Enter even more text again please.");
			} else if (i == 7) {
				System.out.println("Keep entering text.");
			} else {
				System.out.println("Keep entering text.");
			}
			
			String enteredText = input.nextLine();
			System.out.println(enteredText);
		}
		
	// *** reading data from text file and printing to console ***
		
		// EXCEPTION HANDLING:
		// wrapped in try/catch in the event that the file cannot be found
		try {
		File file = new File("text.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close(); // close the Scanner
		} catch (FileNotFoundException e) {
			System.out.println("***ALERT***!FILE NOT FOUND!***ALERT***");
			e.printStackTrace();
		}

// INSTANCE OF CLASS IS DECLARED AND USED BELOW
// public class MyUtils {
//	public int subtract10FromLargerNumber(int number) throws Exception {
//		if(number < 10) {
//			throw new Exception("The number you passed is waaaayyyy to small. Over 10 please.");
			// this message is being passed to Exception's constructor, and will be thrown to whatever class calls it
		    // this Exception class belongs to Java but you can also make you're own Exception class and throw an instance of that if you want to 
//		}
//		return number -10;
//	}
//}

		
		MyUtils myUtil = new MyUtils();
		// need to declare new instance of class for it to work
		try {
			myUtil.subtract10FromLargerNumber(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("***ALERT***!SYSTEM ERROR!***ALERT***");
			e.printStackTrace();
		}
		
	}

}

// System.in is used for taking input from the user into the program
// Scanner is a java library from the util package
// this input variable will now have the ability to read input from the keyboard
// ---> to enter input, type directly into the console

// Scanner also allows you to read data from and write data to files, in combination with File
// *** be sure to put the text file in the top level of the project, otherwise Java won't find it ***
