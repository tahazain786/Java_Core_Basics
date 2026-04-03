/**
 * 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
 * methods and a main method.
 * 2. Print instance variables in static methods
 * 3. Print static variables in Instance methods
 * 4. Call instance methods in static methods
 * 5. Call static methods in instance methods	
 * 6. Print all the static, instance variables in main method
 * 7. Call static methods and instance methods in main method
 */

package staticAssignment;

public class StaticAssignment {
	//Static variables
	static String name2 = "Iqra";
	static String name = "Muskan";
	//Instance variables
	int age = 22;
	int department = 1;
	
	//2. Print instance variables in static methods
	static void statMethod() {
		StaticAssignment names = new StaticAssignment();
		System.out.println("The first insatnce var is: " + names.age + " the other one is: " + names.department);
	}
	//3. Print static variables in Instance methods
	void insMethod() {
		System.out.println("The first var is: "+ name2 + " the second is: "+ name);
		System.out.println("Hey Guys!!");
	}
	//4. Call instance methods in static methods
	static void instanceCall() {
		StaticAssignment obj = new StaticAssignment();
		obj.insMethod();
	}
	//5. Call static methods in instance methods	
	void statCall() {
		statMethod();
	}
	public static void main(String[] args) {
		StaticAssignment obj = new StaticAssignment();
		//Instance var and static var
		System.out.println("Instance variable 1: " + obj.age + " 2: " + obj.department);
		System.out.println("Static variable 1: " + name + " 2: " + name2);
		//Static method call
		statMethod();
		instanceCall();
		//Instance method call
		obj.insMethod();
		obj.statCall();
	}
}
