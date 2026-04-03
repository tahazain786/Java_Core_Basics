package starter;

public class removeDuplicates {
	static int remDuplicate(int[] arr, int n) {
		if(n == 0 || n==1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int k = 0;k < j; k++) {
			arr[k] = temp[k];
		}
		return j;	
	}
	public static void main(String[] args) {
		int[] arr = {11,22,22,33,44,44,55,66,66};
		int n = arr.length;
		n = remDuplicate(arr,n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
