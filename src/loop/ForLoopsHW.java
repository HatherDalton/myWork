package loop;

import java.util.Scanner;

public class ForLoopsHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//Sum of Odd
		int p= 6;
		int counter=0;
		for (p=6;p<=1; p=p+2) {
			counter= counter+p;
			System.out.println("Sum= "+counter);
		}
//Class Average
		int students;
		int grade;
		int sum=0;
		int average;
		System.out.println("How many tudents are in the class?");
		students=input.nextInt();
		for (students=1; students<=30; students=students-1) {
			System.out.println("What is the students grade");
			grade=input.nextInt();
			sum= sum+grade;
		}
		average= sum/students;
	}

}
