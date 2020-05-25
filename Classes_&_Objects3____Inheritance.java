///////////////////////////// ENTRY POINT

// Zoo is the entry point of the application

package object_Orientation2;

public class Zoo {

	public static void main(String[] args) {
		
		Bird bird1 = new Bird(3, "F", 10);
		bird1.eat(); 
		
		Bird bird2 = new Bird(6, "M", 9);
		bird2.sleep();
	}

}

///////////////////////////// PARENT CLASS

package object_Orientation2;

// Inheritance
// one class inheriting behaviour from another class
// The class that inherits should be a breed of the parent class, e.g. Animal --> Bird --> Bird instance

public class Animal {
	
	int age;
	String gender;
	int weightInLbs;

	public Animal(int age, String gender, int weightInLbs) {
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void eat(){
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	
}

///////////////////////////// CHILD CLASS

package object_Orientation2;

// using extends like this makes the Bird class a child of the Animal class, and enables it to inherit properties / behaviours from the parent class
// Other words for parent class include "Super class" or "Base class"
// Child classes all called "sub-classes"

public class Bird extends Animal {

	// hover over Bird class and click add constructor to create constructor automatically
	
	
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
			System.out.println("Flying...");
	}


}
