package loop;

import java.util.Scanner;

public class DoWhileHW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//Sum the numbers
	int number;
	int sum;
	System.out.println("Pick a number");
	number= input.nextInt();
	do {
		System.out.println("Pick a number to add (9999 to quit)");
		sum= input.nextInt();
		number = number +sum;
	}while(sum!=9999);
	System.out.println("Total sum=" + (number-9999));

	//How many Numbers
		int num1=0;
		int num;
		System.out.println("Year?");
		int year= input.nextInt();
		do {
			System.out.println("Pick a number (Quit= 9999)");
			num= input.nextInt();
			num1= num1+num;
		}while(num!=9999);
		if (num1>=year) {
			System.out.println("Sum= " + num1);
		}
		
//CircleTest
		
//TriangleTest

	
	
	
	
	}
}
