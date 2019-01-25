package designingClass;

import java.util.Random;

public class pileOjunk {
//Class Definition
	private static int unique;
	private int num;
	
	public pileOjunk() {
		unique= 0;
	}

	public pileOjunk(int xUnique) {
		unique= xUnique;
	}

	public int getRandom() {
		Random generator = new Random();
		int min= 10;
		int max=100;
		int random=  min + generator.nextInt(max - min + 1);
		return random;
	}
}
