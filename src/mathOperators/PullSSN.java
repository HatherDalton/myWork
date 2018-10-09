package mathOperators;
import java.util.Scanner;
public class PullSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is your age?");
		int age;
		age = input.nextInt();
		System.out.println("What is your social secerity number with no dashes?");
		int ssn;
		ssn = input.nextInt();
		
		int years;
		years = 18 - age;
		
		int last;
		last = ssn % 10000;
		
		System.out.println("You will be 18 in " +years+ " years.");
		System.out.println("The last four digets of your SSN is " +last);

	}

}
