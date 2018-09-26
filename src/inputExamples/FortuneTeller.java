package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("What is your age?");
		int age;
		age = input.nextInt();
		System.out.println ("What is your favorite whole number?");
		int number;
		number = input.nextInt();
		System.out.println ("How many people are in your family?");
		int family;
		family = input.nextInt();
		System.out.println("I see in " + age + " years you will have a family of "+ number +" with " + family + " different kinds of pets.");
		input.close(); 

}
}