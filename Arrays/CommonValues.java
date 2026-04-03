package starter;


public class CommonValues {
	public static void commonValues(int[] arr1, int[] arr2) {
		for(int i : arr1) {
			for (int j : arr2) {
				if(i == j) {
					System.out.println("Common value : " + i);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {11,22,33,44,55};
		int[] arr2 = {44,55,66,77,88};
		commonValues(arr1,arr2);
	}
}
