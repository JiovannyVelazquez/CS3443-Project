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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ControllerRoom1 implements Initializable{
	
	@FXML private ChoiceBox choiceBox;
	@FXML private Label choiceBoxLabel;
	@FXML private TextArea golfTextArea;
	@FXML private ListView listView;
	
   public void choiceBoxbuttonPushed() {
		
		//choiceBoxLabel.setText("My move is: \n"+ choiceBox.getValue().toString());
		
		if(choiceBox.getValue().toString().equalsIgnoreCase("cry")) {
			
			choiceBoxLabel.setText("cry only will take time \n that you need to scape.");
		}
		else if(choiceBox.getValue().toString().equalsIgnoreCase("Shout out for help")) {
			
			choiceBoxLabel.setText("bad idea! the kidnappers \n migth be around.");
		}
		else if(choiceBox.getValue().toString().equalsIgnoreCase("pray")) {
			
			choiceBoxLabel.setText("you migth be a religious\n person but you need to\n do something now.");
		}
		
		else if(choiceBox.getValue().toString().equalsIgnoreCase("do nothing")) {
			
			choiceBoxLabel.setText("you migth be dead\n by midnigth. ");
		}
		else if(choiceBox.getValue().toString().equalsIgnoreCase("look for something to untie yourself")) {
			
			choiceBoxLabel.setText("good..\n you just untied yourself\n "
					+ "now find a way to open\n the door."
					+ "to open the door\n you"
					+ "will need to craft a\n "
					+ "shiv by mixing items");
		}
		
	}
	
   /**
	  * this method copy all strings from Listview to Areatext field.
	  */
	
	
	public void listViewButtonPushed() {
		
		String textAreaString = "";
		
		ObservableList listOfItems = listView.getSelectionModel().getSelectedItems();
		
		for(Object item: listOfItems) 
		{
			textAreaString += String.format("%s%n", (String) item);
		}
		
		this.golfTextArea.setText(textAreaString);
		
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
	
	
	
	
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		choiceBoxLabel.setText(" ");
		choiceBox.setValue("Whats your move?");
		choiceBox.getItems().add("Shout out for help");
		choiceBox.getItems().add("Cry");
		choiceBox.getItems().add("Pray");
		choiceBox.getItems().addAll("look for something to untie yourself","do nothing");
		
		
		
		//listview items confg
		listView.getItems().addAll("Blade","Baseball","Shovel","Book","Canister","Binding");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		
		
		
	}

}
