package inheritance;

public class Employee {

	private String name;
	private double pay;

	public Employee() {
		name = "";
		pay = 7.50;
	}

	public Employee(String xName, double xPay) {
		name = xName;
		pay = xPay;
	}

	public double calcPay(double hours) {
		return hours * pay;
	}

	public String getName() {
		return name;
	}

	public double getPay() {
		return pay;
	}

	public boolean equals(Object otherObject) {
		return (this.toString().equals(otherObject.toString()));
	}
}
