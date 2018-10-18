package oop;

public class CatClassTest {

	public static void main(String[] args) {
		CatClass bob = new CatClass();
		System.out.println(bob.getBirthday());
		bob.lessSleep();
		bob.moreSleep();
		System.out.println("                ");
	
		CatClass fred = new CatClass(7,28);
		System.out.println(fred.getBirthday());
	}
}
