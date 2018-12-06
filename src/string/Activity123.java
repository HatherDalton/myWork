package string;

import java.util.Scanner;

public class Activity123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//charAt
		Scanner input = new Scanner(System.in);		
		System.out.println("Write a sentance");
		//declare + input
		String write= input.nextLine();
		//Use it
		System.out.println(write.charAt(0));
		System.out.println(write.charAt(2));
		System.out.println(write);
	}

}
