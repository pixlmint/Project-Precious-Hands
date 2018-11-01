/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idpa.project_precious_hands.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author chris
 */
public class Starter extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Image icon = new Image("resources/Precious_Logo.png");
        System.out.println(""+icon.toString());
        Parent root = FXMLLoader.load(getClass().getResource("View/Login.fxml"));

        Scene scene = new Scene(root);
        
        stage.setTitle("Precious Hands");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
