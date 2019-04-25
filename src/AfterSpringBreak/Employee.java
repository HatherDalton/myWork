package AfterSpringBreak;

import java.util.Random;

public class Employee {

	private String name;
	private double rate;
	private double[] worked;
	private static int emClassNum = 0;
	private int employNum;

	public Employee() {
		name = "John Smoth";
		rate = 10;
		Random generator = new Random();
		int min = 0;
		int max = 40;
		for (int i = 0; i < 52; i++)
			worked[i] = min + generator.nextInt(max - min + 1);
		emClassNum++;
		employNum = emClassNum;
	}

	public void modifyRate(double xNum) {
		if ((rate + xNum) >= 0)
			rate += xNum;
	}

	public double calcPay(int week) {
		if (week < 1 || week > 52)
			return -9999;

		return (worked[week - 1] * rate);
	}
}
