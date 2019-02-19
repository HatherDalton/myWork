package sequentialSearching;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SS_satScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		//int min = 400;
		//int max = 1600;
		boolean inThere = false;
		ArrayList<Integer>scores = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) {
			scores.add(generator.nextInt(1202)+400);
		}

		System.out.println("Pick an SAT score to display");
		int num = input.nextInt();

		for (int j = 0; j < scores.size(); j++) {
			if (scores.get(j) == num)
				inThere = true;
		}

		if (inThere = true) {
			System.out.println(num + " is in the arraylist");
		}
		else {
			System.out.println(num + " ISN'T in the arraylist");
		}
			
	}

}

//This program always gives me true as an answer