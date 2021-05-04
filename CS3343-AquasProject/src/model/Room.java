package model;

import java.util.ArrayList;

/**
 * Room is a java class that represents each room within House
 * 
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProject
 * Spring 2021
 */
public class Room {
	
	private String roomName; //name of the room represented as a string
	private String roomCode; //code of the room represented as a string
	private ArrayList<Item> itemList; //arraylist of item objects
	//Used to hide the key until proper combine is executed
	private Item roomKey;
	
	/**
	 * returns the name of the room
	 * @return string name of this room
	 */
	public String getRoomName() {
		return roomName;
	}
	
	/**
	 * sets the name of the room
	 * @param roomName set on this room (String)
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	/**
	 * returns the code of the room
	 * @return string code of this room
	 */
	public String getRoomCode() {
		return roomCode;
	}
	
	/**
	 * sets the code of the room
	 * @param roomCode set on this room (String)
	 */
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	
	/**
	 * constructor for the room object
	 * @param roomName
	 * @param roomCode
	 */
	public Room(String roomName, String roomCode) {
		this.roomName = roomName;
		this.roomCode = roomCode;
		itemList = new ArrayList<Item>();
	}
	/**
	 * constructor for the room object with no parameters
	 * @param roomName
	 * @param roomCode
	 */
	public Room() {
		this.roomName = "DefaultNameRoom";
		this.roomCode = "DefaultNameCode";
		itemList = new ArrayList<Item>();
	}
	
	/**
	 * toString method that represents a room object
	 */
	public String toString() {
		String roomText = "";
		for(int i = 0; i < itemList.size(); i++) {
			roomText = roomText + (itemList.get(i)).getItemName()+ "\n";
		}
		return roomText;
	}
	
	/**
	 * addItem method for adding items to a room
	 * @param item
	 */
	public void addItem(Item item) {
		itemList.add(item);
	}
	/**
	 * dropItem method for removing items from a room
	 * @param item
	 */
	public void dropItem(Item item) {
		itemList.remove(item);
	}
	
	//Author: Jiovanny (rhv754)
	//This function will return item selected
	public Item selectItem(String name) {
		Item selectedItem = new Item();
		Item curItem;
		//Loop goes through itemList and finds the item
		//with the same name as the one passed in
		for(int i = 0; i < itemList.size(); i++)
		{
			//current item in the array
			 curItem = itemList.get(i);
			//If item name found
			if((curItem.getItemName()).equals(name))
			{
				selectedItem = curItem;
			}
		}
		//returns the item object after name was found
		return selectedItem;
	}
	//Author: Jiovanny (rhv754)
	//This method will be called by the loadItems in house
	//to ensure the key is not yet available to players
	public void createKey(Item item) {
		roomKey = item;
	}
	//Author: Jiovanny (rhv754)
	//This method adds the key to the room after
	//designated combine takes place
	public void addKeyToRoom() {
		itemList.add(roomKey);
		
	}
	
	//Author: Jiovanny (rhv754)
	//Used to check if door is out of locks to then end game
	public boolean empty() {
		boolean empty = false;
		
		System.out.println("Size of list: " + itemList.size());
		if(itemList.size()==0) {
			empty = true;
		}
		return empty;
	}
	
	/**
	 * dropItem method for removing items from a room
	 * @param item
	 */
	public void dropLock(String itemName) {
		Item selectedItem = new Item();
		Item curItem;
		String lockName = "";
		if(itemName.equals("key1")) {
			lockName = "lock1";
		}
		if(itemName.equals("key2")) {
			lockName = "lock2";
		}
		if(itemName.equals("key3")) {
			lockName = "lock3";
		}
		if(itemName.equals("key4")) {
			lockName = "lock4";
		}
		
		//Loop goes through itemList and finds the item
		//with the same name as the one passed in
		for(int i = 0; i < itemList.size(); i++)
		{
			//current item in the array
			 curItem = itemList.get(i);
			//If item name found
			if((curItem.getItemName()).equals(lockName))
			{
				selectedItem = curItem;
			}
		}
		
		itemList.remove(selectedItem);
	}
}
