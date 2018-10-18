package oop;

public class CatClass {

	private double age;
	private double sleep;

	public CatClass() {
		age = 6;
		sleep = 4;
	}

	public CatClass(double a, double slept) {
		age = a;
		sleep = slept;
	}
	public double getAge() {
		return age;
	}

	public double getBirthday() {
		double birth = age;
		return birth;
	}

	public void moreSleep() {
		sleep= sleep++;
		
	}

	public void lessSleep() {
		sleep= sleep--;
		
	}
}
