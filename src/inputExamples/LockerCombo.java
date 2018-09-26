package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Pick a whole number between 1 and 15");
		int ten;
		ten = input.nextInt();
		System.out.println("Pick a whole number between 15 and 25");
		int two;
		two = input.nextInt();
		System.out.println("Pick a whole number between 25 and 39");
		int three;
		three = input.nextInt();
		System.out.println("Your locker combo is ");
		System.out.println(two+ "-" +three+ "-"+ ten);

	}

}
