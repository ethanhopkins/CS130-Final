package Finals;
import java.util.Random;
import java.util.ArrayList;

public class Question37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		ArrayList <Integer> list1 = new ArrayList <Integer>();
		
		for (int i = 0; i < 10; i++) {
		list1.add(generator.nextInt(0, 30));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ") " + list1.get(i));
		}
	}

}
