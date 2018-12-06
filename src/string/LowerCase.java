package string;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("Write a sentance");
		String write= input.nextLine();
		String lower= write.toLowerCase();
		System.out.println("Lower case sentance= "+ lower);
		System.out.println("Sentance= "+ write);
	}

}
