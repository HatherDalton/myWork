package oop;

public class IsosTrapezoid {

	private double baseOne;
	private double baseTwo;
	private double height;
	private double leg;
	private double area;
	private double peri;

	public IsosTrapezoid() {
		baseOne = 2;
		baseTwo = 3;
		height = 4;
		leg = 5;
	}

	public IsosTrapezoid(double baseFirst, double baseSecond, double xHeight, double xLeg) {
		baseOne = baseFirst;
		baseTwo = baseSecond;
		height = xHeight;
		leg = xLeg;
	}
	public double getBaseOne() {
		return baseOne;
	}
	public double getBaseTwo() {
		return baseTwo;
	}
	public double getHeight() {
		return height;
	}
	public double getLeg() {
		return leg;
	}
	
	public double getArea() {
		area= (height*((baseOne + baseTwo)/2)) ;
		return area;
	}
	
	public double getPeri() {
		peri= baseOne + baseTwo + (leg*2);
		return peri;
	}
}
