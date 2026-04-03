package starter;

public class minMaxDiff {
	public static void minMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}else if (arr[i]> max) {
				max = arr[i];
			}
		}
		int diff = max - min;
		System.out.println("The difference between the minimum and maximum digits of the array is: "+ diff);
		System.out.println("max: " +max);
		System.out.println("min:" + min);
	}
	public static void main (String[] args) {
		int[] arr = {11,22,33,44,55,66};
		minMax(arr);
	}
}
