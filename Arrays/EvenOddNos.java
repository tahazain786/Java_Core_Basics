package starter;

public class EvenOddNos {
	public static void evenNo(int[] arr) {
		System.out.println("Even no.s: ");
		for(int i: arr) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void oddNo(int[] arr) {
		System.out.println("Odd no.s: ");
		for(int i: arr) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,44,55,66};
		evenNo(arr);
		oddNo(arr);
	}
}
