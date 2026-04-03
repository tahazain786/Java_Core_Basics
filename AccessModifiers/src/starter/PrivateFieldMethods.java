package starter;

public class PrivateFieldMethods{
	private String name = "Muskan";
	private int age = 21;
	
	private void pvtMethod() {
		System.out.println("This is a private method "+ name + " and age: " + age);
	}


	public static void main(String[] args) {
		PrivateFieldMethods obj = new PrivateFieldMethods();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.pvtMethod();
	}
}