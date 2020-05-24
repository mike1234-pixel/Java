package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// IF/ELSE STATEMENT
		
		boolean hungry = false;
		// if hungry is not false
		// !hungry == hungry
		if(!hungry == true){
			System.out.println("I'm starving...");
		} else {
			System.out.println("I'm not hungry...");
		}
		System.out.println("Hello control flow world.");
		
		
		// in this case ! result in not true, so else is executed
		int hungerRating = 5;
		if(!(hungerRating < 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving...");
		}
		
		int favouriteTemp = 100;
		int currentTemp = 100;
		String opinion;
		
	if(currentTemp == favouriteTemp) {	
		opinion = "perfect temperature!";
	} else {
		if (currentTemp < (favouriteTemp - 30)) {
			opinion = "It's pretty cold";
		} else if (currentTemp < favouriteTemp - 20) {
			opinion = "It's mild enough";
		} else if (currentTemp > favouriteTemp + 10) {
			opinion = "It's hot out!";
		} else {
			opinion = "It's a beautiful day";
		}
	}

		
		System.out.println(opinion);
		
		// SWITCH STATEMENT
		
		int month = 9;
		String monthString;
		
		switch(month) {
			case 1: monthString = "January";
			break; // exit switch statement
			case 2: monthString = "February";
			break;
			case 3: monthString = "March";
			break; 
			case 4: monthString = "April";
			break;
			case 5: monthString = "May";
			break; 
			case 6: monthString = "June";
			break;
			default: monthString = "Who cares...?";
			break;
		}
		System.out.println(monthString);
	}

}
