package oop;

public class CatClassTest {

	public static void main(String[] args) {
		CatClass bob = new CatClass(7,28);
		System.out.println(bob.getBirthday());
		CatClass fred = new CatClass(7,28);
		bob.lessSleep();
		bob.moreSleep();
		bob.moreSleep();
		System.out.println("                ");
	
		
		System.out.println(fred.getBirthday());
		System.out.println(bob.checkSleep());
	}
}
