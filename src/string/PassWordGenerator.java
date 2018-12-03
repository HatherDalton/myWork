package string;

import java.util.Scanner;
import java.util.Random;
public class PassWordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen= new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Word#1");
		String word1= input.nextLine();
		int i= word1.length();
		System.out.println("Word#2");
		String word2= input.nextLine();
		int j= word2.length();
		int g= word2.length()-1;
		System.out.println("Word#3");
		String word3= input.nextLine();
		int k= word3.length();
		int min=1;
		int max=9;
		int num= gen.nextInt(max-min+1);
		System.out.print("Your new password=  ");
		System.out.print(word1.substring(0,1));
		System.out.print(word2.substring(g,j));
		if(num<=k)
		System.out.print(word3.charAt(num));
		else
			System.out.print(word3.substring(1,2));
		System.out.print(gen.nextInt(max-min+1));
		System.out.print(gen.nextInt(max-min+1));
		System.out.print(gen.nextInt(max-min+1));
	}

}
