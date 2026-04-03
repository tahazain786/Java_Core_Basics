package starter;


interface OneMethod{
	void firstMethod();
}
public class InterfaceOneMethod implements OneMethod {
	public void firstMethod() {
		System.out.print("Hey this is an abstract class");
	}
	public static void main(String[] args) {
		InterfaceOneMethod obj = new InterfaceOneMethod();
		obj.firstMethod();
	}
}
