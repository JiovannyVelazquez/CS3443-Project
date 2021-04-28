package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.House;

public class ControllerRoom1{
	
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
	private Button gameStart;
	
	@FXML
	private TextField item1Input;
	@FXML
	private TextField item2Input;
	@FXML
	private TextArea combOutput;
	
	private House sH = new House("Spooky House");
	
	
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
	}
	
	public void combine() {
		String input1 = item1Input.getText();
		String input2 = item2Input.getText();
		
		combOutput.setText(input1 + " ||| " + input2);
		
		//call the item reaction
		//check the objects code
	}
	
	
	/**
	 * when this method is called will changed the room2
	 * @throws IOException 
	 */
	public void changeSceneButtonPushed(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room2.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();

	}

}
