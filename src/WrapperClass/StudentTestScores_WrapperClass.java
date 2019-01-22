package WrapperClass;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentTestScores_WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of students?");
		int students= input.nextInt();
		
		ArrayList<Integer>test= new ArrayList<Integer>();

		for(int i=0; i<students; i++) {
			System.out.println("What is the test Score");
			test.add(input.nextInt());
		}
		
		int max=0;
		int min=100;
		int i=0;
		int j=0;
		for(int score: test) {
			if(test.get(score)>max) {
				max=test.get(score);
				i=score;
			}
			if(test.get(score)<min) {
				min=test.get(score);
				j=score;
			}
		}
		
		//Still have to move lowest test score to ArrayList 0
		// and highest to test.size();
		//Display integer test Scores;
		
////////////////////////////////////////////////////////
	}

}
