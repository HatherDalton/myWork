package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{

	private double Height;

	public Trapezoid() {
		super();
		Height = 4;
	}

	public Trapezoid(double top, double right, double bottom, double left, double h) {
		super(top, right, bottom, left);
		Height = h;
	}

	public double getHeight() {
		return Height;
	}

	public double getArea() {
		return ((super.getSide2() + super.getSide4()) / 2) * Height;
	}

}
