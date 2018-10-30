package DecisionStructures;

import java.util.Scanner;

public class BasicElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Insurance
		int totalCost = 200;
		System.out.println("What is your age?");
		int age = input.nextInt();
		if (age > 75) {
			totalCost = totalCost + 125;
		} else {
			totalCost = 200;
		}
		if (age < 30) {
			totalCost = totalCost - 25;
		}
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		if (weight > 700) {
			totalCost = totalCost + 300;
		} else {
			totalCost = totalCost + 0;
		}
		System.out.println("true or false: You smoke cigarettes");
		boolean smoke = input.nextBoolean();
		if (smoke == true) {
			totalCost = totalCost + 50;
		} else {
			totalCost = totalCost - 40;
		}

		System.out.println("Your total cost of you insurance is $" + totalCost);
		
		
		// Dimensions
		System.out.println("How many rectangular shape/shapes do you have? 1 or 2?");
		int shapes=input.nextInt();
		if (shapes == 2) {
			System.out.println("What is the length of the first rectangular shape?");
			double lengthOne=input.nextDouble();
			System.out.println("What is the width of the first rectangular shape");
			double widthOne=input.nextDouble();
			System.out.println("What is the length of the second rectangular shape?");
			double lengthTwo=input.nextDouble();
			System.out.println("What is the width of the second rectangular shape");
			double widthTwo=input.nextDouble();
			double area= ((lengthOne*widthOne) + (lengthTwo*widthTwo));
			double post= area/9;
			System.out.println("There will be" +post+ "postits on the two walls");
		}
		else {
		System.out.println("What is the length of the wall?");
		double length=input.nextDouble();
		System.out.println("What is the width of the rectangular shape");
		double width=input.nextDouble();
		double area= length*width;
		double post= area/9;
		System.out.println("There will be" +post+ "postits on the wall");

		}
		

		// Promotion
		System.out.println("What is your job title? 1)Sales person   2)Delivery   3)Other");
		int job=input.nextInt();
		System.out.println("How many years have you worked for this company?");
		double years= input.nextDouble();
		if (job==1 && years>=3) {
			System.out.println("You are elegeble for the sales promotion");
		}
		else {
			System.out.println("You are not elegeble for the sales promotion");
		}
		if (job==2 && years>=5) {
			System.out.println("You are elegeble for the delivory driver promotion");
		}
		else {
			System.out.println("You aren't elegeble for the delivory driver promotion");
		}
		if (job==3) {
			System.out.println("Better Luck next time");
		}
		
		
		// ResscuePeople
		System.out.println("How many people need to be saved?");
		int people = input.nextInt();
		if(people>=10) {
			int helecopter= people/10;
			System.out.println("You will need " +helecopter+ " helecopter/s");
			int dead= people%10;
			System.out.println("You will be " +dead+ " people felt.");
		}
		else {
			System.out.println("They dead");
		}
	}

}
