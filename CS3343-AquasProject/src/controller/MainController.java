package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
public class MainController {

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
	
	private static int roomNum;
	
	private static House sH = new House("Spooky House");
	
	private static Inventory inventory = new Inventory();
	
	
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
	
	/** benny helped make this
	 * when this method is called will changed the room2
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
	
	/** benny helped make this
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
	/** benny helped make this
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
	/** benny helped make this
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
	/** benny helped make this
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
	
	
	//currently just gets input from btoh input boxes then adds
	//the strings together. GOTTA IMPLEMENT REACTIONS
	public void combine(ActionEvent event) throws IOException{
		String input1 = item1Input.getText();
		String input2 = item2Input.getText();
		
		combOutput.setText(input1 + " ||| " + input2);
		
		//call the item reaction
		//check the objects code
	}
	
	//Calls the to string method and displays it in the inventory TextArea
	public void setInventory(ActionEvent event) throws IOException{
		
		inventoryText.setText(inventory.toString());
	}
	
	
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
	public void dropItem(ActionEvent event) throws IOException {
		//uncomment this and use it to start
		//String itemName = dropInput.getText();
		//Room roomGotten = sH.getRoomObject(roomNum);
	}
}
