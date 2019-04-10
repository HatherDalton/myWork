package inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle box = new Rectangle(4, 7);
		System.out.print("Rectangle:");
		System.out.println("Area= " + box.getArea());
		System.out.println("Peremiter= " + box.Perimeter());

		System.out.print("                                ");

		Trapezoid bob = new Trapezoid(5, 6, 7, 8, 10);
		System.out.print("Trapezoid:");
		System.out.println("Area= " + bob.getArea());
		System.out.println("Peremiter= " + bob.Perimeter());
		
		System.out.print("                                ");

		Square jeff = new Square (3.9);
		System.out.print("Square:");
		System.out.println("Area= " + jeff.getArea());
		System.out.println("Peremiter= " + jeff.Perimeter());
	}

}
