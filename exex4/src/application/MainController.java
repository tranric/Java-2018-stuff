package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

	@FXML private Button btnStart;
	@FXML private Button btnClear;
	@FXML private TextArea txtArea;
	@FXML private Button btnParse;
	@FXML private TextField txtuserinput;
	@FXML private void initialize(){
		btnStart.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				 onStartClicked();
			 }
		});
		btnClear.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				 onClearClicked();
			 }
		});
		/*
		btnParse.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				 onParseClicked();
			 }
		});
		*/

	}

	private void onStartClicked(){
		txtArea.setText("Test String");
	}
	private void onClearClicked(){
		txtArea.clear();
	}

	@FXML private void onParseClicked(){
		//Declarations & initializations

		int userinput = Integer.parseInt(txtArea.getText());
		userinput++; //increment the user input by one
		txtuserinput.setText(String.valueOf(userinput));

	}

}
