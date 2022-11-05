package application;

import javafx.scene.control.Alert;

public class InvalidValueException extends Exception {
    public InvalidValueException(String e) {
        super(e);
        System.out.println(e);
        Alert a1 = new Alert(Alert.AlertType.INFORMATION);
        a1.setHeaderText(e);
        a1.showAndWait();
    }
}