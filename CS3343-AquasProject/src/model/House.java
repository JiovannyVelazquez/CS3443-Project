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
	private ArrayList<Room> roomArray; //arraylist of room objects
	
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
		    roomArray.add(new Room(roomName, roomCode)); 
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
		String itemCode = "";
		String itemRoomCode = "";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((line = bufferedReader.readLine()) != null) {
			String[] temp = line.split(",");
		    itemName = temp[0];
		    itemCode = temp[1];
		    itemRoomCode = temp[2];
		    Item item = new Item(itemName, itemCode, itemRoomCode); 
		    
		    int count = 0;
		    while (roomArray.size() > count) { 
		    	String curRoom = roomArray.get(count).getRoomCode();
		    	
		    	//Room curRoomObj = roomArray.get(count);
		    	//Hides the key for later to be unlocked via combine button
		    	if(((itemName.equals("key1")) && (itemRoomCode.equals(curRoom))) ||
		    			((itemName.equals("key2")) && (itemRoomCode.equals(curRoom))) ||
		    			((itemName.equals("key3")) && (itemRoomCode.equals(curRoom))) ||
		    			((itemName.equals("key4")) && (itemRoomCode.equals(curRoom)))) {
		    		(roomArray.get(count)).createKey(item);
		    		count = roomArray.size();
		    		
		    	}
		    	//adds everything to the room
		    	else if (curRoom.equals(itemRoomCode)) { 
		    		(roomArray.get(count)).addItem(item);
		    		count = roomArray.size();
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
		roomArray = new ArrayList<Room>();
	}
	
	/**
	 * toString method that represents a house object
	 */
	public String toString() {
		return String.format(roomArray.toString().replace(",", "").replace("\n ", "\n"));
	}
	
	
	//Returns the room we are currently on in
	//used by the drop button and pick up button(will list
	//which other ones will use it later if need be)
	public Room getRoomObject(int roomNum) {
		//Returns room object based on current room number
		return roomArray.get(roomNum-1);
	}
	//Adds the key to room based on the reaction done in combine
	public void addKeyToRoom(int roomNum) {
		
		(roomArray.get(roomNum-1)).addKeyToRoom();
	}
}
