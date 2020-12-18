package application;

import java.io.IOException;
//import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StudentController {

	@FXML private TextField TextFieldName;
	@FXML private TextField txtFieldAddress;
	@FXML private TextField TxtFieldGPA;
	@FXML private Button BtnAdd;
	@FXML private Button BtnSort;
	public static Database db = new Database();


	    @FXML private void initialize() {
	        db.load();
	    }
	    @FXML protected void BtnDisplayOnAction(ActionEvent event)throws IOException{

		        try {
		            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("StudentList.fxml"));
		            Scene scene = new Scene(root,400,400);
		            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		            Stage secondStage = new Stage();
		            secondStage.setScene(scene);

		         // Use this to make the 2nd window modal (must close 2nd window to return to main window)
		            secondStage.initModality(Modality.APPLICATION_MODAL);

		            secondStage.showAndWait();
		        } catch(Exception e) {
		            e.printStackTrace();
		        }

	  }

	   public void BtnSortOnAction(){
		   db.SortList();
	   }

	public void BtnAddOnAction(){
		String Name="";
		String Address="";
		String GPA="";
		Name = TextFieldName.getText();
		Address = txtFieldAddress.getText();
		GPA = TxtFieldGPA.getText();
		db.AddStudent(Name, Address, GPA);

		TextFieldName.clear();
		txtFieldAddress.clear();
		TxtFieldGPA.clear();


	}




}
