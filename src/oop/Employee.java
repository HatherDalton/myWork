package oop;

public class Employee {
	// instance field-data storage
	// constructor- methods for constructing the object
	//default constructor
	private double wage;
	private int experience;
	public Employee() {
		wage = 7.5;
	}
	//getter
		public double getWage() {
			return wage;
		}
	//setter
		public void setWage (double newW) {
			wage= newW;
		}
		
		public double getExp() {
			return experience;
		}
		
		public void setExp(int newExp) {
			experience= newExp;
		}
		
}
