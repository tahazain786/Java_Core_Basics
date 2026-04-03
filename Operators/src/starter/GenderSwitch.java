package starter;
import java.util.Scanner;
public class GenderSwitch {
	public static void main(String[] args) {

        System.out.print("Enter a Character (M/F)  : ");
        Scanner sc = new Scanner(System.in);
        //The Java String class "charAt()" method returns a char value at the given index number.
        char Gender = sc.next().charAt(0);
        Character.toUpperCase(Gender);
        //The Java switch statement executes one statement from multiple conditions.
        switch ( Character.toUpperCase(Gender)) {
            //The case values must be unique. In case of duplicate value, it renders compile-time error.
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
            	System.out.println("NA");
        }
        sc.close();
    }
}
