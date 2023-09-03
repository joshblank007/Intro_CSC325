module edu.farmingdale.intro_csc325 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.intro_csc325 to javafx.fxml;
    exports edu.farmingdale.intro_csc325;
}