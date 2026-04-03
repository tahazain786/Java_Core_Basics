package starter;

//Interface 1
interface FirstOne{
	void firstMethod();
}
//Interface 2
interface SecondOne{
	void secondMethod();
}
public class TwoInterfaceOneMethod implements FirstOne, SecondOne {
	public void firstMethod() {
		System.out.println("Hey this is an abstract class 1");
	}
	public void secondMethod() {
		System.out.println("Hey this is an abstract class 2");
	}
	public static void main(String[] args) {
		TwoInterfaceOneMethod obj = new TwoInterfaceOneMethod();
	
		obj.firstMethod(); 
		obj.secondMethod();
}
}
