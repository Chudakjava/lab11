package MyExceptions;

import javafx.scene.control.Alert;

public class MyException extends Exception {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    public MyException(){

        alert.setTitle("Ошибка");
        alert.setHeaderText("Деление на ноль")  ;
        alert.showAndWait();

    }

}
