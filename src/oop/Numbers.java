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
}



//public static void main (String[]args) {