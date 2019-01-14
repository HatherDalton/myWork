package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollDiceV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		System.out.println("What are the sides on the die?");
		int die = input.nextInt();
		System.out.println("Number of times each student rolls the dies");
		int rolls = input.nextInt();

		int min=0;
		int max=die;
		
		int[][] rolling = new int[students][rolls];
		int i;
		int j;
		for (i = 0; i < rolling.length; i++) {
			System.out.println("Student #"+(i+1));
			for (j = 0; j < rolling[0].length; j++) {
				System.out.print("Roll#"+(j+1)+"= ");
				System.out.print(min+generator.nextInt(max-min+1)+(", "));
			}
			System.out.println("    ");
		}
	}

}
