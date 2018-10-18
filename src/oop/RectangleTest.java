package oop;

public class RectangleTest {
	
	public static void main (String[]args) {
	Rectangle bob = new Rectangle();
	
	bob.setWidth(4);
	bob.setLength(5);

	System.out.println(bob.getArea());
	System.out.println(bob.getPerimeter());
	}
}
