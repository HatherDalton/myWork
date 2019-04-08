package Interface;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class shapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator=new Random();
		Scanner input = new Scanner(System.in);
		
		int min=1;
		int max=10;
		int random= min + generator.nextInt(max-min+1);

		Rectangle bob= new Rectangle(1,2);
		Circle fred= new Circle(1);
	
		ArrayList<shape> model= new ArrayList<shape>();
		model.add(bob);
		model.add(new Rectangle(3,4));
		model.add(new Rectangle(5,6));
		model.add(new Rectangle(7,8));
		model.add(fred);
		model.add(new Circle(2));
		model.add(new Circle(4));
	
//Sum of all the areas
		double sum=0;
		for(shape x: model) {
			sum+= x.area();
		}
		
//Smallest Perimeter
		double smallest=100;
		for(shape x: model) {
			if(x.perimeter()<smallest) {
				smallest= x.perimeter();
			}
		}
	}

}
