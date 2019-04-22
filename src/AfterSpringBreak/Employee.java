package AfterSpringBreak;

import java.util.Random;

public class Employee {

	private String name;
	private int rate;
	private Integer[] worked = new Integer[52];
	private int emClassNum;
	private int employNum;

	public Employee() {
		name = "John Smoth";
		rate = 10;
		Random generator = new Random();
		int min = 0;
		int max = 40;
		for (int i = 0; i < worked.length; i++)
			worked[i] = min + generator.nextInt(max - min + 1);
		emClassNum++;
		employNum = emClassNum;
	}

	public void modifyRate(double xNum) {
		rate += xNum;
	}

	public int calcPay(int week) {
		int num = worked[week - 1];
		return num * rate;
	}
}
