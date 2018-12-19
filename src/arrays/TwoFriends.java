package arrays;

import java.util.Random;
import java.util.Scanner;

import arrays.Friend_Class.Friend;

public class TwoFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		Friend [][] people= new Friend[18][5];
		int min=0;
		int max=100;
		
		for (int row = 0; row < people.length; row++) {
			for (int column = 0; column < people[0].length; column++) {
				people[row][column] = new Friend("a",min+generator.nextInt(max-min+1);
			}
				System.out.println("");
			}
			System.out.println("");
	}
	
}
