package mathOperators;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("What is the radius of the circle? Round to the nearest hundreth.");
		double radius;
		radius = input.nextDouble();

		double pie= 3.14;
	
		double fraction= 4.0/3.0;
		
		double area;
		area= fraction * (pie * radius * radius * radius) ;
		
		System.out.println("The volume of a sphere equals " + area);
		input.close(); 
	}

}
