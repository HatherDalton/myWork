package designingClass;

import java.util.ArrayList;

public class Students {

	private String name;
	private ArrayList<Integer> scores;

	public Students() {
		name = "NA";
	}

	public Students(String xNames, int xTest) {
		name = xNames;
		scores.add(xTest);
	}

	public void addScore(int nScore) {
		scores.add(nScore);
	}

	public int averageScore() {
		int average = 0;
		int i;
		for (i = 0; i < scores.size(); i++) {
			average += scores.get(i);
		}
		average = average / i;
		return average;
	}

	public int lowestScore() {
		int lowest = 100;
		for (int j = 0; j < scores.size(); j++) {
			if (scores.get(j) < lowest) {
				lowest = scores.get(j);
			}
		}
		return lowest;
	}

}
