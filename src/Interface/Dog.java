package Interface;

public class Dog implements Animal {

	private int age;
	private String name;
	private boolean injured;

	public Dog() {
		name = "Toby";
		age = 0;
		injured = true;
	}

	public void act() {
		age += 7;
		injured = false;
		// what does it mean that 1 out of 50 change it gets injured
	}

	public String toString() {
		return "Dog Name: " + name;
		// What does it mean to return the state of the object?

	}

	public boolean vet() {
		injured = false;
		return injured;
	}

}
