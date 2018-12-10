package arrays;

import java.util.Scanner;
import java.awt.Rectangle;
import java.util.Random;

public class ArrayObject_Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator=new Random();
		
		Rectangle []newRec= new Rectangle[5];
		
		int max=56;
		int min= 10;
		int gen= generator.nextInt(max-min+1);
		
		for (int j=0; j<newRec.length; j++) {
			newRec[j]= new Rectangle(gen, gen);
			//System.out.println(newRec[j].getArea());
		}
		
	}

}
