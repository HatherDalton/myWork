package DecisionStructures;

import java.util.Scanner;

public class BasicIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Age Decision
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("What is your age?");
		age = input.nextInt();

		if (age <= 17) {
			System.out.println("You are getting an 'A' in this class!!!");
		}

		System.out.println("I hope you are having a great day!");

		// Grade Percentage
		double percentOne;
		double percentTwo;
		double percentThree;
		boolean extraCredit;
		double average;
		double average2;

		System.out.println("What percent did you get on your first test?");
		percentOne = input.nextDouble();
		System.out.println("What percent did you get on your second test?");
		percentTwo = input.nextDouble();
		System.out.println("What percent did you get on your thrid test?");
		percentThree = input.nextDouble();
		System.out.println("True or False: Did you do the extra credit?");
		extraCredit = input.nextBoolean();

		if (extraCredit == true) {
			double points;
			points = 90;
			System.out.println("You have earned " + points + " additional persents of extra credit.");
			average2 = ((percentOne + percentThree + percentTwo + points) / 4);
			System.out.println("Your average with the extracredit= " + average2);
		}

		average = ((percentOne + percentThree + percentTwo) / 3);
		System.out.println("Your average without the extracredit= " + average);

		// Money
		double xAge;
		double gpa;
		
		System.out.println("What is your age?");
		xAge= input.nextDouble();
		System.out.println("What is your GPA?");
		gpa= input.nextDouble();
		
		if(xAge+gpa>20) {
			System.out.println("You get $250 for your birthday");
		}
		if(xAge+gpa<20) {
			System.out.println("You get $30 for your birthday");
		}

	}
}
