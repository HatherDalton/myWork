package AfterSpringBreak;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryIntTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BinaryInt>bin=new ArrayList<BinaryInt>();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Binary number");
		int thing= input.nextInt();
		int num=thing;
	int x; int y=0;
	while(thing>0) {
		x=thing%2;
		System.out.println(x);
		bin.add(new BinaryInt(x));
		thing=thing/2;
		y++;
	}
	/**int k=y;
	ArrayList<BinaryInt>bob=new ArrayList<BinaryInt>();
	for(int j=0; j<y; j++) {
		int him=bob.get(y).getBinary();
		bob.add(new BinaryInt(him));
		k--;
	}**/
	
	System.out.println("Original Num=" + num);
	System.out.println("Binary num=");
	for(BinaryInt ary: bin) {
		System.out.print(ary.getBinary());
	}
	
	System.out.println(" ");
	/**
	for(BinaryInt ary: bob) {
		System.out.print(ary.getBinary());
	}**/
	
	for(int i=bin.size()-1; i>0; i--) {
		System.out.print(bin.get(i).getBinary());
	}
	}

}

