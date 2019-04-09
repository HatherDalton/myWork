package inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle box = new Rectangle(4, 7);
		System.out.println("Area= "+box.getArea());
		System.out.println("Peremiter= "+box.Perimeter());
	
		Trapezoid bob= new Trapezoid(5,6,7,8,10);
		System.out.println("Area= "+bob.getArea());
		System.out.println("Peremiter= "+bob.Perimeter());
	}

}
