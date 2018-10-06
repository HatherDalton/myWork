package mathOperators;
import java.util.Scanner;
public class PullPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is your phone number with no dashes?");
		double number;
		number = input.nextDouble();
		
		double first;
		double middle;
		double last;
		
		first = (number/10000000);
		
		middle = number % 10000000;
		middle= (middle/10000);
		
		last = number % 10000;
		last = last % 10000;
				
		System.out.println("The area code is " + first);
		System.out.println("The middle three diggets are " + middle);
		System.out.println("The last four digets of your phone are " + last);


	}

}
