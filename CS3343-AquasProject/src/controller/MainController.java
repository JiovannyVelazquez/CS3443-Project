package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.House;
import model.Room;
import model.Item;
import model.Inventory;


/**
 * MainController is a java class containing the method for when the user interacts with Main.fxml
 *  
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProject
 * Spring 2021
 */
public class MainController implements Initializable{

	@FXML
	private Button combineButton;
	@FXML
	private Button pickUpButton;
	@FXML
	private Button dropButton;
	@FXML
	private Button room1Button;
	@FXML
	private Button room2Button;
	@FXML
	private Button room3Button;
	@FXML
	private Button room4Button;
	@FXML
	private Button doorButton;
	@FXML
	private Button scapeButton;
	@FXML
	private Button lock1Button;
	@FXML
	private Button lock2Button;
	@FXML
	private Button lock3Button;
	@FXML
	private Button lock4Button;
	
	@FXML
	private Button inventoryButton;
	@FXML
	private Button gameStart;
	@FXML
	private TextField item1Input;
	@FXML
	private TextField item2Input;
	@FXML
	private TextField pickUpInput;
	@FXML
	private TextField dropInput;
	@FXML
	private TextArea combOutput;
	@FXML
	private TextArea inventoryText;
	@FXML
	private TextArea roomItemsText;
	
	
	private static int roomNum;
	
	private static House sH = new House("Spooky House");
	
	private static Inventory inventory = new Inventory();
	
	/**
	 *  @author ask634 bezaleel sainz
	 * @param event
	 * @throws IOException
	 */
	public void setUpGame(ActionEvent event) throws IOException {
		sH.loadRooms("data/Rooms.csv");
		sH.loadItems("data/Items.csv");
		
		//Changes Screen
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room1.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		
		//this line gets the stage information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 1;
	}
	/**
	 *   @author ask634 bezaleel sainz
	 * keyEvent method to Start Game , by pressing any key the game will start
	 */
	@FXML
	public void setUpGame2(KeyEvent event) throws IOException {
		sH.loadRooms("data/Rooms.csv");
		sH.loadItems("data/Items.csv");
		
		//Changes Screen
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room1.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		
		//this line gets the stage information
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 1;
	}
	
	/**  @author ask634 bezaleel sainz
	 * when this method is called will changed the room
	 * @throws IOException 
	 */
	public void goToRoom1(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room1.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		
		//sets current room number for other functions to know what room we are in
		roomNum = 1;
	}
	
	/**  @author ask634 bezaleel sainz
	 * when this method is called will changed the room2
	 * @throws IOException 
	 */
	public void goToRoom2(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room2.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 2;
	}
	/**  @author ask634 bezaleel sainz
	 * when this method is called will changed the room2
	 * @throws IOException 
	 */
	public void goToRoom3(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room3.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 3;
	}
	/**   @author ask634 bezaleel sainz
	 * when this method is called will changed the room2
	 * @throws IOException 
	 */
	public void goToRoom4(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room4.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 4;
	}
	/**  @author ask634 bezaleel sainz
	 * when this method is called will changed the room2
	 * @throws IOException 
	 */
	public void goToRoomDoor(ActionEvent event) throws IOException {

		
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Door.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();
		//sets current room number for other functions to know what room we are in
		roomNum = 5;
		
		
	}
	
	//Author: Jiovanny (rhv754)
	public void combine(ActionEvent event) throws IOException{
		//Gets input from textboxes
		String input1 = item1Input.getText();
		String input2 = item2Input.getText();
		
		//****************UNCOMMENT THIS LATER**********
		//converts input to item objects
		Item itemPicked1 = inventory.selectItem(input1);
		Item itemPicked2 = inventory.selectItem(input2);
		//here we are going to have to compare the code of each item
		System.out.println("Code of item1: "+itemPicked1.getItemRoomCode());
		System.out.println("Code of item1: "+itemPicked2.getItemRoomCode());
		
		if(itemPicked1.getItemCode().equals(itemPicked2.getItemCode())) {
			//will discover key for room1
			if(itemPicked1.getItemCode().equals("p1")) {
				sH.addKeyToRoom(1);
			}
			//will discover key for room1
			if(itemPicked1.getItemCode().equals("p2")) {
				sH.addKeyToRoom(2);
			}
			//will discover key for room1
			if(itemPicked1.getItemCode().equals("p3")) {
				sH.addKeyToRoom(3);
			}
			//will discover key for room1
			if(itemPicked1.getItemCode().equals("p4")) {
				sH.addKeyToRoom(4);
			}
			
			combOutput.setText(itemPicked1.getItemCode());
		}
		
	}
	
	//Author: Jiovanny (rhv754)
	//Calls the to string method and displays it in the inventory TextArea
	public void setInventory(ActionEvent event) throws IOException{
		//sets the inventory for player
		inventoryText.setText(inventory.toString());
		//sets the items for the room
		Room roomGotten = sH.getRoomObject(roomNum);
		roomItemsText.setText(roomGotten.toString());
	}
	//Author: Jiovanny (rhv754)
	//Calls the to string method and displays it in the inventory TextArea
	public void setInventoryInDoor(ActionEvent event) throws IOException{
		//sets the inventory for player
		inventoryText.setText(inventory.toString());
	}
	
	//Author: Jiovanny (rhv754)
	public void pickUpItem(ActionEvent event) throws IOException {
		String itemName = pickUpInput.getText();
		Room roomGotten = sH.getRoomObject(roomNum);
		
		//Gets the item object from the room
		Item itemPicked = roomGotten.selectItem(itemName);
		
		//testing print statement
		System.out.print("This the item name gotten: "+itemPicked.getItemName()+"\n");
		
		//Adds Item to inventory and removes it from the current room
		inventory.addItem(itemPicked);
		roomGotten.dropItem(itemPicked);
	}
	//Author: Jiovanny (rhv754)
	public void dropItem(ActionEvent event) throws IOException {
		//Gets the name and establishes what room we are currently in
		String itemName = dropInput.getText();
		Room roomGotten = sH.getRoomObject(roomNum);
		//Gets the item from inventory to be dropped
		Item itemDropping = inventory.selectItem(itemName);
		//testing print statement
		System.out.print("This the item name gotten: "+itemDropping.getItemName()+"\n");
		//Adds item to room
		roomGotten.addItem(itemDropping);
		//Removes item from inventory
		inventory.dropItem(itemDropping);
	}
	/**
	 * @author  bezaleel sainz (ask634)
	 * @param event
	 * @throws IOException
	 */
	
	public void scapeMethod(ActionEvent event) throws IOException {
		/**
		 * TODO needs update when player finally has the 4 keys,
		 *  scape-button will disable so the player can 
		 * pushed it to scape and get the final screen
		 * 
		 * 
		 * if ()user has 4 keys then {
		 */
		
		//Checking to see if all locks are gone to then switch scenes
		if(sH.getRoomObject(5).empty()) {
			//
			scapeButton.setDisable(false);

			Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/FinalScreen.fxml"));
			Scene sceneX = new Scene(sceneParent);
			
			//this line gets the stage information

			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(sceneX);
			window.show();
		}
		
	}
	//Author: Jiovanny (rhv754)
	public void remove1Lock(ActionEvent event) throws IOException {
		Item key = inventory.selectItem("key1");
		System.out.println(key.getItemName());
		(sH.getRoomObject(5)).dropLock(key.getItemName());
	}
	//Author: Jiovanny (rhv754)
	public void remove2Lock(ActionEvent event) throws IOException {
		Item key = inventory.selectItem("key2");
		System.out.println(key.getItemName());
		(sH.getRoomObject(5)).dropLock(key.getItemName());
	}
	//Author: Jiovanny (rhv754)
	public void remove3Lock(ActionEvent event) throws IOException {
		Item key = inventory.selectItem("key3");
		System.out.println(key.getItemName());
		(sH.getRoomObject(5)).dropLock(key.getItemName());
	}
	//Author: Jiovanny (rhv754)
	public void remove4Lock(ActionEvent event) throws IOException {
		Item key = inventory.selectItem("key4");
		System.out.println(key.getItemName());
		(sH.getRoomObject(5)).dropLock(key.getItemName());
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//set disable button until player gets the 4 keys
		scapeButton.setDisable(true);
	}
}
