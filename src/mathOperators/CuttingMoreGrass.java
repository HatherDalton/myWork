package mathOperators;
import java.util.Scanner;
public class CuttingMoreGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is the lenght of the yard?");
		double length;
		length = input.nextDouble();
		System.out.println("What is the width of the yard?");
		double width;
		width = input.nextDouble();
		System.out.println("What is the width of the mower deck in inches?");
		double deckw;
		deckw = input.nextDouble();
		deckw = deckw / 12;
		System.out.println("What is the speed the lawn mover can make?");
		double mph;
		mph = input.nextDouble();
		mph = mph / 5280;
				
		double passes;
		passes= Math.round((width/ deckw)+0.5);
		double distance;
		distance = length * passes;
		double time;
		time= ((distance/ mph)/ 5280);
		
		
		final double cost= 12;
		double amount;
		amount = (time-1) * cost;
		
		System.out.println("It will take " +time+ " hours.");
		System.out.println("It will cost you " +amount+ " dollars.");

		
		input.close();
	}

}
