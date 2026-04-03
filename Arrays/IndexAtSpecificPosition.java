package starter;

import java.util.Arrays;

public class IndexAtSpecificPosition {
	public static void indexPos(int[] arr, int index, int val) {
		int[] newArr = new int[arr.length + 1];
		int j =0;
		for (int i = 0;  i<= arr.length; i++) {
		
			if (i == index) {
				newArr[i] = val;
			}else {
				newArr[i] = arr[j];
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		int val = 91;
		int index= 2;
		indexPos(arr,index,val);
	}
}
