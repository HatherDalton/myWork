package oop;

import java.util.Scanner;

public class HouseImproveTest {

	public static void main (String[]args) {
		HouseImprovement bob = new HouseImprovement();
		Scanner input = new Scanner(System.in);

		bob.paintWall(200, 200);
		
		System.out.println("How many rows are there in your garden?");
		double rows;
		rows = input.nextDouble();
		bob.plantGarden(10);
		
		System.out.println("What is the radius of the pool?");
		double radius = input.nextDouble();
		System.out.println("What is the height of the pool?");
		double height = input.nextDouble();
		//bob.fillPool;

	}
	
	
}
