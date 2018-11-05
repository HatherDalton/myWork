package DecisionStructures;

import java.util.Scanner;

public class BasicNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Temperature
		System.out.println("What is the temperature outside? (In fahrenheit)");
		double temp = input.nextDouble();
		if (temp > 83) {
			System.out.println("Time to Swim!!!!");
		} else {
			if (temp >= 83 && temp > 74) {
				System.out.println("Lets Play Tennis");
			} else {
				if (temp <= 74 && temp > 35) {
					System.out.println("Play Mini Golf");
				} else {
					if (temp <= 35 && temp > -10) {
						System.out.println("Christmas Snow Shoeing!!!!");
					} else {
						if (temp <= -10) {
							System.out.println("STAY INSIDE!!!!");
						} else {
							System.out.println("I don't know where you live that has no temperature.");
						}
					}
				}
			}
		}

		// TestScores
		System.out.println("What percent did you get on your first test?");
		double test1 = input.nextDouble();
		System.out.println("What percent did you get on your second test?");
		double test2 = input.nextDouble();
		System.out.println("What percent did you get on your third test?");
		double test3 = input.nextDouble();
		double average = ((test1 + test2 + test3) / 3);
		System.out.println("Your average= " + average);
		final double CLOSE = 0.000001;
		if (average >= 92.5 && average <= 100.0) {
			System.out.println("You get and 'A'");
		}
		else {
			if (average >= 84.5 && average < 92.5)
			{
				System.out.println("You get and 'B'");
			}
			
				if (average >= 77.5 && average < 84.5) {
					System.out.println("You get and 'C'");
				} else {
					if (average >= 69.5 && average < 77.5) {
						System.out.println("You get and 'D'");
					} else {
						if (average > 0.0 && average < 69.5) {
							System.out.println("You get and 'F'");
						} else {
							System.out.println("You get no Grade");
						}
					}
				}
			}
		}
	}


