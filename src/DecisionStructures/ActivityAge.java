package DecisionStructures;
import java.util.Scanner;
public class ActivityAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		double age;
		double length;
		System.out.println("What is your age?");
		age = input.nextDouble();
		
		System.out.println(age >= 26 );
	
	// Age activity if() practice
		
		int xAge;
		System.out.println("What is your age?");
		xAge = input.nextInt();
		 if (xAge > 18) {
			 System.out.println("You will be charged as an adult");
		 }
	 
		 System.out.println("Have a nice day :]");
	
	}

}
