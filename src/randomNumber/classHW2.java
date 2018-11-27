package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class classHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// FlipCoin
		Random gen3 = new Random();
		double head = 0.0;
		int Xmin=1;
		int Xmax=2;
		int total = 0;
		double hAverage=10;
		double lAverage=100;
		
		for (int k = 0; k <= 10000; k++) {
			for (int i = 0; i <= 1000; i++) {
				int random = Xmin + gen3.nextInt(Xmax - Xmin + 1);
				if (random == 1) {
					head++;
				}
			}
			double average = ((head / 1000.0) * 100);
			if (average > hAverage) {
				hAverage = average;
			} 
			if  (average < lAverage){
				lAverage = average;
			}
			head=0;
			total=0;
		}
		System.out.println("Max Persent of heads= " + hAverage+"%");
		System.out.println("Min Persent of heads= " + lAverage+"%");

	}

}
