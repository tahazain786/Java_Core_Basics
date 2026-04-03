package starter;
import java.util.Arrays;

public class missingNumber {
	static void missingNum(int[] arr) {
		System.out.println("Arr: { " + Arrays.toString(arr) + "}");
        Arrays.sort(arr);
        int j = 0;
        for(int i = 1; i< 100; i++) {
        	if ( j < arr.length && i == arr[j]) {
        		j++;
        	}else {
        		System.out.print(i + " ");
        	}
        }
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //passing array to method
        missingNum(my_arr);
    }
}
