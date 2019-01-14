package arrays;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number of students?");
		int stud = input.nextInt();
		System.out.println("What is the number of tests?");
		int test = input.nextInt();
		int[][] studtest = new int[stud][test];
		System.out.println("Test scores= ");
		for (int row = 0; row < studtest.length; row++) {
			System.out.println("Student#" + (1 + row));
			for (int column = 0; column < studtest[0].length; column++) {
				studtest[row][column] = input.nextInt();
			}
			System.out.print("");
		}
		int av = 0;
		int num=0;
		for (int row = 0; row < studtest.length; row++) {
			for (int column = 0; column < studtest[0].length; column++) {
				av= av+ studtest[row][column];
			}
			System.out.println("Student Average= " + av/studtest[0].length);
			av=0;
		}
		int v = 0;
		for (int column = 0; column < studtest[0].length; column++) {
			for (int row = 0; row < studtest.length; row++) {
				v += studtest[row][column];
			}
			System.out.println("Test Average= " + (v / studtest.length));
			v=0;
		}

		int average = 0;
		int i = 1;
		for (int row = 0; row < studtest.length; row++) {
			for (int column = 0; column < studtest[0].length; column++) {
				average += studtest[row][column];
				i++;
			}
		}

		System.out.println("Class Average= " + (average/studtest[0].length));

		//
	}

}
