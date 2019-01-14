package arrays;

import java.util.Random;

public class PostHolidayBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random generator= new Random();
		
		int min= 1;
		int max= 17;
		double even=0; //Why does making this a double change things?
		int [] sph= new int[1340];
		
		for(int i=0; i<sph.length; i++) {
			sph[i]= min + generator.nextInt(max-min+1);
		}
		
		
		for(int i=0; i<sph.length; i++) {
			if(sph[i]%2==0) {
				even++;
			}
		}
		System.out.println("Households with even amount of students= " + ((even/1340)*100)+"%");
	}

}
