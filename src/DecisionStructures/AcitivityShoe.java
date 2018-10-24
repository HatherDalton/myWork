package DecisionStructures;
import java.util.Scanner;
public class AcitivityShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		double height;
		double length;
		System.out.println("What is your height in inches?");
		height = input.nextDouble();
		System.out.println("What is your shoe size in inches?");
		length = input.nextDouble();
		System.out.println(height + length >= 26 );
	}

}
