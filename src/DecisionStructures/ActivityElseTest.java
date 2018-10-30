package DecisionStructures;

import java.util.Scanner;

public class ActivityElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make a year?");
		double money= input.nextInt();
		if (money< 20000) {
			System.out.println("You are a worker");
		}
		else {
			if(money >= 20000 || money <= 40000) {
				System.out.println("You are a part of management");
			}
			else {
				if (money > 40000 || money <100000) {
					System.out.println("You are a part of the CEO");
				}
				else {
					if (money >= 100000) {
						System.out.println("You are the owner");
					}
					else {
						System.out.println("Have a nice day :)");

					}
				}
			}
		}
		
		//Grade Calculation
		System.out.println("What is your average test grade?");
		double test= input.nextDouble();
		System.out.println("What is your homework average?");
		double homework= input.nextDouble();
		System.out.println("true or false: Your teacher nice?");
		boolean nice = input.nextBoolean();
		if(nice == true) {
			if (test>homework) {
				System.out.println("You have a grade of " + test + "%");
			}
			else{
			System.out.println("You have a grade of " + homework + "%");
			}
		}
		else{
			if (test<homework) {
				System.out.println("You have a grade of " + test + "%");
			}
			else {
				System.out.println("You have a grade of " + homework + "%");
			}
		}


		//Promotion
		System.out.println("What is your age?");
		int age= input.nextInt();
		System.out.println("How many years of experience do you have?");
		double years= input.nextDouble();
		System.out.println("What is your height in inches?");
		double height= input.nextDouble();
		
		if (age>=50||age<50 && height<70|| height>80 && Math.abs(years-10.5)< 0.0000001 ) {
			System.out.println("You get a promotion");
		}
		else {
			System.out.println("You don't get a promotion");
		}
		
	}

}
