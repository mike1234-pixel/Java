package com.mike.learningFileReader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("text.txt");

		// TRY WITH RESOURCES
		//___________________
		// New Java 7 syntax
		// Makes Java code less verbose 
		// The ability to close files is taken care of automatically
		// We don't have to specifically close the resources involved.
		
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {

			System.out.println("***!!!RED ALERT!!!***file not found***!!!RED ALERT!!!***");
		} catch (IOException e) {	
			// If bufferedReader throws an error program goes to this catch block
		
			System.out.println("***!!RED-ALERT!!***problem reading file***!!RED-ALERT!!***");
		} 
	}

}
