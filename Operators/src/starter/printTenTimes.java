package starter;
import java.util.Scanner;
public class printTenTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times you want to repeat this: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i+".Bright Future ke naam!!");
		}
		sc.close();
	}
	
}
