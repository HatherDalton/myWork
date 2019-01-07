package arrays;

import java.util.Random;

public class PostBreakActivity4_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen= new Random();

		int[][] heights = new int[10][12];
		int min = 0;
		int max = 72;
		double totalsum = 0;
		int shortest = 80;
		int tallest = 0;
		int kid=0;
		
		for (int rows = 0; rows < 10; rows++) {
			for (int columns = 0; columns < 12; columns++) {
				int randomNum = min + gen.nextInt(max - min + 1);
				if (randomNum > tallest) {
					tallest = randomNum;
				}
				if (randomNum < shortest && randomNum >12) {
					shortest = randomNum;
				}
				heights[rows][columns] = randomNum;

				if(heights[rows][columns]>12)
				totalsum = totalsum + randomNum;
				kid++;
				
				
				System.out.print(heights[rows][columns]+"  ");
			}
			System.out.println("  ");
		}
		
		System.out.println("  ");
		
		
		double average = totalsum / kid;
		System.out.println("The average height of the trapped children in inches was " + average + " inches");
		System.out.println("The tallest child was " + tallest + " and the shortest child was " + shortest);

	

//
	}

}
