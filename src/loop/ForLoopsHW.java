package loop;

import java.util.Scanner;

public class ForLoopsHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//Sum of Odd
		int p= 6;
		int counter=0;
		System.out.println("Positive Number");
		int num= input.nextInt();
		for (p=1;p<num; p=p+1) {
			counter= counter+p;
			System.out.println("Sum= "+counter);
		}
//Class Average
		int students;
		int i=1;
		int grade;
		int sum=0;
		int average;
		System.out.println("How many students are in the class?");
		students=input.nextInt();
		for (i=1; i<=students; i++) {
			System.out.println("What is the students grade");
			grade=input.nextInt();
			sum= sum+grade;
		}
		System.out.println(average= sum/students);
	}

}
