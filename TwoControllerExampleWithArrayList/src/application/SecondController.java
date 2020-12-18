package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SecondController {

    @FXML private Button _btnClose;
    @FXML private TextArea _textArea1;
    
    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    // Here we put code to show the database items in the text area. The database object is a field of the main controller.
    @FXML private void initialize() {
        Database db = MainController._db;     // Make it shorter to type

        String display = "";
        for (int index = 0; index < db.getSize(); index++) {
            display += db.getItem(index);
            display += "\n";     // Go to the next line
        }
        
        _textArea1.setText(display);
    }
    
    // Event handlers
    
    @FXML protected void handleCloseButton(ActionEvent event) {
        // Get a reference to the stage
        Stage stage = (Stage) _btnClose.getScene().getWindow();
        // Close the window
        stage.close();
    }

}
