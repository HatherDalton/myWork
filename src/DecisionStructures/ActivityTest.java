package DecisionStructures;
import java.util.Scanner;
public class ActivityTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Magic Number
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Guess the magic number");
		number = input.nextInt();
		
		if (number==7) {
			System.out.println("You win the prize!!!");
			System.out.println("A bunch of snakes ona plane");
		}
		
		System.out.println("Aaaahhhh, Try again.");
		
		//Honors
		double gpa;
		int senior;
		System.out.println("What grade are you in, in number form?");
		senior = input.nextInt();
		System.out.println("What is your GPA?"); 
		gpa= input.nextDouble();
		
		if (gpa>=3.5 && senior== 12) {
			System.out.println("You will graduate with honors!!!"); 
		}
		else {
			System.out.println("You will not graduate with honors:(");
		}
		
		//LuckyNumber
		double age;
		System.out.println("What is your age?");
		age= input.nextDouble();
		
		
		if (age >18) {
			System.out.println("What is your height?");
			double height= input.nextDouble();
			double lucky= height * 5;
		}
		else {
			System.out.println("What is your weight?");
			double weight = input.nextDouble();
			double xnumber = weight/2;
		}

		
		//YouWon!!!
		double money;
		System.out.println("How much money did you get on your fifth birthday?");
		money = input.nextDouble();
		double square= Math.sqrt(84.3);
		if(Math.abs(money- square)< 0.001) {
			System.out.println("You get a high five   ;P ");
		}
		else {
			System.out.println("You get a low five   :D ");
		}
}
}
