package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    @FXML private TextField _text1;    // This field is linked with the GUI object with fx:id "text1"

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    // We often connect event handlers in this method but in this example we use the FXML OnAction tag.
    // You can put code here to initialize your model objects, for example load database (array list) from file.
    @FXML private void initialize() {
    }

    // Event handlers

    @FXML protected void handleOKButton(ActionEvent event) {
        _text1.setText("Java is cool");
    }

    // Click handler for Open Sesame button
    @FXML protected void handleOpenSesameButton(ActionEvent event) {
        // Open the second window (stage)
        try {
            AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Second.fxml"));
            Scene scene = new Scene(root,200,200);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.initModality(Modality.APPLICATION_MODAL);  // Use this to make the 2nd window modal (must close 2nd window to return to main window)
            secondStage.showAndWait();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
