package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SecondController {

    @FXML private Button _btnClose;

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    @FXML private void initialize() {
    }

    // Event handlers

    @FXML protected void handleCloseButton(ActionEvent event) {
        // Get a reference to the stage
        Stage stage = (Stage) _btnClose.getScene().getWindow();
        // Close this window
        stage.close();
    }

}
