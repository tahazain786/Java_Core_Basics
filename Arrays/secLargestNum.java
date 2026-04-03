package starter;

public class secLargestNum {
	static void secondLarge(int[] arr) {
		int temp;
		for (int i = 0; i< arr.length; i++) {
			for(int j= i+1; j < arr.length; j++) {
				if( arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length -2]);
		
	}
	public static void main(String[] args) {
		int[] arr = {11,243,546,23,645,134,64};
		secondLarge(arr);
		String ss = "Splitting String";
        //split() method breaks a given string around matches
        String[] spl = ss.split(" "); //splits space

        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }
	}
}
