package arrays;

import java.util.Scanner;

public class Test_Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]testScores= new double[10];
		Scanner input = new Scanner(System.in);
		double largest= testScores[0];
		double smallest= testScores[0];
		double average=0;
		for(int i=0; i<testScores.length; i++) {
			System.out.println("Test score= ");
			testScores[i] = input.nextDouble();
			average= (average+testScores[i]);
			if (largest< testScores[i]) {
				largest=testScores[i];
			}
			//I don't know why but my smallest isn't working
			if (smallest> testScores[i]) {
				smallest=testScores[i];
			}
		}
		System.out.println("Largest Test Score= "+largest);
		System.out.println("Smallest Test Score= "+smallest);
		System.out.println("Average Score= "+(average/10));
		for(int i=0; i<testScores.length; i++) {
		System.out.println("Test Score #"+i+"="+testScores[i]);
		}
	}

}
