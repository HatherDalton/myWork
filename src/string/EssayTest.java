package string;

import java.util.Scanner;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Essay bob= new Essay();
		System.out.println("What is your first and last name?");
		bob.setName(input.nextLine());
		System.out.println("Write your essay");
		bob.setEssay(input.nextLine());
		System.out.println("LastName= "+bob.CapLast());
		System.out.println("FirstName= "+bob.countLetter());
		System.out.println("# of words in Essay= "+ bob.wordCount());
	}

}
