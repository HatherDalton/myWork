package mathOperators;
import java.util.Scanner;
public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is the length of your surface in inches?");
		double length;
		length = input.nextDouble();
		System.out.println("What is the width of your surface in inches?");
		double width;
		width = input.nextDouble();
		
		double areas;
		areas = length * width;
		
		
		double postitl = 3.0;
		double postitw = 3.0;
		double areaa;
		
		areaa = postitl * postitw;
		
		double postit;
		postit = areas/ areaa;
		
		System.out.println("There can be " +postit+ " postits that can fit on your " +length+"x"+width+ " inch wall");
		
		
		input.close();
	}

}
