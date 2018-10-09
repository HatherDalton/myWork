package mathOperators;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you now?");
		int age;
		age = input.nextInt();
		age = age + 7;
		System.out.println("You will be "+age+ " in seven years");
		input.close(); 

	}

}
