package oop;

public class IsosTrapezoidTest {

	public static void main (String[]args) {
		
		IsosTrapezoid bob = new IsosTrapezoid();
		System.out.println("Trapazoid #1:");
		System.out.println("       Base 1= " + bob.getBaseOne());
		System.out.println("       Base 2= " + bob.getBaseTwo());
		System.out.println("       Height= " + bob.getHeight());
		System.out.println("       Leg= " + bob.getLeg());
		System.out.println("       Area= " + bob.getArea());
		System.out.println("       Perimiter= " + bob.getPeri());
		
		IsosTrapezoid fred = new IsosTrapezoid(9,8,7,6);
		System.out.println("Trapazoid #2:");
		System.out.println("       Base 1= " + fred.getBaseOne());
		System.out.println("       Base 2= " + fred.getBaseTwo());
		System.out.println("       Height= " + fred.getHeight());
		System.out.println("       Leg= " + fred.getLeg());
		System.out.println("       Area= " + fred.getArea());
		System.out.println("       Perimiter= " + fred.getPeri());
	}
}
