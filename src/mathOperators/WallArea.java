package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("What is the lenght of the wall in feet?");
		double length;
		length = input.nextDouble();
		System.out.println ("What is the width of the wall in feet?");
		double width;
		width = input.nextDouble();
		double area;
		area= length * width;
		
		System.out.println("The area of the wall equals " + area);
		input.close(); 

	}

}
