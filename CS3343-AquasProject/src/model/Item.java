package model;

/**
 * Item is a java class that represents each item in a room of the house
 * 
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProject
 * Spring 2021
 */
public class Item {

	private String itemName; //name of item represented as a string
	private String lockCode; //code of lock to match with item represented as a string
	private String itemRoomCode; //code of room to match with item represented as a string
	
	/**
	 * returns the name of the item
	 * @return string name of this item
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * sets the name of the item
	 * @param itemName set on this item (String)
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * returns the code of the lock that matches the item
	 * @return string matching lock code of this item
	 */
	public String getLockCode() {
		return lockCode;
	}
	
	/**
	 * sets the matching lock code of the item
	 * @param lockCode set on this item (String)
	 */
	public void setLockCode(String lockCode) {
		this.lockCode = lockCode;
	}
	
	/**
	 * returns the code of the room that matches the item
	 * @return string matching room code of this item
	 */
	public String getItemRoomCode() {
		return itemRoomCode;
	}
	
	/**
	 * sets the matching room code of the item
	 * @param itemRoomCode set on this item (String)
	 */
	public void setItemRoomCode(String itemRoomCode) {
		this.itemRoomCode = itemRoomCode;
	}
	
	/**
	 * constructor for the item object
	 * @param itemName
	 * @param lockCode
	 * @param itemRoomCode
	 */
	public Item(String itemName, String lockCode, String itemRoomCode) {
		this.itemName = itemName;
		this.lockCode = lockCode;
		this.itemRoomCode = itemRoomCode;
	}
	
	/**
	 * toString method that represents a item object
	 */
	public String toString() {
		return String.format("- %s: lockCode is %s | itemRoomCode is %s\n", itemName, lockCode, itemRoomCode);
	}
}
