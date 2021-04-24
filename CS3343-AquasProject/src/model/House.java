package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * House is a java class that represents the place that holds all of the rooms that contain items 
 *  
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProject
 * Spring 2021
 */
public class House {
	
	private String houseName; //name of the House object represented as a string
	private ArrayList<Room> room; //arraylist of room objects
	
	/**
	 * returns the name of the House
	 * @return String name of this House
	 */
	public String getHouseName() {
		return houseName;
	}
	
	/**
	 * sets the name of the House
	 * @param houseName
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	
	/**
	 * load rooms from .csv file
	 * @param fileName
	 * @throws IOException
	 */
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
	
	/**
	 * load items from .csv file
	 * @param fileName
	 * @throws IOException
	 */
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
	
	/**
	 * constructor for the House object
	 * @param houseName
	 */
	public House(String houseName) {
		this.houseName = houseName;
		room = new ArrayList<Room>();
	}
	
	/**
	 * toString method that represents a house object
	 */
	public String toString() {
		return String.format(room.toString().replace(",", "").replace("\n ", "\n"));
	}
	
}
