package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class HW_Algebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentClass> algebra = new ArrayList<StudentClass>();
		Scanner input = new Scanner(System.in);

		System.out.println("How many students do you have in the class?");
		int students = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < students; i++) {
			System.out.println("Name? (N for next)");
			String xNames = input.nextLine();
			input.next();
			System.out.println("Score?");
			int xScore = input.nextInt();
			input.nextLine();
			StudentClass thing = new StudentClass(xNames, xScore);
			algebra.add(thing);
		}

		// input.next();
		for (int j = 0; j < algebra.size(); j++) {
			StudentClass hello = algebra.get(j);
			System.out.print(hello.returnName() + ": ");
			System.out.print(hello.returnScore());
			System.out.println("");

		}

	}
}
