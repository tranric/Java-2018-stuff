package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

	@FXML private Button _btnCancel;
	@FXML private Button btnOK;
	 @FXML private void initialize(){
			btnOK.setOnAction(new OkHandler());
			_btnCancel.setOnAction(new CancelHandler());
			btnOK.setOnAction(new EventHandler<ActionEvent>(){
				 public void handle(ActionEvent e){
					 onOkClicked();
				 }
			});
			_btnCancel.setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent e){
					onCancelClicked();
				}
			});
		}
	 private void onOkClicked(){
		 System.out.println("Button ok was clicked");
	 }
	 private void onCancelClicked(){
		 System.out.println("Button cancel was clicked");
	 }

	 private class OkHandler implements EventHandler<ActionEvent>{
		 public void handle(ActionEvent e){
			 onOkClicked();
		 }
	 }
	 private class CancelHandler implements EventHandler<ActionEvent>{
		 public void handle(ActionEvent e){
			 onCancelClicked();
		 }
	 }

}
