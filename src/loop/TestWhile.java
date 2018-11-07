package loop;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

//Cube
		int num=0;
		System.out.println("Pick a number (-1 to quit)");
		num = input.nextInt();
		while (num != -1) {
			System.out.println("Your number cubed=" +num*num*num);
			System.out.println("Pick a number (-1 to quit)");
			num = input.nextInt();
		}
	
//Count by 5
		int five=0;
		System.out.println("Stop Number");
		int stop= input.nextInt();
		while (five <= stop) {
			System.out.println(five);
			five= five+5;
			/**
			System.out.println("Number to stop?");
			int stop = input.nextInt();
			while (mult <= stop) {
				System.out.println(mult);
				mult = mult + 2;**/
		}
		}
	
	}
