package arrayList;

import oop.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class HW_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Rectangle> rec = new ArrayList<Rectangle>();
		Random generator = new Random();

		int min = 1;
		int max = 50;

		for (int i = 20; i > 0; i--) {
			int width = min + generator.nextInt(max - min + 1);
			int length = min + generator.nextInt(max - min + 1);
			Rectangle fill = new Rectangle(length, width);
			rec.add(fill);
		}

		double areaL = 0;
		double areaS = 100;
		Rectangle rememberL= rec.get(0);;
		Rectangle rememberS = rec.get(0);

		for (int i = 0; i < rec.size(); i++) {
			Rectangle area = rec.get(i);
			if (area.getArea() > areaL) {
				areaL = area.getArea();
				rememberL= rec.get(i);
			}
			if (area.getArea() < areaS) {
				areaS = area.getArea();
				rememberS= rec.get(i);
			}
			System.out.println("Area #" + (i+1) + "= " + area.getArea());
		}
 
		rec.remove(rememberS);
		rec.add(19,rememberS);
		rec.remove(rememberL);
		rec.add(0,rememberL);
		
		System.out.println("    ");
		System.out.println("Largest Area = " + areaL);
		System.out.println("Smallest Area = " + areaS);
		System.out.println("    ");
		
		for (int i = 0; i < rec.size(); i++) {
			Rectangle area = rec.get(i);
			System.out.println("Area #" + (i+1) + "= " + area.getArea());
		}
////////////////////////////////////////////////////////////////////
	}
}
