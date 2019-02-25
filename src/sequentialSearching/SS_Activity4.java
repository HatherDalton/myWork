package sequentialSearching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SS_Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		double min = 0.0;
		double max = 499.0;
		boolean inThere = false;
		int howMany=0;
		ArrayList<Double>scores = new ArrayList<Double>();

		for (int i = 0; i < 1000; i++) {
			scores.add(generator.nextDouble()*500);
		}

		System.out.println("Pick a number to display");
		int num = input.nextInt();

		for (int j = 0; j < scores.size(); j++) {
			if (scores.get(j) == num)
				inThere = true;
				howMany++;
		}

		if (inThere = true) {
			System.out.println(num + " is in the arraylist");
		}
		else {
			System.out.println(num + " ISN'T in the arraylist");
		}


	}

}
