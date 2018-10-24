package oop;

public class NumberTest {

	public static void main (String[]args) {
	Numbers bob = new Numbers();
	bob.sayNumber(3);
	bob.sayNumberPlus2(3);
	bob.saySum(3, 6);

	double person = bob.returnSquare(4);
	System.out.println(person);
	
	double result = bob.returnArea(7,3);
	System.out.println(result);
	
	double thing = bob.returnRoundUp(4);
	System.out.println(thing);
	
	}
}
//public static void main (String[]args) {