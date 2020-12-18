package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class MainController {


	@FXML private Button BtnDisplayFee;
	@FXML private Button BtnExit;
	@FXML private TextField TxtFieldFee;
	@FXML private TextField TxtFieldAge;
	@FXML private RadioButton RdBtnNonMemeber;
	@FXML private RadioButton RdBtnMemeber;
	@FXML private ToggleGroup membertogglegroup;


	@FXML private void initialize(){
/*
		 membertogglegroup = new ToggleGroup();
		RdBtnNonMemeber.setToggleGroup(membertogglegroup);
		RdBtnMemeber.setToggleGroup(membertogglegroup);
*/
		//RdBtnMemeber.isSelected();
	 }

	public void calculate(){
		int age=0;
		boolean member = false;
		int fee=0;

		age = Integer.parseInt(TxtFieldAge.getText());


		if (membertogglegroup.getSelectedToggle().equals(RdBtnMemeber)){
			member = true;
		}
		else if (membertogglegroup.getSelectedToggle().equals(RdBtnNonMemeber)){
			member = false;
		}

		if(member==false){
			fee=20;
		}
		else if (member == true){
			if(age>=65){
				fee=5;
			}
			else{
				fee=10;
			}
		}

		TxtFieldFee.setText(Integer.toString(fee));

	}
	@FXML
	public void Exit (ActionEvent event) {
	    Stage stage = (Stage) BtnExit.getScene().getWindow();
	    stage.close();
	}

}
