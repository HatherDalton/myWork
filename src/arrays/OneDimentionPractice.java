package arrays;

import java.util.Scanner;

public class OneDimentionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[]testScores= new double[10];
		Scanner input = new Scanner(System.in);
		double largest= testScores[0];
		for(int i=0; i<testScores.length; i++) {
			System.out.println("Test score= ");
			testScores[i] = input.nextDouble();
			if (largest< testScores[i]) {
				largest=testScores[i];
			}
		}
	}

}
