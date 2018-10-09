package mathOperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("What is the change you will get back??");
		int sum;
		sum = input.nextInt();
		
		int quarters;
		int dimes;
		int nickels;
		int penny;
		int dollars;
		int remainder;
		
		
		dollars = sum / 100;// 2
		remainder = sum % 100 ; //34
		
		quarters = remainder / 25; // 1.36
		remainder= (remainder) - (25 * quarters); // 9
		
		dimes = remainder /10; // 0
		//remainder = remainder - 10; //
		
		nickels =  remainder/ 5; //1.8
		remainder = remainder - 5; // 4
		
		penny =  remainder/1;
		
		
		System.out.println("You will get " +sum+ " back in change");
		
		System.out.println("Your change will come out to be "+dollars+ " dollars, "+quarters+ " quarters, " +dimes+ " dimes, " +nickels+ " nickels, and" +penny+ " pennies");
		

		input.close();
	}

}
