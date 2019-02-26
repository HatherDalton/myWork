package comparableInterface;
import java.util.Random;
public class Array_Workers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker [] people= new Worker [100];
		Random generator=new Random();
		int min=0;
		int max= 100;
	
		for(int i=0; i<100; i++) {
			int thing= min + generator.nextInt(max-min+1);
			double other= min + generator.nextInt(max-min+1);
			people[i]= new Worker(thing, other);
		}
	
		Worker smallest= people[0];
		for(int i=1; i<people.length; i++) {
			if (smallest.compareTo(people[i])<0){
				smallest= people[i];
			}
		}
		
		Worker largest= people[0];
		for (int i= 1; i<people.length; i++) {
			if (largest.compareTo(people[i])>0) {
				largest= people[i];
			}
		}
		System.out.println("Smallest");
		System.out.println("Rate=" +smallest.getRate());
		System.out.println("Hour=" +smallest.getHours());
		System.out.println("                ");
		System.out.println("Largest");
		System.out.println("Rate=" +largest.getRate());
		System.out.println("Hours=" +largest.getHours());
////////////////////////////////////////////////////////
	}
}
