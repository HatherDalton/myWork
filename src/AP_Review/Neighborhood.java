package AP_Review;

import java.util.ArrayList;

public class Neighborhood {

	ArrayList<FamilyClass> families = new ArrayList<FamilyClass>();

	public void add(FamilyClass newFamily) {
		families.add(newFamily);
	}

	public boolean isInNeighborhood(Person person) {
		boolean answer = false;
		// if(families== person)
		// answer= true;

		return answer;
	}

}
