package loop;

import java.util.Scanner;

public class ActivityTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

//Activity 5
		System.out.println("Enter a number");
		int n = input.nextInt();
		while (n != 9999) {
			System.out.println(n * 2);
			System.out.println("Enter a number");
			n = input.nextInt();
		}

//Activity 8

	}
}
