package string;

import java.util.Scanner;

public class ModSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentance");
		String words= input.nextLine();
		for(int i=0; i<words.length(); i++)
		if(words.charAt(i)!=' ' && words.charAt(i)!='a') {
			System.out.print(words.charAt(i));
			}
		
	}

}
