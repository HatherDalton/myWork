package inheritance;

public class Quadrilateral {

	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrilateral() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
		side4 = 0;
	}

	public Quadrilateral(double x, double y, double z, double a) {
		side1 = x;
		side2 = y;
		side3 = z;
		side4 = a;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getSide4() {
		return side4;
	}

	public void setSide1(double x) {
		side1 = x;
	}

	public void setSide2(double y) {
		side2 = y;
	}

	public void setSide3(double z) {
		side3 = z;
	}

	public void setSide4(double a) {
		side4 = a;
	}

	public double Perimeter() {
		return (side1 + side2 + side3 + side4);
	}
}
