package DecisionStructures;

import java.util.Scanner;

public class ActivityPetsGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pets;
		double cars;
		System.out.println("How many pets do you have?");
		pets = input.nextDouble();
		System.out.println("How many cars can you fit in your garage?");
		cars = input.nextDouble();
		
		System.out.println(pets >= 5 || cars > 3 );
		
		
	}

}
