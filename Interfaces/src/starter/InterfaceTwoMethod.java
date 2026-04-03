package starter;


interface TwoMethod{
	void firstMethod();
	void secondMethod();
}
public class InterfaceTwoMethod implements TwoMethod {
	public void firstMethod() {
		System.out.println("Hey this is an abstract class 1");
	}
	public void secondMethod() {
		System.out.println("Hey this is an abstract class 2");
	}
	public static void main(String[] args) {
		InterfaceTwoMethod obj = new InterfaceTwoMethod();
		obj.firstMethod();
		obj.secondMethod();
	}
}
/*
NOTE :
- A class that implements an interface must implement all the methods declared in the interface.
*/
