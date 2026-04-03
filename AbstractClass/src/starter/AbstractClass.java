package starter;
/**
 * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object of the child class for the
 * abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */
abstract class Animal{
	abstract void sound();
	void eat() {
		System.out.println("The animals are eating");
	}
	
}
class Lion extends Animal{
	//Implementation of abstract method
	void sound() {
		System.out.println("Lion roars");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
	//Object of the child class for the abstract class
	Animal a = new Lion();
	//accessing non-abstract method from an abstract class
	a.eat();
	Lion l = new Lion();
	//instance for the child class in child class and call abstract methods
	l.sound();
	//instance for the child class in child class and call non-abstract methods
	l.eat();
}
}