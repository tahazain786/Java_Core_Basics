package starter;
//import java.util.*;
public class duplicateValue {
	public static void duplicatesVal(int[] arr) {
		System.out.println("Duplicate Values:");
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i; j<arr.length; j++) {
				System.out.print(i+" ");
				System.out.println(j);
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,44,55,66};
		duplicatesVal(arr);
	}
}
