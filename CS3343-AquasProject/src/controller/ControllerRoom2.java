package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerRoom2 {
	
	
public void changeSceneButtonPushed(ActionEvent event) throws IOException {
		
		Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room3.fxml"));
		Scene sceneX = new Scene(sceneParent);
		
		//this line gets the stage information

		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(sceneX);
		window.show();

	}


public void changeBackSceneButtonPushed(ActionEvent event) throws IOException {
	
	Parent sceneParent = FXMLLoader.load(getClass().getResource("/view/Room1.fxml"));
	Scene sceneX = new Scene(sceneParent);
	
	//this line gets the stage information

	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	window.setScene(sceneX);
	window.show();

}


}
