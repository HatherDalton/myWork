package string;

import java.util.Scanner;
import java.util.Random;
public class PassWordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen= new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("5 letter Word#1");
		String word1= input.nextLine();
		System.out.println("6 letter Word#2");
		String word2= input.nextLine();
		System.out.println("7 letter Word#3");
		String word3= input.nextLine();;
		int length=word2.length();
		int min=1;
		int max=10;
		System.out.print("Your new password=  ");
		System.out.print(word1.substring(0,1));
		System.out.print(word2.substring(5,6));
		System.out.print(word3.substring(4,5));
		System.out.print(gen.nextInt(max-min+1));
		System.out.print(gen.nextInt(max-min+1));
		System.out.print(gen.nextInt(max-min+1));
	}

}
