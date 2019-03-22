package Interface;

public class Trout implements Fish{
	
	private double length;
	private int age;
	private double numScales;

	public Trout(double xL, int xA, double xNum) {
		length = xL;
		age = xA;
		numScales = xNum;
	}

	public int getAge() {
		return age;
	}

	public double getScales() {
		return numScales;
	}

	public double getLength() {
		return length;
	}

	public String toString() {
		return "Goldfish's legth= " + length + " # of Scales= " + numScales + " Age= " + age;
	}
}

