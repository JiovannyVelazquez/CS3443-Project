package model;

import java.util.ArrayList;

public class Room {
	
	private String roomName;
	private String roomCode;
	private ArrayList<Item> item;
	
	public String getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public String getRoomCode() {
		return roomCode;
	}
	
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	
	public Room(String roomName, String roomCode) {
		this.roomName = roomName;
		this.roomCode = roomCode;
		item = new ArrayList<Item>();
	}
	
	public String toString() {
		return String.format("Room: %s | Code: %s\n" + "%s" + "\n", roomName, roomCode, item.toString().replace("[", "").replace("]", "").replace(",", "").replace("\n ", "\n"));
	}
	
	public void addItem(Item key) {
		item.add(key);
	}
}
