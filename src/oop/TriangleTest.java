package oop;

public class TriangleTest {
	public static void main(String[] args) {

		Triangle bob = new Triangle();
		System.out.println("Triangle One;");
		System.out.println("Base= " + bob.getBase());
		System.out.println("Height= " + bob.getHeight());
		System.out.println("hypot= " + bob.getHypot());
		System.out.println("Area= " + bob.getArea());
		System.out.println("Perimeter= " + bob.getPeri());
		System.out.println("                ");

		Triangle fred = new Triangle();
		System.out.println("Triangle Two;");
		System.out.println("Base= " + fred.getBase());
		System.out.println("Height= " + fred.getHeight());
		System.out.println("hypot= " + fred.getHypot());
		System.out.println("Area= " + fred.getArea());
		System.out.println("Perimeter= " + fred.getPeri());
		System.out.println("                ");
		
		fred.setBase(2);
		fred.setHeight(9);
		System.out.println("Triangle Two;");
		System.out.println("Base= " + fred.getBase());
		System.out.println("Height= " + fred.getHeight());
		System.out.println("hypot= " + fred.getHypot());
		System.out.println("Area= " + fred.getArea());
		System.out.println("Perimeter= " + fred.getPeri());
		
	}
}