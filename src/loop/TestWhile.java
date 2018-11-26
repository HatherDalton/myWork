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
	
//Test Scores
		int score=0;
		int count=0;
		int s=0;
		while (score!= 9999) {
			System.out.println("What is your test score? (9999 to end)");
			score= input.nextInt();
			s = s + score;
			count++;
		}
		
		System.out.println("Sum= " + (s-9999));
		System.out.println("Average= " + (s/(Math.abs(count-1))));

//Rounding Run
		int number=0;
		int n=0;
		while (number !=9999) {
			System.out.println("Give me a 4 digit integer");
			number= input.nextInt();
			System.out.println("What is the number at the tenths place?");
			n= input.nextInt();
			if (n >= 50) {
				number= number+100;
			}
			else {
				number= number-100;
			}
		}
		
	//
			}
	}

	
	
