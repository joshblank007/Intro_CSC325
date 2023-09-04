package edu.farmingdale.intro_csc325;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    //changed onHelloButtonClick
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Jashua Veerasammy!");
    }

}