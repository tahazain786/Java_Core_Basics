package starter;
import java.util.Arrays;
public class reverseArr {
	static int[] reversedArr(int[] arr) {
		int[] rev_arr = new int[arr.length];
		int j = arr.length;
		for(int i: arr) {
			rev_arr[j - 1] = i;
			j = j-1;
		}
		
		return rev_arr;
	}
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};
		int[] newArr = reversedArr(arr);
		System.out.println("The reversed array is: " + Arrays.toString(newArr));

	}
}
