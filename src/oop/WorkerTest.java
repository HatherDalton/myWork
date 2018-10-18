package oop;

public class WorkerTest {
	public static void main (String[]args) {
		Worker bob = new Worker();
		bob.setHours(8);
		bob.setRate(10.55);
		System.out.println(bob.getRate());
		System.out.println(bob.getHours());
		System.out.println(bob.payCheck());
	}
}
