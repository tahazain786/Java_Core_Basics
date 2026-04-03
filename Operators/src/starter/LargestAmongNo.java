package starter;
import java.util.Scanner;

public class LargestAmongNo {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your 1st number: ");
	int a = sc.nextInt();
	System.out.println("Enter your 2rd number: ");
	int b = sc.nextInt();
	System.out.println("Enter your 3rd number: ");
	int c = sc.nextInt();
	if (a > b && a > c) {
		System.out.println(a + " is greater");
	}else if(b > a && b > c) {
		System.out.println(b + " is greater");
	}else {
		System.out.println(c + " is greater");
	}
	sc.close();
	}
	
}
