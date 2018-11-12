package loop;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//Activity 1
		System.out.println("Enter a number");
		int num= input.nextInt();
		do {
			System.out.println("Magic number is= " + num * 17);
			System.out.println("Pick a number (9999 to quit)");
			num = input.nextInt();
		} while (num != 9999);
		
//Activity 2
		System.out.println("Enter a number");
		double number= input.nextDouble();
		do {
			System.out.println("The fifth power is= " + Math.pow(number, 5));
			System.out.println("Pick a number (9999 to quit)");
			number = input.nextDouble();
		}while (!(Math.abs(number-9999)<0.001));
	
//Activity 3
	
		int number1;
		System.out.println("Enter a number(9999 to quit)");
		number1= input.nextInt();
		int higher=number1;
		int lower=number1;
		do {
		if (number1>higher) {
			higher=number1;
		}
		if (number1<lower) {
			lower=number1;
		}
		System.out.println("Enter a number(9999 to quit)");
		number1= input.nextInt();
		}while(number1 != 9999);
		System.out.println("Range= " + (higher-lower));

	}
	

}
