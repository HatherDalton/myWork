package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW_AlgebraV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentClass> algebra = new ArrayList<StudentClass>();
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("How many students do you have in the class?");
		int students = input.nextInt();
		input.nextLine();
		
		int min = 0;
		int max = 100;
		
		for (int i = 0; i < students; i++) {
			System.out.println("Name? (N for next)");
			String xNames = input.nextLine();
			input.next();
			//System.out.println("Score?");
			int xScore = min + generator.nextInt(max - min + 1);
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

//////////////////////////////////////////////////////////////
	
			String nameH = new String();
			String nameL = new String();
			int high = 0;
			int low = 999;
	
			for (int k = 0; k < algebra.size(); k++) {
				if (algebra.get(k).returnScore() > high) {
					nameH = algebra.get(k).returnName();
					high = algebra.get(k).returnScore();
				}
				if (algebra.get(k).returnScore() < low) {
					nameL = algebra.get(k).returnName();
					low = algebra.get(k).returnScore();
				}
			}
		
			System.out.println("Student with highest score: " + nameH);
			System.out.println("Student with the lowest score: " + nameL);

//////////////////////////////////////////////////////////////
		}
	}

}
