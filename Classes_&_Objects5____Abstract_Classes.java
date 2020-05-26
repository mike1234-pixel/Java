///////////////////////// ENTRY POINT

// ABSTRACT CLASSES
// an abstract class is almost like a regular class except it has abstract methods in it
// An abstract class can only be extended, meaning you cannot instantiate an instance of an abstract class
// (it's only meant to be a parent of another class)
// Abstract classes are used for inheritance and expect child classes to implement its abstract methods

package object_Orientation2;

public class Zoo {

	public static void main(String[] args) {
		
		Chicken chick1 = new Chicken(1, "W", 7);
		
		Sparrow sparrow1 = new Sparrow(4, "M", 7);

		Animal fish1 = new Fish(1, "m", 2);
		moveAnimals(fish1); // Fish is swimming
		
		moveAnimals(sparrow1); // Bird is flapping
		
		moveAnimals(chick1); // Bird is flapping
	}
	
	// the point of an abstract class is to make things more dynamic and generalised, e.g. could do:
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
	// this is an example of "polymorphism" which allows you to make your program more dynamic
}

///////////////////////// PARENT CLASS

package object_Orientation2;

// Inheritance
// one class inheriting behaviour from another class
// The class that inherits should be a breed of the parent class, e.g. Animal --> Bird --> Bird instance

public abstract class Animal {
	
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
	
	public abstract void move();
	
}

///////////////////////// CHILDREN OF ANIMAL

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

	public void move() {
		System.out.println("Bird is flapping");
		
	}

}

package object_Orientation2;

public class Fish extends Animal {
	
	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		System.out.println("Fish is swimming");	
	}

}


///////////////////////// CHILDREN OF BIRD

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

///////////////////////// INTERFACE

package object_Orientation2;

// interfaces should be named after the functionality that we are abstracting away
public interface Flyable {
	
	// An interface only has "Abstract Methods"
	// Abstract Methods do not have bodies
	public void fly();
}

