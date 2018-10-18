package oop;

public class CircleClassTest {

	public static void main (String[]args) {
	
	
		CircleClass bob = new CircleClass();
		bob.setRadius(4);
		System.out.println(bob.getRadius());
		System.out.println(bob.getArea());
		System.out.println(bob.getCircum());
		System.out.println("                ");
		
		CircleClass fred = new CircleClass(5);
		
		System.out.println(fred.getRadius());
		System.out.println(fred.getArea());
		System.out.println(fred.getCircum());
		System.out.println("                ");
		fred.setRadius(6);
		System.out.println(fred.getRadius());
		System.out.println(fred.getArea());
		System.out.println(fred.getCircum());
	}
}
