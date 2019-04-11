package inheritance;

public class Parallelogram extends Quadrilateral {

	private double Height;

	public Parallelogram() {
		super();
		Height = 4;
	}

	public Parallelogram(double l, double w, double h) {
		super(l, w, l, w);
		Height = h;
	}

	public double getHeight() {
		return Height;
	}

	public double getArea() {
		return super.getSide2() * Height;
	}

	public String toString() {
		return "Parallelogram= height: " + Height + super.toString();

	}
}
