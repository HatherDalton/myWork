package inputExamples;
import java.util.Scanner;
public class Bones {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("How many bones have you broken");
		int broken;
		broken = input.nextInt();
		System.out.println("I have broken " + broken +" bones");
		input.close(); 
		
		
	}

}
