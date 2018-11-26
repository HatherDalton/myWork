package loop;

import java.util.Scanner;

public class ActivityTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Activity #1
		int count = 0;
		while (count <= 100) {
			System.out.println(count);
			count++;
		}

		// Activity #2
		int num = 0;
		while (num <= 100000) {
			System.out.println(num);
			num = num + 2;
		}

		// Activity #3
		int mult = 0;
		System.out.println("Number to stop?");
		int stop = input.nextInt();
		while (mult <= stop) {
			System.out.println(mult);
			mult = mult + 2;
		}

		// Activity #4
		int number = 0;
		int sum = 0;
		System.out.println("Upper bound?");
		int stoop = input.nextInt();
		while (number <= stoop) {
			sum += number; 
			number += 2;
		}
		System.out.println("sum=" +sum);

	}
}
