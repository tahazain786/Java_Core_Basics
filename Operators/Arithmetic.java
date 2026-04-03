package starter;
import java.util.Scanner;
public class Arithmetic {
	
	static boolean isArmstrong(int n) {
		int r = 0;
		int result = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			result += (r * r * r);
			n = n/10;
		}
		return temp == result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (isArmstrong(num)) {
			System.out.println("This is a possible case");
		}else {
			System.out.println("This is not a a possible one");
		}
		sc.close();
	}
}
