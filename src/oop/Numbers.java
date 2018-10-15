package oop;
//import statements at the top
public class Numbers {
	// instance field-data storage
	// constructor- methods for constructing the object
	//default constructor
	public Numbers()
	{}
	
	public void sayNumber(double num){
		System.out.println(num);
	}
		
	public void sayNumberPlus2 (double num) {
		double result= num + 2;
		System.out.println(result);
	}
	
	public void saySum(double num1, double num2) {
		double total= num1 + num2;
		System.out.println(total);
	}
	
	public double returnSquare (double base) {
		double answer= base * base;
		return answer;
	}
	
	public double returnArea (double length, double width){
		double answer = length * width;
		return answer;
	}
	public int returnRoundUp (double num){
		return (int)num+ 1;
		
	}
}




//public static void main (String[]args) {