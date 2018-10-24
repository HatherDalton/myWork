package oop;

public class ShapeTest {

	public static void main(String[] args) {

		System.out.println("Rectangle:");
		Rectangle bob = new Rectangle();
		bob.setWidth(6);
		bob.setLength(10);
		System.out.println("Length= " + bob.getLength());
		System.out.println("Width= " + bob.getWidth());
		System.out.println("                ");

		System.out.println("Circle:");
		CircleClass fred = new CircleClass();
		System.out.println("Radius= " + fred.getRadius());
		System.out.println("                ");

		System.out.println("Right Triangle:");
		Triangle ava = new Triangle();
		System.out.println("Base= " + ava.getBase());
		System.out.println("Height= " + ava.getHeight());
		System.out.println("hypot= " + ava.getHypot());
		System.out.println("                ");

		System.out.println("Isosceles Trapezoid:");
		IsosTrapezoid zoey = new IsosTrapezoid();
		System.out.println("Base 1= " + zoey.getBaseOne());
		System.out.println("Base 2= " + zoey.getBaseTwo());
		System.out.println("Height= " + zoey.getHeight());
		System.out.println("Leg= " + zoey.getLeg());
		
	}
}
