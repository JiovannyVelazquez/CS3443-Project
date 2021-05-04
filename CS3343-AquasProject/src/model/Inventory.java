package model;


import java.util.ArrayList;


/**
 * Inventory is a java class that represents the players inventory that holds items 
 *  
 * @author Conagher Spaugh (pqj572), Jiovanny (rhv754)
 * UTSA CS 3443.002 - TeamProjecct
 * Spring 2021
 */
public class Inventory {
	private ArrayList<Item> inventory;
	
	//Default COnstructor
	public Inventory()
	{
		inventory = new ArrayList<Item>();
	}
	
	
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
	
	/**
	 * dropItem method for removing items from a room
	 * @param item
	 */
	public void dropItem(Item item) {
		inventory.remove(item);
	}
	//Author: Jiovanny (rhv754)
	//Returns true when item successfully removed
	public Item selectItem(String itemName) {
		Item selectedItem = new Item();
		Item curItem;
		//Loop goes through itemList and finds the item
		//with the same name as the one passed in
		for(int i = 0; i < inventory.size(); i++)
		{
			//current item in the array
			 curItem = inventory.get(i);
			//If item name found
			if((curItem.getItemName()).equals(itemName))
			{
				selectedItem = curItem;
			}
		}
		//RemovesItemFrom Inventory
		inventory.remove(selectedItem);
		//returns the item object after name was found
		return selectedItem;
		
	}
	//The holly to string
	public String toString() {
		String inventoryText = "";
		for(int i = 0; i < inventory.size(); i++) {
			inventoryText = inventoryText + (inventory.get(i)).getItemName() + "\n";
		}
		return inventoryText;
	}
}
