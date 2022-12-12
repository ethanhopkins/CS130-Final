package Finals;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		double age = scan.nextInt();
		
		if (age >= 18) {
			System.out.println("You are not a minor");
		} else {
			System.out.println("You are a minor");
		}
	}

}
