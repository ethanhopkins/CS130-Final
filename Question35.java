package Finals;
import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of the day you'd like to work\n"
				+ "For example, if you want to work Friday, enter 5");
		
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		default:
			System.out.println("Holiday");
			break;
		}
	}

}
