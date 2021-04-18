package model;

public class Item {

	private String itemName;
	private String lockCode;
	private String itemRoomCode;
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getLockCode() {
		return lockCode;
	}
	
	public void setLockCode(String lockCode) {
		this.lockCode = lockCode;
	}
	
	public String getItemRoomCode() {
		return itemRoomCode;
	}
	
	public void setItemRoomCode(String itemRoomCode) {
		this.itemRoomCode = itemRoomCode;
	}
	
	public Item(String itemName, String lockCode, String itemRoomCode) {
		this.itemName = itemName;
		this.lockCode = lockCode;
		this.itemRoomCode = itemRoomCode;
	}
	
	public String toString() {
		return String.format("- %s: lockCode is %s | itemRoomCode is %s\n", itemName, lockCode, itemRoomCode);
	}
}
