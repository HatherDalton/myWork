package arrays;

import java.util.Random;
import java.util.Scanner;

public class Crazy_Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]Cost= new double[5];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<Cost.length; i++) {
			System.out.println("What is the price of item #"+i);
			Cost[i] = input.nextDouble();
		}
		System.out.println("                 ");
		System.out.print("!!!CRAZY SALE!!!   ");
		System.out.print("!!!CRAZY SALE!!!   ");
		System.out.print("!!!CRAZY SALE!!!");
		System.out.println("                 ");
		
		Random gen = new Random();
		int max=100;
		int min=0;
		for(int i=0; i<Cost.length; i++) {
			double percent= (gen.nextInt(max - min + 1)/100);
			System.out.print("New price of item #"+i+"=  ");
			double num= (percent*Cost[i]);
			Cost[i]= Cost[i]- num;
			System.out.println(Cost[i]);
		}
	}

}
