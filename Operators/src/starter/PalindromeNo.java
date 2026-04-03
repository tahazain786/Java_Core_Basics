package starter;

import java.util.Scanner;
public class PalindromeNo {
	public static boolean isPalindrome(int num) {
		int r,sum =0;
		int temp = num;
		while(num > 0) {
			r = num % 10;
			System.out.println(r);
			sum = (sum * 10) + r;
			System.out.println("sum" +sum);
			num = num /10;
			System.out.println(num);
		}
		return temp == sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		if (isPalindrome(num)) {
			System.out.println("This number is a palindrome");
		}else {
			System.out.println("This number is not a palindrome");
		}
		sc.close();
	}
	
}
