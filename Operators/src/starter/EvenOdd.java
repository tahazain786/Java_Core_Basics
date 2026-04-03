package starter;
import java.util.*;

public class EvenOdd {
	static String checkEvenOdd(int n) {
		int result = n % 2;
		if (result == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	static void evenSeq(int start,int end) {
		System.out.println("Even numbers:");
		for (int i =start; i < end; i++) {
			if(checkEvenOdd(i).equals("Even")) {
				System.out.println(i);
			}
		}
	}
	static void oddSeq(int start, int end) {
		System.out.println("Odd numbers:");
		for (int i=start; i < end; i++) {
			if(checkEvenOdd(i).equals("Odd")) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to start from");
		int start = sc.nextInt();
		System.out.println("Enter the number you want to end the sequence at");
		int end = sc.nextInt();
		evenSeq(start,end);
		oddSeq(start,end);
		sc.close();
	}
}
