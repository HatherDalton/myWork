package string;

import java.util.Scanner;

public class StringClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your age");
		int age = input.nextInt();

		// Clear the buffer when it goes from a primitive to a string
		input.nextLine();

		System.out.println("What is your Full Name");
		String name = input.nextLine();
	
	
//
	}

}
