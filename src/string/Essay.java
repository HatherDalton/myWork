package string;

import java.util.Scanner;

public class Essay {
	Scanner input= new Scanner(System.in);
	private String name;
	private String essay;
	//private 
	
	public  Essay(){	}
	
	public void setName(String xName) {
		name= xName;
	}
	public void setEssay(String xEssay) {
		essay=xEssay;
	}
	public String CapLast() {
		String last= name.substring(name.indexOf(" ")+1);
		return last.toUpperCase();
	}
	public int countLetter() {
		int j= name.indexOf(" ");
		String first= name.substring(0,j);
		return first.length();
	}
	public boolean findLetter() {
		return name.toLowerCase().contains("x");
	}
	
	
	public int wordCount() {
		int words=1;
		for(int i=0;i< essay.length(); i++)
		if(essay.charAt(i)==' ') {
			words++;
		}
		return words;
	}
	
}
