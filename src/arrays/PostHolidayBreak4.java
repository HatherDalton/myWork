package arrays;

import java.util.Random;
import java.util.Scanner;

public class PostHolidayBreak4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random generator= new Random();
		double[][] classroom = new double[3][8];
		
		double sum = 0;
		int min= 50;
		int max=100;
		
		for (int row = 0; row < classroom.length; row++) {
			for (int col = 0; col < classroom[0].length; col++) {
				//System.out.println("What is the student's test score?");
				classroom[row][col] = min + generator.nextInt(max-min+1);
				sum += classroom[row][col];
				System.out.print(classroom[row][col]+"  ");
			}
			System.out.println("  ");
		}
		
		int count = 0;
		for (int row = 0; row < classroom.length; row++) {
			for (int col = 0; col < classroom[0].length; col++) {
				if (classroom[row][col] > sum / (classroom.length * classroom[0].length))
					count++;
			}
		}
		System.out.println("Class Average= " + (sum / (classroom.length * classroom[0].length)));
		System.out.println(count + " students earned more than the class average");
		input.close();
	}

}


