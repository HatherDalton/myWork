package sequentialSearching;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SS_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int min = 0;
		int max = 499;
		boolean inThere = false;
		int[] numbers = new int[100];
		int howMany = 0;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (generator.nextInt(500));
		}

		System.out.println("Pick an number between 0 & 499");
		int num = input.nextInt();

		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == num)
				howMany++;
		}

		System.out.println(num + " is in the arraylist " + howMany + " times");

	}
}
