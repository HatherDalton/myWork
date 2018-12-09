package arrays;

import java.util.Random;
import java.util.Scanner;

public class Roll_Die2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int[] rollDie = new int[100];
		int min = 1;
		int max = 6;
		for (int i = 0; i < 100; i++) {
			rollDie[i] = generator.nextInt(max - min + 1);
		}
		
		boolean answer=false;
		do {
		System.out.println("Pick a number 0-100");
		int ch = input.nextInt();
		if (ch < 100 && ch >= 0) {
			System.out.println(ch + " chosen roll number= " + rollDie[ch]);
		}
		System.out.println("true/false: Quit program");
		answer=input.nextBoolean();
		}while(answer!=true);
	}

}
