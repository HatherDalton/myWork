package mathOperators;
import java.util.Scanner;
public class BussesVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("How many people are in your group?");
		int group;
		group = input.nextInt();
		
		int bus;
		int van;
		int remainder;
			
		bus = group/35;
		remainder = group - 35*bus;
		van = 34/remainder;
		
		
		System.out.println("You will take " +bus+ " bus/busses on your trip");
		System.out.println("There will be " + remainder + " people left.");
		System.out.println("You will need to take " +van+ " van/vans for the overflow.");

		input.close();
	}

}
