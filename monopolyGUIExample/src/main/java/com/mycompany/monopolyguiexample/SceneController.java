/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author julio
 */
public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private TextField player1Name;
    @FXML
    private TextField player2Name;
    @FXML
    private TextField player3Name;
    @FXML
    private TextField player4Name;
    
    
    
    
    public void switchToPlayerMenuScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/fxml/playerMenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    public void switchToGameScene(ActionEvent event) throws IOException{
        String p1Name = player1Name.getText();
        String p2Name = player2Name.getText();
        String p3Name = player3Name.getText();
        String p4Name = player4Name.getText();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Board.fxml"));
        root = loader.load();
        
        BoardController boardController = loader.getController();
        boardController.setNamePlayer1(p1Name);
        boardController.setNamePlayer2(p2Name);
        boardController.setNamePlayer3(p3Name);
        boardController.setNamePlayer4(p4Name);
        
        //root = FXMLLoader.load(getClass().getResource("Board.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
