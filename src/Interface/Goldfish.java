package Interface;

public class Goldfish implements Fish {

	private double length;
	private int age;
	private String color;

	public Goldfish(double xL, int xA, String xC) {
		length = xL;
		age = xA;
		color = xC;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public double getLength() {
		return length;
	}

	public String toString() {
		return "Goldfish's legth= " + length + " Color= " + color + " Age= " + age;
	}
}
