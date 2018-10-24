package oop;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle bob = new Rectangle();
		bob.setWidth(4);
		bob.setLength(5);
		System.out.println("Area= " +bob.getArea());
		System.out.println("Perimeter= " +bob.getPerimeter());
		System.out.println("                ");
		
		Rectangle fred = new Rectangle (8,5);
		System.out.println("Area= " +fred.getArea());
		System.out.println("Perimeter= "+fred.getPerimeter());
		System.out.println("                ");
		System.out.println("New Length and Width:");
		fred.setWidth(24);
		fred.setLength(30);
		System.out.println("Area= "+fred.getArea());
		System.out.println("Perimeter= "+fred.getPerimeter());
	}
}
