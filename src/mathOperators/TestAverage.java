package mathOperators;
import java.util.Scanner;
public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Answer all questions to the nearest whole number.");
		System.out.println("What is the final exam grade you got in your Chemistry class?");
		int chemistry;
		chemistry = input.nextInt();
		System.out.println("What is the final exam grade you got in your Spanish class?");
		int spanish;
		spanish = input.nextInt();
		System.out.println("What is the final exam grade you got in your English class?");
		int english;
		english = input.nextInt();
		
		int average;
		int whole;
		
		whole = chemistry + spanish + english;
		average = whole/3;
		
		System.out.println("On average you got a " + average + "% on all three of your final exams.");
		input.close();
	}

}
