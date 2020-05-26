///////////////////////// ENTRY POINT

// Zoo is the entry point of the application

package object_Orientation2;

public class Zoo {

	public static void main(String[] args) {
		
		Chicken chick1 = new Chicken(1, "W", 7);
		chick1.fly();
		
		Sparrow sparrow1 = new Sparrow(4, "M", 7);
		sparrow1.fly();
	}

}

///////////////////////// PARENT CLASS

package object_Orientation2;

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

///////////////////////// CHILD CLASS

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

///////////////////////// CHILD CLASSES

///// chicken uses method overriding

package object_Orientation2;

public class Chicken extends Bird {

	public Chicken(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}
	// method overriding
	// here we're overriding/replacing a method defined in the Bird parent class
	public void fly() {
		System.out.println("not able to fly...");
	}

}

///// sparrow uses an interface

package object_Orientation2;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}
	
	// An interface is a contract
	// For any class that implements an interface, the interface wants the class to promise that it will implement that method, like below:
	// A class can only extend one other class (have one parent), but it can have as many interfaces as it wants
	
	@Override
	public void fly() {
		System.out.println("Sparrow flying high...");
	}
}

///////////////////////// INTERFACE

package object_Orientation2;

// interfaces should be named after the functionality that we are abstracting away
public interface Flyable {
	
	// An interface only has "Abstract Methods"
	// Abstract Methods do not have bodies
	public void fly();
}

