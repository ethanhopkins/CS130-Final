package Finals;

public class Rectangle {
private int height;
private int width;

//methods
public int areaRec(int height, int width) {
	return height * width;
}

public int periRec(int height, int width) {
	return 2 * (height + width);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle object = new Rectangle();
		
		System.out.println("Area: ");
		System.out.println(object.areaRec(10, 20));
		
		System.out.println("\nPerimeter: ");
		System.out.println(object.periRec(10, 20));
	}

}
