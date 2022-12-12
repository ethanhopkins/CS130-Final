package Finals;
import java.util.Scanner;
import java.text.NumberFormat;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a floating point double value: ");
		double value = scan.nextDouble();
		
		double result = Math.sqrt(value);
		System.out.println("The result of " + value + " when squared is: "
				+ result);
		
		System.out.println("The formatted result is: " + Math.ceil(result));
	}

}
