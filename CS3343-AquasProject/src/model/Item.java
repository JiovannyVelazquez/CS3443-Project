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
	private String itemCode; //code to match with item represented as a string
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
	public String getItemCode() {
		return itemCode;
	}
	
	/**
	 * sets the matching item code of the item
	 * @param itemCode set on this item (String)
	 */
	public void setItemCode(String icode) {
		this.itemCode = icode;
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
	public Item(String itemName, String icode, String itemRoomCode) {
		this.itemName = itemName;
		this.itemCode = icode;
		this.itemRoomCode = itemRoomCode;
	}
	/**
	 * Defauly constructor for the item object
	 * @param itemName
	 * @param itemCode
	 * @param itemRoomCode
	 */
	public Item() {
		this.itemName = "DefaultNameItem";
		this.itemCode = "DefaultItemCode";
		this.itemRoomCode = "DefaultCodeRoom";
	}
	
	/**
	 * toString method that represents a item object
	 */
	public String toString() {
		return String.format("- %s: lockCode is %s | itemRoomCode is %s\n", itemName, itemCode, itemRoomCode);
	}
}
