package mathOperators;
import java.util.Scanner;
public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		System.out.println("What is the width of your surface in feet?");
		double width;
		width = input.nextDouble();
		System.out.println("What is the length of your surface in feet?");
		double length;
		length = input.nextDouble();
		final double HEIGHT = 8.0;
		
		double surface;
		double area;
		double total;
		surface= width * HEIGHT;
		surface = surface * 2;
		area= length * HEIGHT;
		area = area * 2;

		total = surface + area;
		
		System.out.println("The surface area you need to cover is " + total);

		double paint = 150.0;
		double all;
		all = total/paint;
		
		System.out.println("You will need " + all + " cans of paint.");

		input.close();
	}

}
