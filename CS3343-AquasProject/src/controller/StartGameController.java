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
import javafx.stage.Stage;



public class StartGameController implements Initializable{

	/**
	 * when this method is called will changed the scene to scene2
	 * @throws IOException 
	 */
	
	public void changeSceneButtonPushed(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room1.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
