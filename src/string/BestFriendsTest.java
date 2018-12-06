package string;

import java.util.Scanner;

public class BestFriendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestFriends bob= new BestFriends();
		Scanner input = new Scanner(System.in);
		String name= input.nextLine();
		bob.changeFriends(3, name);
	}

}
