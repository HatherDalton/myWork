package AP_Review;

public class Person {

	private String name;
	private int age;

	public Person(String myName, int myAge) {
		name = myName;
		age = myAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

//(A)
	public boolean matches(Person p) {
		boolean matches = false;
		if (p.getAge() == age && p.getName() == name)
			matches = true;
		return matches;
	}
}
