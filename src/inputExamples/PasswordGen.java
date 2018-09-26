package inputExamples;
import java.util.Scanner;
public class PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Using a whole number how many animals have you had in your life?");
		int animals;
		animals = input.nextInt();
		System.out.println("Pick a whole number between 1 and 9");
		int two;
		two = input.nextInt();
		System.out.println("What is the number of bathrooms are in your house?");
		int house;
		house = input.nextInt();
		System.out.println("Your new password is ");
		System.out.println(animals+ " " +two+ " "+ house);
		System.out.println(two+ " " +animals+ " "+ house);
		System.out.println(house+ ""  +two+ " "+animals );
		System.out.println(house+ ""  +animals+ " "+ two);
		input.close();
}
}