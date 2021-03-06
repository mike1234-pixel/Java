// Buffered file reader - old file reading method

package com.mike.learningFileReader;

import java.io.*; // imports all classes in java.io package

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		// instead of using Scanner can use fileReader
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		// must declare bufferedReader and fileReader globally to start so it's accessible to finally block, so we can close it
		
		try {
			fileReader = new FileReader(file);
			// reads everything in characters
			bufferedReader = new BufferedReader(fileReader);
			// takes a file reader object and goes line by line reading the data
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			//	e.printStackTrace();
			System.out.println("***!!!RED ALERT!!!***file not found***!!!RED ALERT!!!***");
		} catch (IOException e) {	
			// If bufferedReader throws an error program goes to this catch block
			// e.printStackTrace();
			System.out.println("***!!RED-ALERT!!***problem reading file***!!RED-ALERT!!***");
		} finally {
			// finally block is a place we close the resources that are being used
			// close the bufferedReader
			try {
				if (bufferedReader != null) {
				bufferedReader.close();
				} // dealing with Null pointer exception here - if bufferedReader is null it means it was never initiated, so it doesn't need closing
				if (fileReader != null) {
					fileReader.close();
					}
			} catch (IOException e) {
				System.out.println("bufferedReader is not closing. ****ABORT PROGRAM****");
			}
		}
	}

}
