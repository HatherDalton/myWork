package arrays;

import java.util.Scanner;

public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name[] = new String[5];

		for (int j = 0; j < 5; j++) {
			System.out.println("What is your friends  name?");
			name[j] = input.nextLine();
		}

		System.out.println("Pick a letter");
		String letter = input.nextLine();

		for (int j = name.length - 1; j >= 0; j--) {
			if (name[j].charAt(name[j].length() - 1) == letter.charAt(0))
				System.out.println(name[j]);
		}

		System.out.println("What is your desired length?");
		int lon = input.nextInt();
		
		int friends=0;
		for (int j = name.length - 1; j >= 0; j--) {
		//if 	(name.indexOf(" "))== lon) {
			friends++;
		}
		
		//}
		//System.out.println("Number of friends with the length= "+friends);
		
	}

}
