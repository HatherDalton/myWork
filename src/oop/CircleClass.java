package oop;

public class CircleClass {

	private double radius;
	private double area;
	private double circum;
	public CircleClass() {
		radius = 7;
	}
	public CircleClass(double xRadius) {
		radius= xRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	
	
	public double getArea() {
		area = (Math.PI * (radius * radius));
		return area;
	}
	
	public double getCircum() {
		circum = (2* (Math.PI * radius));
		return circum;
	}
	
	public void setRadius(int newRad) {
		radius = newRad;
	}
	
}
