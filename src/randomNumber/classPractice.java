package randomNumber;

import java.util.Random;

public class classPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int min=0;
		int max=100;
		int randomNum= min + generator.nextInt(max-min+1);
		System.out.println("A random number between " +min+ " and " + max);
		System.out.println("is: " +randomNum);
	}

}
