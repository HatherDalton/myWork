package oop;

import java.util.Scanner;

public class FillSandboxTest {

	public static void main (String[]args) {
		FillSandbox bob = new FillSandbox();
		 
		//one
		bob.SandboxOne();
		
		
		//two
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
		System.out.println("What is the rate to fill the sandbox");
		double rate;
		rate = input.nextDouble();
		bob.SandboxTwo(length, width, depth, rate);
		
	}
}