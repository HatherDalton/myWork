package loop;

import java.util.Scanner;

public class ActivityTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

//Activity 5
		System.out.println("Enter a number (9999 to quit)");
		int n = input.nextInt();
		while (n != 9999) {
			System.out.println("Your number times 2 is " + n * 2);
			System.out.println("Enter a number (9999 to quit)");
			n = input.nextInt();
		}

//Activity 8
		double total =0;
		int counter=0;
		int continu  =1;
		while (continu==1) {
			System.out.println("Type a number");
			total+= input.nextDouble();
			counter++;
			System.out.println("Continue (1=Yes/0=Now)");
			continu=input.nextInt();
		}
		System.out.println("Average= " + (total/counter));

	}
}
