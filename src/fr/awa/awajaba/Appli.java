/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox boite = new VBox();
        TextField user = new TextField();
        Label upperText = new Label();
        
        
        Button btn = new Button();
        
        btn.setText("Balzalderac");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String textStr = user.getCharacters().toString();
                upperText.setText(textStr.toUpperCase());
               
            }
        });
        
        
        
        
        
        
        StackPane root = new StackPane();
        
        boite.getChildren().add(user);
        boite.getChildren().add(btn);
        boite.getChildren().add(upperText);
        
        
        
        Scene scene = new Scene(boite, 350, 400);
        primaryStage.setTitle("AWA-03");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
