package Interface;

import java.util.ArrayList;

public class personTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> human= new ArrayList<Person>();
		human.add(new Student());
		human.add(new Student());
		human.add(new Student());
		human.add(new Student());
		human.add(new Teacher());
		human.add(new Teacher());
		human.add(new Teacher());
		
		//lots of object manipulation
		
		System.out.println("Names of Everyne: ");
		for (Person folk: human) {
			System.out.println(folk.getName());
		}
	}

}
