package randomNumber;

import java.util.Random;
import java.util.Scanner;

public class classHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//RollDie
		Random gen = new Random(5);
		System.out.println("How many sides are on the die?");
		int die = input.nextInt();
		System.out.println("How many times do you want to role?");
		int role = input.nextInt();
		int j = 1;
		int min = 1;
		int max = die;
		for (int i = 1; i <= role; i++) {
			int randomNum = min + gen.nextInt(max - min + 1);
			System.out.println("Results" + j + "= " + randomNum);
			j++;
		}
//RollDieVersion2
		Random gen2 = new Random();
		System.out.println("How many times do you want to role?");
		int role1 = input.nextInt();
		int minx = 1;
		int maxx = 6;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		double six = 0;
		double total = 0;
		for (int i = 1; i <= role1; i++) {
			int randomNum = min + gen2.nextInt(max - min + 1);
			if (randomNum == 1) {
				one++;
				total++;
			}
			if (randomNum == 2) {
				two++;
				total++;
			}
			if (randomNum == 3) {
				three++;
				total++;
			}
			if (randomNum == 4) {
				four++;
				total++;
			}
			if (randomNum == 5) {
				five++;
				total++;
			}
			if (randomNum == 6) {
				six++;
				total++;
			}
		}
		System.out.println("Average of 1=" + ((one / total) * 100));
		System.out.println("Average of 2=" + ((two / total) * 100));
		System.out.println("Average of 3=" + ((three / total) * 100));
		System.out.println("Average of 4=" + ((four / total) * 100));
		System.out.println("Average of 5=" + ((five / total) * 100));
		System.out.println("Average of 6=" + ((six / total) * 100));

	}

}
