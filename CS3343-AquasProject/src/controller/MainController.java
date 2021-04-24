package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.House;

/**
 * MainController is a java class containing the method for when the user interacts with Main.fxml
 *  
 * @author Conagher Spaugh (pqj572), (insert other names here)
 * UTSA CS 3443.002 - TeamProject
 * Spring 2021
 */
public class MainController {

	private House sH = new House("Spooky House");
	@FXML
	private TextArea output;
	
	/**
	 * after the show button is pressed, handle will call the loadMovies and loadCast methods to populate the arraylist
	 * which will then be printed out in the output TextArea
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void handle(ActionEvent event) throws IOException {
		sH.loadRooms("data/Rooms.csv");
		sH.loadItems("data/Items.csv");
		
		
		String text = sH.toString().replace("[", "").replace("]", "");
		output.setText(text);
	}
}
