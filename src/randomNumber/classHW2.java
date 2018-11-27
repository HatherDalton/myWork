package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class classHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// FlipCoin
		Random gen3 = new Random(8);
		int head = 0;
		int tail = 0;
		int Xmin=1;
		int Xmax=2;
		int total = 1;
		int average = 0;
		int hAverage=2;
		int lAverage=1;
		
		for (int k = 1; k <= 1000; k++) {
			for (int i = 1; i <= 100; i++) {
				
				int ranum = Xmin + gen3.nextInt(Xmax - Xmin + 1);
				if (ranum == 1) {
					head++;
					total++;
					average = ((head / total) * 100);
				}
				else {
					tail++;
					total++;
				}
			}
			if (hAverage >= average) {
				hAverage = average;
			} 
			if  (lAverage >= average){
				lAverage = average;
			}
		}
		System.out.println("Max Persent of heads= " + hAverage);
		System.out.println("Min Persent of heads= " + lAverage);

// Yahtzee
		Random gen4 = new Random(8);
// Yahtzee2
		Random gen5 = new Random(8);
// Lottery
		Random gen6 = new Random(8);
	}

}
