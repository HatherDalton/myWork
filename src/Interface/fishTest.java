package Interface;

import java.util.ArrayList;

public class fishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Fish> seafood= new ArrayList<Fish>();
		seafood.add(new Goldfish(45, 76,"purple"));
		seafood.add(new Trout(10,34,56));
		seafood.add(new Goldfish(57, 76,"red"));
		seafood.add(new Trout(100,3,56));
		seafood.add(new Goldfish(95, 76,"purple"));
		seafood.add(new Trout(23,34,56));
		
		double longest=0;
		int num=0;

		for(int i=0; i<seafood.size(); i++) {
			Fish type=(Fish) seafood;
			if(type.getLength()>longest) {
				longest= type.getLength();
				num=i;
			}
		}
		//seafood.indexof(num).toString();
	}
}
