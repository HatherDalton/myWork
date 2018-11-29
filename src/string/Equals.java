package string;
import java.util.Scanner;
public class Equals {  //indexOf

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		
		System.out.println("Write a sentance");
		String name= input.nextLine();
		System.out.println("The letter X first occurs at the index #"+ name.indexOf('x'));
	
//Length
		int i=1;
		for (i=1; i<=name.length(); i++) {
		System.out.println(name.charAt(i));}
	}

}
