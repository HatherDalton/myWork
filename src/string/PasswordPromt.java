package string;

import java.util.Scanner;

public class PasswordPromt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String pass;
		System.out.println("Whats the password");
		String verify= input.nextLine();
		do{
		System.out.println("What write a password");
		pass= input.nextLine();	
		} while(!pass.equals(verify));
		System.out.println("The password is " + pass);
	}
}
