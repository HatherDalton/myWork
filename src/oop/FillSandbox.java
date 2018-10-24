package oop;
import java.util.Scanner;
public class FillSandbox {

	public FillSandbox() {}
	
	//one
	public void SandboxOne() {
	Scanner input = new Scanner (System.in);
	System.out.println("What is the length of the sandbox:");
	double length;
	length = input.nextDouble();
	System.out.println("What is the width of the sandbox:");
	double width;
	width = input.nextDouble();
	System.out.println("What is the depth of the sandbox:");
	double depth;
	depth = input.nextDouble();
	System.out.println("What is the rate (cubic feet per hour) to fill the sandbox");
	double rate;
	rate = input.nextDouble();
	
	double volume = length * width * depth;
	double total=  volume/ rate;
	
	System.out.println("It will take you " +total+ " hours to fill the sandbox");

	}
	
	//two
	public void SandboxTwo(double length, double width, double depth, double rate) {
		double volume = length * width * depth;
		double total=  volume/ rate;
		System.out.println("It will take you " +total+ " hours to fill the sandbox");

		}
	
	//three
	public double SandboxThree(double lengthTwo, double widthTwo, double depthTwo, double rateTwo) {
		double volume = lengthTwo * widthTwo * depthTwo;
		double total=  volume/ rateTwo;
		return total;

	}
}