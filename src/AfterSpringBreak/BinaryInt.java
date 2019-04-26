package AfterSpringBreak;

import java.util.ArrayList;

public class BinaryInt {

	private int num;
	private int Binary;
	private ArrayList<Number>bin=new ArrayList<Number>();
	public BinaryInt() {
		num = 0;
	}

	public BinaryInt(int x) {
		if (x > 0)
			num = x;
		else
			num = 0;
	}

	public int getNUm() {
		return num;
	}

	public int getBinary(int thing) {
		int x;
		while(thing>0) {
			x=thing%2;
			System.out.println(x);
			bin.add(new Number(x));
			thing= thing/2;
			}
		for(int i=bin.size()-1; i>0; i--) {
			Binary=bin.get(i).getNUm();}
		return Binary;
	}
	
	public int check(int x) {
		if (x > 0)
			return 1;
		if (x < num)
			return -1;
		if (num == x)
			return 0;
		return 999;
	}

	public int pair(int a, int b) {
		int thing=a+b; int x; int y;
		while(thing>0) {
			x=thing%2;
			System.out.println(x);
			bin.add(new Number(x));
			thing= thing/2;
			}
		for(int i=bin.size()-1; i>0; i--) {
			y=bin.get(i).getNUm();}
		return a+b;
	}
}

