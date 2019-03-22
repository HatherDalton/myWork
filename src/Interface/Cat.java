package Interface;

public class Cat implements Animal {

	private String name;
	private int age;
	private boolean friendly;

	public Cat() {
		name = "Ava";
		age = 0;
		friendly = false;
	}

	public void act() {
		age += 7;
		friendly = true;
	}

	public String toString() {
		return "Cat's Name: " + name;
		// What does it mean to return the state of the object?
	}

	public boolean friendly() {
		return friendly;
	}

}
