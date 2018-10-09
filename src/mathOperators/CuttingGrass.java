package mathOperators;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What is the lenght of the yard?");
		double length;
		length = input.nextDouble();
		System.out.println("What is the width of the yard?");
		double width;
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain?");
		double radius;
		radius = input.nextDouble();
		
		double area;
		area= length * width;
		double circle;
		circle = radius * radius; 
		circle = circle * 3.14;
		
		double total;
		total = area - circle;
		
		double square;
		double cost;
		square =total/100;
		cost = square * 1.25;
		
		System.out.println("The lawn cutter will cut " +total+ " square feet of grass.");
		System.out.println("It will cost you " +cost+ " dollors.");

		
		input.close();
	}

}
