package randomNumber;

import java.util.Random;

public class classPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(5);
		int min=0;
		int max=100;
		int randomNum= min + generator.nextInt(max-min+1);
		System.out.println("A random number between " +min+ " and " + max);
		System.out.println("is: " +randomNum);
		
//Activity#1
		int head=0;
		int tail=0;
		int Xmin;
		int Xmax;
		Random gen= new Random(8);
		for(int i=1; i<=100000; i++) {
		Xmin=1;
		Xmax=2;
		int ranum= min + gen.nextInt(max-min+1);
		if (ranum ==1)
		head++;
		else
			tail++;
		}
		System.out.println("Head Count= " + head);
		System.out.println("Tail Count= " + tail);

//Activity#2
		int ymin;
		int ymax;
		int mult=0;
		Random gen1= new Random(8);
		for(int i=1; i<=87; i++) {
		ymin=1;
		ymax=13;
		int randum= min + gen1.nextInt(max-min+1);
		if (randum%3==0);
		mult++;
		}
		System.out.println("Mult of 3= " + mult);
		
//Activity#3
		int zmin;
		int zmax;
		int height=0;
		Random gen2= new Random(8);
		for(int i=1; i<=248; i++) {
		ymin=26;
		ymax=43;
		int randum= min + gen2.nextInt(max-min+1);
		if (randum>=36) {
			height++;
		}
		}
		System.out.println("Count= "+ height);
//
	}

}
