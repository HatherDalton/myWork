package string;

import java.util.Scanner;

public class PersonsPasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		PersonsPassword bob= new PersonsPassword();
		int pwAttempts;
		boolean yess = false;
		do {
		System.out.println("Please enter the password in the format LastName:Password");
		String word= input.nextLine();
		int place= word.indexOf(":");
		System.out.println(bob.setPassword(word.substring(place + 1)));
		
		}while(yess!= true);
	}

}
