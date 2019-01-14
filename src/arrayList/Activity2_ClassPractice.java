package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import oop.Friend;


public class Activity2_ClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend>buddy= new ArrayList<Friend>();
		Friend person= new Friend("Jacki Jone", 93);
		buddy.add(person);
		Friend person1= new Friend("John Smith", 45);
		buddy.add(person1);
		
		for (int i=0; i<=1; i++) {
			System.out.println("Enter a name");
			String names= input.nextLine();
			//System.out.println("Enter a age");
			//int xAge= input.nextInt();
			Friend person2= new Friend(names, 0);
			buddy.add(person2);
		}
		
		for (int i=0; i<buddy.size(); i++) {
		System.out.println(buddy.get(i).getName());
		}
		System.out.println("   ");
		
		Friend move= buddy.remove(0);
		buddy.add(3, move);
		move= buddy.remove(buddy.size());
		
		
		for (int i=0; i<buddy.size(); i++) {
			System.out.println(buddy.get(i).getName());
			}
		
////////////////////////////////////////////////////////////////////
	}
}
