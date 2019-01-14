package arrays;

public class MallSanta {
	private String name;
	private int age;
	private boolean criminal;

	public MallSanta() {
	}

	public MallSanta(String xName, int xAge, boolean xCriminal) {
		name = xName;
		age = xAge;
		criminal = xCriminal;
	}

	public String getName(String fName) {
		name = fName;
		return name;
	}

	public boolean employable() {
		boolean employ = false;
		if (age > 50 && age <= 70 && criminal == false) {
			employ = true;
		}
		return employ;
	}

//
}
