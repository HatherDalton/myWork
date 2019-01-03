package arrays;

import java.util.Random;
import java.util.Scanner;

public class PostHolidayBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		Random gen= new Random();
		
		int min= 1;
		int max= 17;
		int [] sph= new int[1340];
		int num = 0;
		int students=0;
		
		for(int i=0; i<sph.length; i++) {
			num=min + gen.nextInt(max-min+1);
			sph[i]= num;
			num=0;
		}
		
		for(int i=0; i<sph.length; i++) {
			if(sph[i]>7)	{
				
			}
			if(sph[i]%2==0) {
				students++;
			}
		}
		System.out.println("");
		System.out.println("Households with even amount of students= " + ((students/sph.length)*100));
	}

}
