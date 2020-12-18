package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {
    // The database, has package (omitted) visibility and is static so we can access it easily from SecondController.
    /*package*/ static Database _db = new Database();

    @FXML private TextField _text1;    // This field is linked with the GUI object with fx:id "_text1"

    // Initializes the controller class. This method is automatically called after the FXML file has been loaded.
    // You can put code here to initialize your model objects, for example load database (array list) from file.
    @FXML private void initialize() {
        _db.load();
    }

    // Event handlers

    @FXML protected void handleOKButton(ActionEvent event) {
        _text1.setText("Size of the database is " + _db.getSize());
    }

    // Click handler for Open Sesame button
    @FXML protected void handleOpenSesameButton(ActionEvent event) throws IOException {
    	
    	// Set the extra data to pass to the second controller
        _db.setStringInfo("*Info String*");

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
            return;
        }

        // Show the value returned from the other window's controller
        _text1.setText("Other ctrlr returned " + _db.getIntInfo());
    }
}
