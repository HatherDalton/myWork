package Interface;

import java.util.Scanner;

public class shapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Width?");
		double width = input.nextDouble();
		System.out.println("Length?");
		double length = input.nextDouble();
		shape bob = new Rectangle(length, width);
		System.out.println("Rectangle Area: " + bob.area());
		System.out.println("Rectangle Perimeter: " + bob.perimeter());

		// Can't do because of the interface filter:
		// System.out.println(bob.getLength());

		System.out.println("Radius?");
		double r = input.nextDouble();
		shape fred = new Circle(r);
		System.out.println("Circle Area: " + fred.area());
		System.out.println("Circle Perimeter: " + fred.perimeter());

	}

}
