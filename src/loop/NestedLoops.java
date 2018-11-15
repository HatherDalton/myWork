package loop;

import java.util.Scanner;

public class NestedLoops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
// Nesting= putting things inside of something
// in a for loop (i=1;i<=10; i=i+1)
//(start counting at; stop at; change the variable)
		int i=0;
		for (int k=1; k<=5;k++) {
		for (i=1;i<=10; i++) {
			System.out.println(k+ " Hello World!");
		}
		}
//Activity #1
		for(int j=1;j<=4; j++) {
			for(int b=1;b<=5; b++) {
			System.out.print(j*b + "");
		}
		}
	System.out.println("  ");
	
//Activity #2
	for (int r=1; r<=5; r++) {
		System.out.println("");
		System.out.print("1");
		System.out.print("2");
		System.out.print(r);
		System.out.print("4");
		System.out.print("5");
		System.out.println("");
}
//Activity#3 (Similar to divisor program)
	for (int divisor=1; divisor<=10; divisor++) {
	int h;
	int count=0;
	int num=0;
	System.out.println("What is a number");
	h= input.nextInt();
	for (count=1;count<=h; count++)
	if (h % count ==0) {
		System.out.print(count + " ");
		num++;
	}
	System.out.println("");
	System.out.println("Number of Divisors= "+num);
	}
	

	//Activity#4
	
	}
}
