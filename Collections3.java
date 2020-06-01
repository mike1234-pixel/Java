// HASH SETS
// hash sets go by hash codes - if the hash codes of two values are the same, only then it prevents duplicates


package Collections3;

import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		
		// The Hash data structure is similar to a list, except it prevents duplicates
		LinkedHashSet<Integer> values = new LinkedHashSet<Integer>();
		
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43); // set does not accept this duplicate value
		
		System.out.println(values);
		// order of insertion not does not reflect the order of the HashSet: [67, 43, 12, 15]
		// if you do want the order to be maintained use the type LinkedHashSet: [12, 43, 15, 67]
		
		for (Integer value : values) {
			System.out.println(value);
		}
		
		LinkedHashSet<Animal> animals = new LinkedHashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 18);
		Animal animal3 = new Animal("Bird", 43);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangroo", 107);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		// prints true because we have overriden equals method in Animal class
		System.out.println(animal1.equals(animal4));
		
		// the second instance of dog age 12 is now excluded from the hash set
		for (Animal animal : animals) {
			System.out.println(animal);
		}
// console logs...
//				Animal [name=Dog, age=12]
//				Animal [name=Cat, age=18]
//				Animal [name=Bird, age=43]
//				Animal [name=Kangroo, age=107]

	}
	
}

////////////////////////ANIMAL CLASS ////////////////////////////////////////////////

package Collections3;

public class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	// overriding the hash code method ensures values with the same properties and values are given the same hash codes
	// meaning they are recognised as being duplicates in the hash set
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	// overriding the equals method enables Java
	// to consider two objects with the same property values as being equal
	// enabling hash sets to give expected results
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}

