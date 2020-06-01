package Collections4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(12);
		hashSet1.add(43);
		hashSet1.add(15);
		hashSet1.add(67);
		hashSet1.add(43);
		hashSet1.add(10);
		
		// to turn a Hash Set into an Array List...
		ArrayList<Integer> list1 = new ArrayList<Integer>(hashSet1);		
		System.out.println("pre-sort: " + list1); // [67, 10, 43, 12, 15]
		
		// Collections.sort() 
		Collections.sort(list1);
		System.out.println("sorted list: " + list1); // [10, 12, 15, 43, 67]
		
		list1.add(10);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		
		System.out.println(newList);
		
		// .addAll() merges list1 and newList
		list1.addAll(newList);
		
		System.out.println(list1);
		// list1 = [12, 43, 15, 67, 43, 10, 10]
		
		// .removeAll() removes the contents of newList from list1
		// all values of 10 are removed from the list, including values added to list1 before newList was even declared
		list1.removeAll(newList);
		System.out.println(list1);
		// list1 = [12, 43, 15, 67, 43]
		
		// .clear() eliminates all the data in the list.
//		list1.clear();
//		System.out.println(list1);
		// list1 = []	
		
		// .contains() checks whether an item exists in a given list
		System.out.println(list1.contains(10)); // false
		
		// .isEmpty() returns whether a list is empty or not
		System.out.println(list1.isEmpty()); // false
		
		ArrayList<Integer> newerList = new ArrayList<Integer>();
		newerList.add(12);
		newerList.add(43);
		newerList.add(15);
		
		// .retainAll() is used to remove everything except for the values you would like to retain
		list1.retainAll(newerList);
		System.out.println(list1); // list1 = [12, 15, 43] //67 was removed from list1 as it was not a value in the retained list
		
		
		////////////////////////////////////////////
		System.out.println("______________NEW_LIST______________");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee John = new Employee("John", 12000, "Marketing");
		Employee Dana = new Employee("Dana", 7000, "Sales");
		Employee Diana = new Employee("Diana", 1000, "Housekeeping");
		
		employeeList.add(John);
		employeeList.add(Dana);
		employeeList.add(Diana);
		
		// sorts employees by salary as defined in the Employee class
		Collections.sort(employeeList);
		
		System.out.println(employeeList);
		}
	
}

//////////////////////////// EMPLOYEE CLASS /////////////////////////////////////////////////////////////

package Collections4;
//in a user defined class we must specify how we want our data type to be sorted
//need to specify what makes one employee greater or smaller as far as sorting a list goes
//in order to do this we need to implement Comparable interface like so...

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	String department;
	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// provide instructions as to what makes one employee larger than the other
		// could sort them by salary, department etc... whatever makes sense
		
		if(this.salary < o.salary) {
			return -1;
		} else if (this.salary > o.salary) {
			return 1;
		}
		return 0; // both employee instances have the same salary
	}
	
	
}
