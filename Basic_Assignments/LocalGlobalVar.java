
public class LocalGlobalVar {
	/*5. Define the local and Global variables with the same name and print both variables and
 		 understand the scope of the variables*/
	int a = 10;
	public void localVar() {
		String a = "Muskaan Fatima";
		System.out.println(a);
	}
	public static void main(String[] args) {
		LocalGlobalVar obj = new LocalGlobalVar();
		System.out.println("Global variable is this: " + obj.a);
		obj.localVar();
	}
	
}
