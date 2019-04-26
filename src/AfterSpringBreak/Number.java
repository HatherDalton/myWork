package AfterSpringBreak;

public class Number {

	private int num;

	public Number() {
		num = 0;
	}

	public Number(int x) {
		if (x > 0)
			num = x;
		else
			num = 0;
	}

	public int getBinary() {
		return num;
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

	public int getNUm() {
		// TODO Auto-generated method stub
		return num;
	}

}