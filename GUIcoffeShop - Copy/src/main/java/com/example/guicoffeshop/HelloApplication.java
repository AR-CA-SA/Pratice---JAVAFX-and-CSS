// JUAN SALAZAR 4/8/2024 - DTCC CSC 164
//4/9/2024 - MOST OF THE EVENTS AND FUNCTIONS IN THIS PROGRAM ARE A WORK IN PROGRESS, THIS IS NOT THE FINAL RESULT RATHER JUST A CONCEPT OF WHAT IT WILL LOOK LIKE ONCE EVERYTHING IS DONE


//4/10/2024 UPDATE - NOW THE PROGRAM USES LISTVIEWS INSTEAD OF LABELS TO DISPLAY DATA ON SCREEN



package com.example.guicoffeshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;




import java.io.IOException;
import java.util.ArrayList;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        Scene scene = new Scene(fxmlLoader.load(), 700, 700);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        // ^^ THIS LINE OF CODE CALLS THE CSS STYLESHEETS WHICH WILL LATER ALLOW TO CUSTOMIZE THE PROGRAM, THIS WAS NEEDED IN ORDER TO CUSTOMIZE LISTVIEW.
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}