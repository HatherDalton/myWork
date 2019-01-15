package WrapperClass;

import java.util.Scanner;

public class for_each_loopActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of students");
		int num= input.nextInt();
		int[]ages= new int[num];
		
		for (int j=0;j<ages.length; j++) {
			System.out.println("Enter students Age");
			ages[j]= input.nextInt();
		}
		
		int sum=0;
		for (int y: ages) {
			sum+=y;
		}
		System.out.println("Average age= "+ ((double)sum/ages.length));
////////////////////////////////////////////////////////		
	}

}
