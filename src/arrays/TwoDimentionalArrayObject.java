package arrays;

import java.util.Scanner;

public class TwoDimentionalArrayObject {
//strings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[][] names = new String[4][3];
		System.out.println("What is the persons name?");
		for (int row = 0; row < names.length; row++) {
			for (int column = 0; column < names[0].length; column++) {
				names[row][column] = input.nextLine();
				System.out.println("");
			}
			System.out.println("");
		}
		for (int row = 0; row < names.length; row++) {
			for (int column = 0; column < names[0].length; column++) {
				System.out.println(names[row][column].substring(names[row][column].indexOf(" ")));
			}
			System.out.println("");
		}

	}

}
