package AfterSpringBreak;

import java.util.ArrayList;

public class MarbleCollection {

	private ArrayList<MarbleSet> sets;

	public MarbleCollection() {
		sets = new ArrayList<MarbleSet>();
	}

	public void addSet(MarbleSet theset) {
		sets.add(theset);
	}

	public int getTotalMarbles() {
		int sum = 0;
		for (int i = 0; i < sets.size(); i++) {
			sum += sets.get(i).getNum();
		}
		return sum;
	}

	public int removeColor(String marbleCol) {
		int x=0;
		for(int i=sets.size(); i<0; i--) {
		if (sets.get(i).getColor().equals(marbleCol)) {
			x+=sets.get(i).getNum();
			sets.remove(i);
			}	
		}
		return x;
	}
}
