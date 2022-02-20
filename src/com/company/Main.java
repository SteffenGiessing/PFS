package com.company;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) {
        System.out.println("IntelliJ sees the javafx.scene.Scene package");
        Scene scene = new Scene(new Pane(), 300, 100); // Set window size
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}