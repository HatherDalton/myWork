package sequentialSearching;

import java.util.Random;

public class SS_forEachloop_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int[] numbers = new int[100];
		boolean inThere = false;
		int j = -999;

		for (j = 0; j < numbers.length; j++) {
			numbers[j] = generator.nextInt(500);
		}

		for (j = 0; j < numbers.length 
				&& numbers[j] != 36; j++);
		// 							     ^
		//you have zero loop body for this for statement

		if (j != numbers.length)
			inThere = true;

		System.out.println("IS the number 36 in the array? " + inThere);
	}

}
