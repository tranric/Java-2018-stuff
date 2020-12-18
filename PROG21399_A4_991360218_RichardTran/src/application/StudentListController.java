package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class StudentListController {
	@FXML private Button BtnClose;
	@FXML private TextArea TextAreaList;

	 @FXML private void initialize() {
	        Database db = StudentController.db;     // Make it shorter to type

	        String display = "";
	        for (int index = 0; index < db.getSize(); index++) {
	            display += db.getItem(index);
	            display += "\n";     // Go to the next line
	        }

	        TextAreaList.setText(display);
	    }

	    @FXML protected void handleCloseButton(ActionEvent event) {
	        // Get a reference to the stage
	        Stage stage = (Stage) BtnClose.getScene().getWindow();
	        // Close the window
	        stage.close();
	    }
}
