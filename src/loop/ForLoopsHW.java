package loop;

import java.util.Scanner;

public class ForLoopsHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//Sum of Odd
		int p = 6;
		int counter = 0;
		System.out.println("Positive Number");
		int num = input.nextInt();
		for (p = 1; p < num; p = p + 1) {
			counter = counter + p;
			System.out.println("Sum= " + counter);
		}
//Class Average
		int students;
		int i = 1;
		int grade;
		int sum = 0;
		int average;
		System.out.println("How many students are in the class?");
		students = input.nextInt();
		for (i = 1; i <= students; i++) {
			System.out.println("What is the students grade");
			grade = input.nextInt();
			sum = sum + grade;
		}
		System.out.println("Average= " + (average = sum / students));

//Cash Register
		double cost;
		int j;
		double k = 0;
		double l = 0;
		System.out.println("What is number of the items?");
		int items = input.nextInt();
		for (j = 1; j <= items; j++) {
			System.out.println("What is the cost of the item?");
			cost = input.nextDouble();
			k = k + cost;
		}
		System.out.println("Total Cost= " + k);
		l = k * 0.05;
		System.out.println("Cost of Tax= " + l);
		System.out.println("Final Cost= " + (k + l));

//Divisor
		int h;
		int count = 0;
		int num1 = 0;
		System.out.println("What is a number");
		h = input.nextInt();
		for (count = 1; count <= h; count++)
			if (h % count == 0) {
				System.out.print(count + " ");
				num1++;
			}
		System.out.println("");
		System.out.println("Number of Divisors= " + num1);
//Prime Number
		/**
		 * System.out.println("Pick a number"); int number=input.nextInt(); for (b=1;
		 * b<=50)
		 **/

	}

}
