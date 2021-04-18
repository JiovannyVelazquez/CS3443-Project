package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.House;

public class MainController {

	private House sH = new House("Spooky House");
	@FXML
	private TextArea output;
	
	@FXML
	public void handle(ActionEvent event) throws IOException {
		sH.loadRooms("data/Rooms.csv");
		sH.loadItems("data/Items.csv");
		
		
		String text = sH.toString().replace("[", "").replace("]", "");
		output.setText(text);
	}
}
