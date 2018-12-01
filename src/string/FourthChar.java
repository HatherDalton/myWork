package string;

import java.util.Scanner;

public class FourthChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentance");
		String sentance= input.nextLine();
		int num=1;
		for(int i=4; i<=sentance.length(); i=i+4) {
			System.out.println("Letter"+num+"=" + sentance.charAt(i));
			num++;
		}
	}

}
