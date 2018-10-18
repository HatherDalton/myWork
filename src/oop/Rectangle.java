package oop;

public class Rectangle {
	private double width;
	private double length;
	private double area;
	private double peri;
	public Rectangle() {
		width = 0;
		length = 0;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		area = length * width;
		return area;
	}
	
	public double getPerimeter() {
		peri = ((2 * length) + (2 * width));
		return peri;
	}
	
	public void setLength(int newLen) {
		length = newLen;
	}
	
	public void setWidth(int newWid) {
		width = newWid;
	}
	
}
