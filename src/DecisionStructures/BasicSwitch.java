package DecisionStructures;
import java.util.Scanner;
public class BasicSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		System.out.println("What is deciered program?");
		System.out.println("1) How much do you weigh");
		System.out.println("2) Do the Math");
		System.out.println("3) Circle Test Class");
		System.out.println("4) Rectangle Test Class");
		int program= input.nextInt();
		
		switch(program) {
		case 1://How much do you weigh
			
			System.out.println("1) How much do you weigh");
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			System.out.println("What is your favorite Plant?");
			System.out.println("1) Mercury");
			System.out.println("2) Venus");
			System.out.println("3) Mars");
			System.out.println("4) Jupiter");
			System.out.println("5) Saturn");
			int planet= input.nextInt();
			
			switch(planet)
			{	
			case 1:
				weight= weight/2.645;
				System.out.println("Your weight on Mercury equals " +weight);
				break;
			case 2:
				weight= weight/1.102;
				System.out.println("Your weight on Venus equals " +weight);
				break;
			case 3:
				weight= weight/2.652;
				System.out.println("Your weight on Mars equals " +weight);
				break;
			case 4:
				weight= weight/0.3955;
				System.out.println("Your weight on Jupiter equals " +weight);
				break;
			case 5:
				weight= weight/0.93984;
				System.out.println("Your weight on Saturn equals " +weight);
				break;
		}
		
		case 2: //DoMath
			System.out.println("2) Do the Math");

		case 3://CircleTestClass
			System.out.println("3) Circle Test Class");
		case 4://RectangleTestClass
			System.out.println("4) Rectangle Test Class");
		}
		
		


		
		
		
		
		
	}

}
