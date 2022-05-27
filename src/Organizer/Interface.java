package Organizer;

import java.util.HashSet;
import java.util.Scanner;

public class Interface {
	
	// HashList of Persons
	HashSet<Person> party = new HashSet();
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("How many people total? ");
		int numPeople = myScanner.nextInt();
		
		System.out.println("There are " + numPeople+ " members in your party");
		
		// Fill the HashSet with Names
		// Test Commit
		
		
		
	}

}
