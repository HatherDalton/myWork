package AfterSpringBreak;

import java.util.ArrayList;

public class BinaryInt {

	private int num;

	public BinaryInt() {
		num = 0;
	}

	public BinaryInt(int dec) {
		// math for decimal to binary
		num = dec;
	}

	public int setBin(int dec) {
		num = dec == 0 ? 0 : dec % 2 + 10 * setBin(dec / 2);
		return num;
	}

	public int add(int n) {
		int sum = n + Integer.parseInt(num + "");
		return Integer.valueOf(Integer.toBinaryString(sum));
	}

	public String switchType() {
		String dig = "";
		String bin1 = new String();
		double num1 = num;
		while (num1 > 0) {
			if (num1 % 2 == 1) {
				dig = "1";
			} else {
				dig = "0";
			}
			bin1 = dig + bin1;
			num1 /= 2;
		}
		return bin1;
	}

	public int check(int c) {
		if (num > c) {
			return -1;
		}
		if (c > num) {
			return 1;
		}
		return 0;
	}

	public String createBinaryInt(int dec) {
		String dig = "";
		String bin = new String();
		double num1 = dec;
		while (num1 > 0) {
			if (num1 % 2 == 1) {
				dig = "1";
			} else {
				dig = "0";
			}
			bin = dig + bin;
			num1 /= 2;
		}
		return bin;
	}

	public int getNum() {
		return num;
	}
}
