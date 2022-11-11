package com.mycompany.monopolyguiexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * JavaFX App
 */
public class App extends Application {
    public static Scene scene;
    
    public void initialize()
    {
        Parent root = null;
        FXMLLoader loader;
        try {
            loader = new FXMLLoader(getClass().getClassLoader().getResource("Board.fxml"));
            root = loader.load();
            Controller.setMainControllerLoader(loader);
        } catch (IOException e) {
            // Failed to load fxml
        }
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        
        AnchorPane root = FXMLLoader.load(getClass().getResource("Board.fxml"));
        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        

    static void setRoot(String fxml) throws IOException {
        //scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    public static void main(String[] args) {
        launch();
    }
}
