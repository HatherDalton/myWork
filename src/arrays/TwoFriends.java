package arrays;

import java.util.Random;
import java.util.Scanner;

import arrays.Friend_Class.Friend;

public class TwoFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		final int maxRow= 18;
		final int maxCol= 5;
		Friend [][] people= new Friend[maxRow][maxCol];
		int min=0;
		int max=100;
/**
		for (int row = 0; row < people.length; row++) {
			for (int column = 0; column < people[0].length; column++) {
				people[row][column] = new Friend();
				people[row][column].setAge(min + generator.nextInt(max-min+1));
			}
		}
		System.out.println("Your firends ages are");
		for(int row = 0; row < people.length; row++) {
			for(int column = 0; column < people[0].length; column++) {
				System.out.println(people[row][column].getAge());
			}
			System.out.println("    ");
		}**/
	}
	
}
