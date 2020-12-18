package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {

	@FXML private TextField Txtfield1;
	@FXML private Button Btn1;
	@FXML private Button Btnsecondopen;
	@FXML private void Btn1Clicked(){
		Txtfield1.setText("Testing test one\n");
	}

	@FXML private void BtnsecondopenClicked(){
		Stage secondstage = new Stage();
		AnchorPane root;
		try {
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("Second.fxml"));

		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		secondstage.setScene(scene);
		secondstage.show();
		}
		 catch (IOException e) {
				e.printStackTrace();
			}
	}

}
