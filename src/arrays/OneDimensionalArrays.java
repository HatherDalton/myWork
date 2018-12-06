package arrays;

import java.util.Scanner;

public class OneDimensionalArrays { // Practice && Notes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[]scores= new double[5];
		
		for (int i=0; i<5; i++) {
		System.out.println("Test score= ");
		scores[i] = input.nextDouble();
		}
		
		for (int j=0; j<5; j++) {
			System.out.println(scores[j]);
		}
		for (int j=4; j>=0; j--) {
			System.out.println(scores[j]);
		}
	}

}
