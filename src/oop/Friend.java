package oop;
//import statements at the top
public class Friend {
	// instance field-data storage
	// constructor- methods for constructing the object
	//default constructor
	private String name;
	private int age;
	
	public Friend() {
		name = "";
		age = 0;
	}

	public Friend(String n, int a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public boolean search(String fn, String ln, int a) {
		if (name.substring(0, name.indexOf(" ")).equals(fn) && name.substring(name.indexOf(" ") + 1).equals(ln)
				&& age == a) {
			return true;
		} else {
			return false;
		}

	}
}

