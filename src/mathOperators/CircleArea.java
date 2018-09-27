package mathOperators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("What is the radius of the circle?");
		double radius;
		radius = input.nextDouble();

		double pie= 3.14;
		
		double area;
		area= radius * radius * pie;
		
		System.out.println("The area of the circle equals " + area);
		input.close(); 
	}

}
