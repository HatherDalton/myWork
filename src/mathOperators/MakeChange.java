package mathOperators;
import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("How much did your bill cost in pennies?");
		int cost;
		cost = input.nextInt();
		System.out.println("What did you pay with in pennies?");
		int bill;
		bill = input.nextInt();
		
		int sum;
		int quarters;
		int dimes;
		int nickels;
		int penny;
		sum = bill - cost;
		
		quarters = sum / 25;
		quarters = quarters * 25;
		sum = sum - quarters;
		
		dimes = sum /10;
		nickels =  sum/ 5;
		penny =  sum/1;
		
		
		System.out.println("You will get " +sum+ " back in change");
		
		System.out.println("Your change will come out to be "+quarters+ " quarters," +dimes+ " dimes," +nickels+ " nickels" +penny+ " pennies");
		

		input.close();
	}

}
