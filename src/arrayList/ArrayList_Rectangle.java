package arrayList;

import oop.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class ArrayList_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		Random generator = new Random();
		int min = 50;
		int max = 70;
		for (int i = 0; i <= 10; i++) {
			int width = min + generator.nextInt(max - min + 1);
			int length = min + generator.nextInt(max - min + 1);
			Rectangle person = new Rectangle(length, width);
			rec.add(person);
		}

		for (int j=rec.size()-1; j>=0; j--) {
			Rectangle oneBox= rec.get(j);
			System.out.println(oneBox.getArea());
		}
		System.out.println("      ");
		
		Rectangle num= rec.remove(rec.size()-1);
		rec.set(0, num);
		
		for (int j=rec.size()-1; j>=0; j--) {
			Rectangle temp= rec.get(j);
			System.out.println(temp.getArea());
		}
		System.out.println("      ");
////////////////////////////////////////////////////////////////////
	}
}
