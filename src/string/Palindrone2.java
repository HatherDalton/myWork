package string;

import java.util.Scanner;

public class Palindrone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean repeat = true;

		do {
			System.out.println("Please enter a word");
			String original = input.nextLine();
			String reverse = "";
			for (int i = original.length() - 1; i >= 0; i--) {
				reverse = reverse + original.charAt(i);
			}
			if (original.equalsIgnoreCase(reverse)) {
				System.out.println("This is a palindrome!");
			} else {
				System.out.println("This is not a palindrome");
			}
			System.out.println("You want to repeat this process? true/false");
			repeat = (input.nextLine().trim().equalsIgnoreCase("false") ? false : true);

		} while (repeat);
	}

}
