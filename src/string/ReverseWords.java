package string;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a word");
		String sen= input.nextLine();
		String reverse= ".";
		int i;
		for(i= sen.length()-1; i>=0; i--);
		reverse= reverse+ sen.charAt(i);
		
	}

}
