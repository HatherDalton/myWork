package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int dividend;
		int divisor;
		int longdivision;
		int remainder; 
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		
		longdivision = dividend / divisor;
		remainder= dividend % divisor; 
		
		System.out.println("Result:" +longdivision+"r" +remainder);
		input.close();

		

	}

}
