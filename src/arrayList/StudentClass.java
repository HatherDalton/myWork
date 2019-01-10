package arrayList;

public class StudentClass {

	private String name;
	private int score;
	
	public StudentClass(){
		
	}
	
	public StudentClass(String xName, int xScore) {
		name= xName;
		score=xScore;
	}
	
	public int returnScore() {
		return score;
	}
	
	public String returnName() {
		return name;
	}
////////////////////////////////////////////////////////////////////
}
