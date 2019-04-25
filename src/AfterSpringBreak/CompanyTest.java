package AfterSpringBreak;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Number of Employees?");
		int num = input.nextInt();

		ArrayList<Employee> worker = new ArrayList<Employee>();
		for (int i = 0; i < num; i++) {
			worker.add(new Employee());
		}
		System.out.println("Raise Equals:");
		double bob = input.nextDouble();

		worker.get(worker.size()).modifyRate(bob);
		for (int i = 0; i < 10; i++) {
			System.out.println(worker.get(i).calcPay(3));
		}
	}

}
