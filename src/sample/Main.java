package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/sample/Main.fxml"));
            Scene scene = new Scene (root, 640,400);

            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
            primaryStage.setTitle("Калькулятор");
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("1.png")));

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        launch(args);

    }
}


