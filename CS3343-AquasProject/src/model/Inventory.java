package model;


import java.util.ArrayList;

/**
 * Inventory is a java class that represents the players inventory that holds items 
 *  
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProjecct
 * Spring 2021
 */
public class Inventory {
	private ArrayList<Item> inventory;
	//Returns true or false depending if item 
	//was accepted in the inventory (false if 
	//inventory is full)
	public boolean addItem(Item newItem) {
		boolean notfull = true;
		int invSize = inventory.size();
		//If inventory full then don't add item
		if(invSize == 2){
			notfull = false;
		}
		else {
			inventory.add(newItem);
		}
		return notfull;
	}
	//Returns true when item successfully removed
	public void removeItem(Item itemGiven) {
		inventory.remove(itemGiven);
	}
}
