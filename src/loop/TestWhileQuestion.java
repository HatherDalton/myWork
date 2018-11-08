package loop;

import java.util.Scanner;

public class TestWhileQuestion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	/**
	//Count by 5
			int five=0;
			System.out.println("Stop Number");
			int stop= input.nextInt();
			while (five <= stop) {
				System.out.println(five);
				five= five+5;
				
				System.out.println("Number to stop?");
				int stop = input.nextInt();
				while (mult <= stop) {
					System.out.println(mult);
					mult = mult + 2;
			}
		**/
			
	//Large/Small (Don't understand what it is asking)
			int score=0;
			int test;
			int test2;
			int test3;
			while (score!=9999) {
				System.out.println("What is your 1 test score");
				test = input.nextInt();
				System.out.println("What is your 2 test score");
				test2 = input.nextInt();
				System.out.println("What is your 3 test score");
				test3 = input.nextInt();
				if (test>test2 && test>test3) {
					System.out.println("Greatest number= " +test);
				}
				else {
					if (test2>test && test2>test3) {
						System.out.println("Greatest number= " +test2);
					}
					else {
						if (test3>test2 && test3>test) {
							System.out.println("Greatest number= " +test3);
						}
				if (test<test2 && test<test3) {
							System.out.println("Lowest number= " +test);
						}
				else {
					if (test2<test && test2<test3) {
						System.out.println("Lowest number= " +test2);
					}
					else {
						if (test3<test2 && test3<test) {
							System.out.println("Lowest number= " +test3);
						}
					}
				}
			}
	}	
}
	}}
