package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in);
	System.out.println("What is the speedlimit?");
	int speed;
	speed = input.nextInt();
	System.out.println("What is your speed?");
	int mph;
	mph = input.nextInt();
	
	int dollor= 55;
	int additional= 40;
	int milesover;
	int yourticket;
	
	milesover = mph - speed ;
	yourticket = additional * milesover + dollor; 
	
	System.out.println("The final cost of your ticket is $" + yourticket);
	input.close();
}
}