package starter;

public class ProtectedClassFieldsMethod {
	protected String name;
	protected void proMethod() {
		System.out.println("Hey Ms: " + name);
	}
}
class protectedClass{
	public static void main(String[] args) {
		ProtectedClassFieldsMethod obj = new ProtectedClassFieldsMethod();
		obj.name = "Msuaknnn";
		
		
		obj.proMethod();
	}
}
