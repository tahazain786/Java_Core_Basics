package starter;


public class FindIndex {
	public static void findIndex(int[] arr,int n) {
		for(int i=0; i<arr.length; i++) {
			if (n == arr[i]) {
				System.out.println("The index of " + n + " is "+ i);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,44,55,66};
		findIndex(arr,55);
	}
}
