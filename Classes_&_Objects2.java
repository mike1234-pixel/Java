///////////////////////////////// CLASS 
///////////////////////////////// New Human class created
// In this values are passed to constructor, which assigns those values to object properties

package Object_Orientation;

public class Human {

	// properties defined, values to be assigned on object instances
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	

	// right click --> Source --> Generate Constructor using Fields...
	// expecting creator of new human objects to pass in values for properties
	// the constructor then assigns those passed in values to the object's properties
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}
	
	// the "this" keyword is a variable in java, and it points to the current object
	// it is referencing the object instance (not the class)
	
	
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
		
		Human John = new Human("John", 40, 72, "brown");
		John.speak();
		Human Andy = new Human("Andy", 26, 75, "blue");
		Andy.speak();
	}

}
