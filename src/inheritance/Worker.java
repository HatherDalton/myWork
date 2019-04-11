package inheritance;

public class Worker extends Employee {

	private int years;
	private String name;
	private double pay;
	
	public Worker() {
	}
	public Worker(int xYears) {
		years=xYears;
		name = super.getName();
		pay= super.getPay();
	}
	public double calcPay() {
		if(years>10) {
			return super.calcPay(5)*0.8;
		}
		return super.calcPay(5);
	}
}
