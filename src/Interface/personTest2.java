package Interface;

import java.util.ArrayList;

public class personTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> human = new ArrayList<Person>();
		human.add(new Student());
		human.add(new Student());
		human.add(new Student());
		human.add(new Student());
		human.add(new Teacher());
		human.add(new Teacher());
		human.add(new Teacher());

		// lots of object manipulation

//Get the names of everybody
		System.out.println("Names of Everyne: ");
		for (Person folk : human) {
			System.out.println(folk.getName());
		}

//if the persons name is greater than 10 characters display their age
		for (Person buddy : human) {
			if (buddy.getName().length() > 10)
				System.out.println(buddy.getAge());
		}

//Make all of the students out sick and display their names
		for (Person friend : human)
			if (friend instanceof Student) {
				Student kid = (Student) friend;
				kid.outSick();
				System.out.println(kid.getName());
			}

//Pay all of the teachers	
		for (Person adult : human)
			if (adult instanceof Teacher) {
				Teacher staff = (Teacher) adult;
				staff.payMe();
			}
	}
}
