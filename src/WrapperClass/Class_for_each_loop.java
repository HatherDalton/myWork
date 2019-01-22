package WrapperClass;

import java.util.ArrayList;
import java.util.Scanner;

import oop.CircleClass;

public class Class_for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Employees");
		int num= input.nextInt();
		ArrayList<CircleClass>circle= new ArrayList <CircleClass>();
		
		for (CircleClass temp: circle) {
			//System.out.println(temp.area());
		}
////////////////////////////////////////////////////////
	
	}

}
