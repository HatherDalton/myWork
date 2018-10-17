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
	//Wage
		public double getWage() {
			return wage;
		}
	
		public void setWage (double newW) {
			wage= newW;
		}
	//Experience
		public double getExp() {
			return experience;
		}
		
		public void setExp(int newExp) {
			experience= newExp;
		}
	//Raise
		public void raise() {
			wage = wage * 1.1;
		}
		
}
