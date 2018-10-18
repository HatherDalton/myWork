package oop;

public class Worker {
	private int hours;
	private double rate;
	private double total;
	
	public Worker() {
		hours = 7;
		rate= 10.55;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setHours(int newHour) {
		hours = newHour;
	}
	public void setRate(double newRat) {
		rate = newRat;
	}
	
	public double payCheck() {
		total= rate * hours;
		return total;
	}
	
}
