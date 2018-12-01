package string;

import java.util.Scanner;

public class Guidance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your last name?");
		String last= input.nextLine();
		last.toLowerCase();
		last.substring(0,1);
		
		
/**Mr Williams=a-g
		 Mrs Smith= h-n
		 Mrs Johnson= o-st(inlcuedes)
		 Mr. Bond= (excludes)st-z
		 **/
	}

}
