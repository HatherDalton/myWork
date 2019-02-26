package comparableInterface;

import java.util.ArrayList;
import java.util.Random;

public class ForEach_Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//need to make it a for each loop

		ArrayList<Cat> animal = new ArrayList<Cat>();
		Random generator = new Random();
		int min = 0;
		int max = 100;

		for (int i = 0; i < 100; i++) {
			animal.add(new Cat(min + generator.nextInt(max - min + 1), min + generator.nextInt(max - min + 1)));
		}

		Cat smallest = animal.get(0);
		for (int i = 1; i < animal.size(); i++) {
			if (smallest.compareTo(smallest) < 0) {
				smallest = animal.get(i);
			}
		}

		Cat largest = animal.get(0);
		for (int i = 1; i < animal.size(); i++) {
			if (largest.compareTo(largest) > 0) {
				largest = animal.get(i);
			}
		}

///////////////////////////////////////////////////////
	}
}