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
		return String.format("Room: %s | Code: %s\n" + "%s" + "\n", roomName, roomCode, itemList.toString().replace("[", "").replace("]", "").replace(",", "").replace("\n ", "\n"));
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
	
}
