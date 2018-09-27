package mathOperators;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("What is the radius of the circle?");
		double radius;
		radius = input.nextDouble();

		double pie= 3.14;
		
		double area;
		area= radius * radius * pie;
		
		System.out.println("The volume of a sphere equals " + area);
		input.close(); 
	}

}
