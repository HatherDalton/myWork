package oop;

import java.util.Scanner;

public class HouseImprovement {
	Scanner input = new Scanner(System.in);
	public HouseImprovement() {}
	
	public void paintWall (double length, double width) {
		double result= length * width;
		result = result / 200;
		result= result/ 24;
		System.out.println("It will take " +result+ "minutes to paint the wall");
	}
	public void plantGarden (double length) {
		double width= 10;
		double total= length / width;
		double sum= ((total/15)*2);
		System.out.println("It will take you "+sum+ " hours to complete the garden");	 
	}
	public void fillPool (double gph) {
		System.out.println("What is the volume of your pool?");
		double volume;
		volume = input.nextDouble();
		double total= volume / 300;
		System.out.println("It will take you " +total+ "hours to fill your pool.");
	}
}
