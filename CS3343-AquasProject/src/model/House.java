package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class House {
	
	private String houseName;
	private ArrayList<Room> room;
	
	public String getHouseName() {
		return houseName;
	}
	
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	
	public void loadRooms(String fileName) throws IOException {
		String line = null;
		String roomName = "";
		String roomCode = "";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			String[] temp = line.split(",");
		    roomName = temp[0];
		    roomCode = temp[1];
		    room.add(new Room(roomName, roomCode)); 
		}
		bufferedReader.close();
	}
	
	public void loadItems(String fileName) throws IOException {
		String line = null;
		String itemName = "";
		String lockCode = "";
		String itemRoomCode = "";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			String[] temp = line.split(",");
		    itemName = temp[0];
		    lockCode = temp[1];
		    itemRoomCode = temp[2];
		    Item item = new Item(itemName, lockCode, itemRoomCode); 
		    
		    int count = 0;
		    while (room.size() > count) { 
		    	String curRoom = room.get(count).getRoomCode();
		    	
		    	if (curRoom.equals(itemRoomCode)) { 
		    		(room.get(count)).addItem(item); 
		    	}
		    	count++;
		    }
		}
		bufferedReader.close();
	}
	
	public House(String houseName) {
		this.houseName = houseName;
		room = new ArrayList<Room>();
	}
	
	public String toString() {
		return String.format(room.toString().replace(",", "").replace("\n ", "\n"));
	}
	
	public void clearArrayList() {
		
		int count = 0; 
		while (room.size() > count) {
			room.clear();
		}
		}
}
