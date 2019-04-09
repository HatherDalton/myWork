package inheritance;

public class Rectangle extends Quadrilateral {

	public Rectangle() {
		super();
	}

	public Rectangle(double l, double w) {
		super(l, w, l, w);
	}

	public double getArea() {
		return (super.getSide1() * super.getSide2());
	}
}
