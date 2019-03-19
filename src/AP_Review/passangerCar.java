package AP_Review;

public class passangerCar {

	private double maxP;
	private double baseWt;

	public passangerCar() {
		maxP = 0;
		double baseWt = 0;
	}

	public passangerCar(double xMaxP, double xBaseWt) {
		maxP = xMaxP;
		baseWt = xBaseWt;
	}

	public void getTotalweight() {
		double totalWeight = 0;
		totalWeight = baseWt + (maxP * 300);
	}
}
