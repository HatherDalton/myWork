package oop;

public class CircleClassTest {

	public static void main(String[] args) {

		CircleClass bob = new CircleClass();
		bob.setRadius(4);
		System.out.println("Circle One;");
		System.out.println("Radius= "+bob.getRadius());
		System.out.println("Area= "+bob.getArea());
		System.out.println("Circumfance= "+bob.getCircum());
		System.out.println("                ");

		CircleClass fred = new CircleClass(5);

		System.out.println("Circle Two;");
		System.out.println("Radius= "+fred.getRadius());
		System.out.println("Area= "+fred.getArea());
		System.out.println("Circumfance= "+fred.getCircum());
		System.out.println("                ");
		fred.setRadius(6);
		System.out.println("Circle Three;");
		System.out.println("Radius= "+fred.getRadius());
		System.out.println("Area= "+fred.getArea());
		System.out.println("Circumfance= " +fred.getCircum());
	}
}
