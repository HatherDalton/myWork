package inheritance;

public class Worker extends Employee {

	private int years;
	private String name;
	private double pay;
	
	public Worker() {
	}
	public Worker(int xYears, double xPay, String xName) {
		super(xName,xPay);
		years=xYears;
		
	}
	public double calcPay(double xHOurs) {
		if(years>10) {
			return super.calcPay(xHOurs)*0.8;
		}
		return super.calcPay(xHOurs);
	}
	public String toString() {
		return "Worker= Name:" + name+ " Pay: " +pay+ " Years: " +years;
	}
}
