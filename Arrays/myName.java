
public class myName {
	String name;
	public myName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		myName obj = new myName("Muskaan");
		System.out.println("My name is: " + obj);
	}
}
