package string;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
						//Bob
		String name1= input.nextLine();
						//bob
		String name2= input.nextLine();
		
		System.out.println(name1.compareTo(name2));
						//-1
		//name1 is lessthan name2
	}

}
