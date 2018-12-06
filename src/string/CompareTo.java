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
	
//Activity1
		System.out.println("Write a name");
		String name3= input.nextLine();
		System.out.println("Write another name");
		String name4= input.nextLine();
		int names= name3.compareTo(name4);
		if (names<0) {
			System.out.println(name3+"comes before"+name4);
		}
		if (names>0) {
			System.out.println(name4+"comes before"+name3);
		}
		else{
			System.out.println("They are the same");
		}
	}

}
