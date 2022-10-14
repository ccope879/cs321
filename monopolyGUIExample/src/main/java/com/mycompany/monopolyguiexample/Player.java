/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import static javafx.scene.shape.StrokeType.INSIDE;
import javafx.stage.Stage;

/**
 *
 * @author Caleb Cope
 */
public class Player {
    int diceroll;
    int position = 0;
    int playerMoney;
    boolean is_up = false;
    String name;
    ArrayList<Property> propertiesOwned = new ArrayList<Property>();

    //@FXML
    Circle player_token = new Circle();
    
    Player(String n, double x, double y, Paint color) throws IOException {
        playerMoney = 1500;
        this.name = n;

        player_token.setLayoutX(x);
        player_token.setLayoutY(y);
        player_token.setStroke(Color.BLACK);
        player_token.setRadius(8);
        player_token.setFill(color);
        player_token.setStrokeType(INSIDE);
        //App.root.add(player_token);
        //App.scene.root.add(player_token);
        //Parent root = FXMLLoader.load(getClass().getResource("Board.fxml"));
        //App.root.getChildren().add(player_token);
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("Board.fxml"));
        AnchorPane root = loader.load();
        root.getChildren().add(player_token);
        Stage stage;
        Scene scene;
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/
        
        //player_token = BoardController.p1_token;
    }
    
    void playerSayHello() {
        System.out.println("Hi I am " + name);
    }

    void rollTheDice() {
        
    }

    void playerPosition(int diceRoll) {
        position += diceRoll;
    }
}
