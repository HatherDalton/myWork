package arrays;

import java.util.Random;

public class TwoDimensional_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();

		int max = 100;
		int min = 0;
		int row;
		int column;
		int sum=0;

		int[][] ranum = new int[14][9];
		for (row = 0; row < ranum.length; row++) {
			for (column = 0; column < ranum[0].length; column++) {
				ranum[row][column] = min + generator.nextInt(max - min + 1);
			}
		}
		for (row = 0; row < ranum.length; row++) {
			for (column = 0; column < ranum[0].length; column++) {
				System.out.print(ranum[row][column] + " ");
			}
			System.out.println();
		}
		for (row = 0; row < ranum.length; row++) {
			for (column = 0; column < ranum[0].length; column++) {
				sum+= ranum[row][column];
			}
		}
		System.out.println("Sum= " + sum);
	}

}
