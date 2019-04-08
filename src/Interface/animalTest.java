package Interface;

import java.util.ArrayList;

public class animalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Animal> pets = new ArrayList<Animal>();
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());
		pets.add(new Dog());
		pets.add(new Cat());

		for (Animal wild : pets) {
			wild.act();
			wild.toString();
		}

		for (Animal beast : pets) {
			if (beast instanceof Dog) {
				Dog k9 = (Dog) beast;
				k9.vet();
			}
		}
		for (int i = pets.size(); i >= 0; i--) {
			Animal die = (Animal) pets;
			if (die instanceof Cat) {
				Cat lion = (Cat) die;
				if (lion.friendly() == false) {
					pets.remove(i);
					break;
				}
			}
		}

	}
}
