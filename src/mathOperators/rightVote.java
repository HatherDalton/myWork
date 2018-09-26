package mathOperators;
import java.util.Scanner;
public class rightVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("How old are you now?");
			int age;
			age = input.nextInt();
			age = 18 - age;
			System.out.println("You will be able to vote in "+age+ " year/years");
			input.close(); 

	}

}
