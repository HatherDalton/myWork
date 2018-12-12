package arrays;

import java.util.Scanner;

public class SplitMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/**System.out.println("Write a sentence");
		String sentence= input.nextLine();
		String[]words=sentence.split(" ");
		System.out.println("First letter");
		int j;
		for (j=0; j<words.length; j++) {
		System.out.print(words[j].charAt(0));
		} **/ // program works

		System.out.println("Write a key word");
		String key= input.nextLine();
		System.out.println("Write a sentance");
		String sent= input.nextLine();
		String[]word=sent.split(" "); //This is the only thing new
		int i;
		int total=0;
		for ( i=0; i<word.length; i++) {
			if (key.equals(word[i])) {
				total++;
			}
		}
		System.out.println("Number of key words in sentance= "+ total);
	
	//Keep below
	}
}
