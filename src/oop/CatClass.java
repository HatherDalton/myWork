package oop;

public class CatClass {

	private double age;
	private double sleep;

	public CatClass() {
		age = 0;
		sleep = 0;
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
		sleep+=1;
		
	}

	public void lessSleep() {
		sleep-=1;
		
	}
	public double checkSleep()
	{
		return sleep;
	}
}
