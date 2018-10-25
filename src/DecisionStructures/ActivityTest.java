package DecisionStructures;
import java.util.Scanner;
public class ActivityTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Magic Number
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Guess the magic number");
		number = input.nextInt();
		
		if (number==7) {
			System.out.println("You win the prize!!!");
			System.out.println("A bunch of snakes ona plane");
		}
		
		System.out.println("Aaaahhhh, Try again.");
		//
}
}
