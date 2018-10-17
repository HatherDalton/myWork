package oop;

public class CircleClass {

	private double radius;
	private double area;
	public CircleClass() {
		radius = 7;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		area = (Math.PI * (radius * radius));
		return area;
	}
	
	public void setRadius(int newRad) {
		radius = newRad;
	}
	
}
