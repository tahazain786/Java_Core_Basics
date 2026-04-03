package starter;
import java.util.Arrays;

public class removeElement {
	static int[] remElement(int[] arr, int index) {
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		int[] newArr = new int[arr.length-1];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			newArr[j++] = arr[i];
		}
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,55,6,7};
		int index = 3;
		int[] newArr = remElement(arr, index);
		System.out.println("The updated array is: " + Arrays.toString(newArr));
	}
}
