package Finals;
import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int input = scan.nextInt();
		
		if (input % 2 != 0 && input > 10) {
			System.out.println(input + " is odd and greater than 10");
		} else if (input % 2 != 0 && input < 10) {
			System.out.println(input + " is odd but less than 10");
		} else if (input % 2 == 0 && input > 10) {
			System.out.println(input + " is greater than 10 but equal");
		} else if (input % 2 == 0 && input < 10) {
			System.out.println(input + " is equal and less than 10");
		} else {
			System.out.println("input is 10");
		}
	}

}
