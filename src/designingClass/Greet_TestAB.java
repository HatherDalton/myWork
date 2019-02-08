package designingClass;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Greet_TestAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many Greeters would you like?");
		int num= input.nextInt();
		
		int min = 0;
		int max = 100;
		int thing= min + generator.nextInt(max - min + 1);
		
		ArrayList<Greeter> hello = new ArrayList<Greeter>();
		for(int i=0; i<=num; i++) {
			//hello.add(thing);
		}
		
////////////////////////////////////////////////////////
	}

}
