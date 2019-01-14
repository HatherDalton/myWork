package arrays;

import java.util.Scanner;

public class MallSantaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many Santas are there");
		int num= input.nextInt();
		input.nextLine();
		
		String xNames;
		int ages;
		boolean criminals;
		int i;
		MallSanta [] santas= new MallSanta [num];
		
		for( i=0; i<santas.length; i++) {
		System.out.println("What is your name?");
		xNames= input.nextLine();
		input.next();
		System.out.println("What is your age?");
		ages= input.nextInt();
		System.out.println("true or false: You have been convicted of a crime?");
		criminals= input.nextBoolean();
		input.nextLine();
		santas[i]= new MallSanta(xNames, ages, criminals);}
	
		if(santas[i].employable()==true) {
			System.out.println("You are the new Santa");
		}
		else {
			System.out.println("Better luck next time");
		}
	}

}
