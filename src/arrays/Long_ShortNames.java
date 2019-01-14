package arrays;

import java.util.Scanner;

public class Long_ShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people do you know");
		int people= input.nextInt();
		input.nextLine();
		String[] Names= new String [people];
		
		int i;
		int lName=10;
		int sName=6;
		String lon="Bob Smith";
		String small= "Savanah franklin";
		
		for (i=0; i<Names.length; i++) {
			System.out.println("What is the name of the person? (First Last)");
			Names[i]=input.nextLine();
			if(Names[i].length()> lName)
			lon = Names[i];
			if(Names[i].length()< sName)
			small = Names[i];
		}
		int range = lon.length()- small.length();
		System.out.println("Longest name= "+lon);
		System.out.println("Smallest name= "+small);
		System.out.println("Range= "+(range));
	}

}
