package Organizer;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	private String name;
	// Each person will have the name of an entree as the key
	// And the values will be details of the order
	private HashMap<String, String> entrees;
	private String drink;
	
	Person(String name){
		setName(name);
		setEntree("No entree", "");
		setDrink("Water");
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEntree(String dishName, String details) {
		// If the entree does not exist in the HashMap, add a new entry
		if(!entrees.containsKey(dishName)) {
			this.entrees.put(dishName, details);
		}
		else { // Otherwise update the details portion of the entry
			this.entrees.replace(dishName, details);
		}
	}
	
	public void setDrink(String drink) {
		this.drink = drink;
	}
	
}
