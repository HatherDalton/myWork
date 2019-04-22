package inheritance;

public class Manager extends Employee {

	private int level;

	public Manager() {

	}

	public Manager(int xLevel, double xPay, String xName) {
		super( xName,xPay);
		level = xLevel;

	}

	public double calcPay(double xHours) {
		return super.calcPay(xHours) * (level / 100);
	}
	
	public Object clone() {
		return new Manager(level, super.getPay(),super.getName());
	}
}
