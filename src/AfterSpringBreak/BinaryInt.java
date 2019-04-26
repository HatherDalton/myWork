package AfterSpringBreak;

public class BinaryInt {

	private int num;

	public BinaryInt() {
		num = 0;
	}

	public BinaryInt(int x) {
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

}

