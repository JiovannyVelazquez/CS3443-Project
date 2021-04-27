package model;

import java.util.ArrayList;

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
