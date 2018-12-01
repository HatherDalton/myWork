package string;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Your Social Security number (no dashes)");
		String ss= input.nextLine();
		System.out.println("End= " + ss.substring(5,9));
		System.out.println("Middle= " + ss.substring(3,5));
		System.out.println("Beginning= " + ss.substring(0,3));
		
	}

}
