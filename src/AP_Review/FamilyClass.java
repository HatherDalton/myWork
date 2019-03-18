package AP_Review;

import java.util.ArrayList;

public class FamilyClass {

	private ArrayList<Person> adult;
	private ArrayList<Person> children;

	public FamilyClass(Person n, Person q) {
		if (n.getAge() < 18) {
			children.add(n);
		} else
			adult.add(n);
		if (q.getAge() < 18) {
			children.add(q);
		} else
			adult.add(q);
	}

	public boolean isInFamily(Person m) {
		boolean answer = false;
		// if (m.getAge()== adult.getAge() || children.getAge() && m.getName()==
		// adult.getName() || children.getName()) {
		// answer= true;
		// }
		return answer;
	}

}
