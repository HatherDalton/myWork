package arrays;

import java.util.Scanner;

public class SeatingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int s = 0;
			do{
				System.out.println("How many students are in the class?");
			
			 s= input.nextInt();
			if(s%4 == 0) {
				s = s + 0;
			}else {
				s = 0;
				System.out.println("Try again");
			}
	}while(s%4 != 0);
	}

}
