package mathOperators;
import java.util.Scanner;
public class TakeTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Answer all questions to the nearest hundredth.");
		
		System.out.println("What is the distance of your trip in miles?");
		double distance;
		distance = input.nextDouble();
		System.out.println("What is the miles per gallon in your car?");
		double mpg;
		mpg = input.nextDouble();
		System.out.println("What total amount of money you spent in gas?");
		double money;
		money = input.nextDouble();
		
		double gallons ;
		double cost;
		
		gallons = distance/mpg ;
		cost = money/ gallons ;
		
		
		
		System.out.println("The average cost per gallon of gas for this trip is $" + cost);
		input.close();

	}

}
