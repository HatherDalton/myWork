package AfterSpringBreak;

public class LocationNumeral {

//A
	public int getLetterValue(String letter) {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return (int) Math.pow(2, letters.indexOf(letter));
	}

	public String getLetter(int value) {
		return null;
	}

//B
	public int getDecimalValue(String numeral) {
		int sum = 0;
		for (int i = 0; i < numeral.length(); i++) {
			// sum+= numeral.get(i).indexof();
		}
		return sum;
	}

	public String sortLocationNumeral(String numeral) {
		return numeral;
	}

//C
	public String add(String num1, String num2) {
		String total = num1 + num2;
		boolean yes = false;
		while (!yes) {
			yes = true;
			int i = 0;
			total = sortLocationNumeral(total);
			while (i < total.length() - 1) {
				String c = total.substring(i, i + 1);
				if (c.equals(total.substring(i + 1, i + 2))) {
					String b = total.substring(0, i);
					String a = total.substring(0, i);
					total = b + getLetter(5) + a;
					yes = false;
				} else
					i++;
			}
			total = sortLocationNumeral(total);
		}
		return total;
	}
}
