// TRAVERSING LISTS

package Collections2;

import java.util.ArrayList;

public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
	
		System.out.println(animals);
		
		// TRAVERSING LISTS
		
		// for
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		// for each
		for(String value : animals) {
			System.out.println(value);
		}
		
		System.out.println("______________________________________");
		
		// TRAVERSING ARRAY OF OBJECTS
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
		vehicles.add(new Vehicle("Honda", "accord", 12000, false)); // initialising object inline to be added to array list, can also init first then add to list
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		/// for each
		for(Vehicle car : vehicles) {
			
			// TRAVERSE OBJECT PROPERTIES USING GETTERS
			System.out.println("_________");
			System.out.println("NEW CAR:");
			System.out.println(car.getMake());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
			System.out.println(car.isFourWDrive());
			
			// TRAVERSE OBJECT PROPERTIES USING TOSTRING()
			// toString() returns the string representation of an object
			System.out.println(car);
		}
		
	}
	
	
}

/////////////////////// VEHICLE CLASS //////////////////////////////////////////
package Collections2;

public class Vehicle {
	String make;
	String model;
	int price;
	boolean fourWDrive;
	
	// GENERATE TO STRING METHOD SO OBJECTS RETURNED WHEN LIST TRAVERSED ARE HUMAN READABLE OBJECTS, NOT HASHCODES (WHICH IS THE DEFAULT)
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWDrive=" + fourWDrive + "]";
	}
	public Vehicle(String make, String model, int price, boolean fourWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWDrive = fourWDrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWDrive() {
		return fourWDrive;
	}
	public void setFourWDrive(boolean fourWDrive) {
		this.fourWDrive = fourWDrive;
	}
}
