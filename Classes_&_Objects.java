///////////////////////////////// CLASS 
///////////////////////////////// New Human class created

package Object_Orientation;

public class Human {
	// this class will allow us to create objects of type human
	// a class is an object blueprint

	// properties defined, values to be assigned on object instances
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	// CONSTRUCTOR
	// constructor = special method defined inside a class which provides a way to construct objects
	// in this case the constructor will enable us to create objects of type Human
	// this method does not need to be defined explicitly like below as it comes default with all classes in which a constructor is not defined.
	public Human() {
	
	}
	
	// INSTRUCTIONS FOR BEHAVIOUR
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am "+ heightInInches + " inches tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("I have " + eyeColor + " eyes");
	}
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working...");
	}
	// classes contain instructions for how objects can be created
	
}

///////////////////////////////// OBJECT INSTANCES
///////////////////////////////// New Human objects on class Earth

package Object_Orientation;

public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare new variable of type Human
		Human tom;
		
		// assign variable value of new Human object
		// new keyword is used when calling the constructor method to create a new object
		tom = new Human();
		
		tom.name = "Tom";
		tom.age = 36;
		tom.heightInInches = 70;
		tom.eyeColor = "blue";
		
		tom.speak();
		
		System.out.println("NEW HUMAN...");
		
		Human sam;
		
		sam = new Human();
		
		sam.name = "Sam";
		sam.age = 26;
		sam.heightInInches = 65;
		sam.eyeColor = "green";
		
		sam.speak();
	}

}
