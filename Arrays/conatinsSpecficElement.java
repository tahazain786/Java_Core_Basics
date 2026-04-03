package starter;

import java.util.Arrays;
import java.util.Scanner;

public class conatinsSpecficElement {
	public static boolean containsValue(int[] arr, int n) {
		for(int i : arr) {
			if(i == n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array:");
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to check:");
		int num = sc.nextInt();
		/*int[] arr= {11,22,33,44,55,66};
		int n = 56;*/
		if (containsValue(arr,num)) {
			System.out.println(num + " is present in the array " + Arrays.toString(arr));
		}else {
			System.out.println(num + " is not present in the array " + Arrays.toString(arr));
		}
		sc.close();
	}
}
