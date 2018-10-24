package oop;

public class Triangle {

	private double base;
	private double height;
	private double area;
	private double peri;
	private double hypot;

	public Triangle() {
		base = 9;
		height = 7;
	}

	public Triangle(double xBase, double xHeight) {
		base = xBase;
		height = xHeight;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double xBase) {
		base = xBase;
	}

	public void setHeight(double xHeight) {
		height = xHeight;
	}

	public double getArea() {
		area = 0.5 * (base * height);
		return area;
	}

	public double getPeri() {
		peri = base + height + hypot;
		return peri;
	}

	public double getHypot() {
		hypot = ((base * base) + (height * height));
		hypot = Math.sqrt(hypot);
		return hypot;
	}

}
