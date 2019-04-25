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
		for(int i=0; i< sets.size(); i++) {
		if (marbleCol== sets.get(i).getColor()) {
			x+=sets.get(i).getNum();
			sets.remove(i);
			}	
		}
		return x;
	}
}
