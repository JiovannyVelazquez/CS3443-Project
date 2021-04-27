package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.House;

public class MainController implements Initializable  {

	       
	@FXML private TextArea output;
	      private House sH = new House("Spooky House");
	
	@FXML
	public void handle(ActionEvent event) throws IOException {
		sH.loadRooms("Rooms.csv");
		sH.loadItems("Items.csv");
		
		
		String text = sH.toString().replace("[", "").replace("]", "");
		output.setText(text);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
