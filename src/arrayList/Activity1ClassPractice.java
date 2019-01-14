package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity1ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();

		names.add("Bob Smith");
		names.add("Jane Miller");
		names.add(0, "Billy Jones");

		System.out.println("What is your name?");
		names.add(input.nextLine());

		System.out.println("     ");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("     ");

		names.remove(1);
		// names.remove(names.size()-1);

		System.out.println("Remaining people:");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("-->" + names.get(i));
		}
////////////////////////////////////////////////////////////////////
	}
}
