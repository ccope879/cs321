package com.mycompany.monopolyguiexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;
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

   /* public static Scene scene;
    AnchorPane root = FXMLLoader.load(getClass().getResource("Board.fxml"));
    //String resource = "Board.fxml";
    //FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("Board.fxml"));
    //static AnchorPane root = loader.load();

    public App() throws IOException {
    }
    */
    @Override
    public void start(Stage stage) throws IOException {
        /*Rectangle rect = new Rectangle();  // import the built rectangle class for Javafx app..
                                                                         // Set height, Width and X and Y axis.
        rect.setX(200);
        rect.setY(200);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setStroke(Color.BLACK);
        rect.setFill(Color.GREEN);

        root.getChildren().add(rect);*/
        // Creates parent root for initial launch of application
        Parent root;
        root = FXMLLoader.load(getClass().getResource("/fxml/startScreen.fxml"));     
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        

    static void setRoot(String fxml) throws IOException {
        //scene.setRoot(loadFXML(fxml));
    }

    //private static Parent loadFXML(String fxml) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        //return fxmlLoader.load();
    //}
    
    public static void main(String[] args) {
        launch();
    }
    
    /*public AnchorPane getRoot() {
        return root;
    }*/
/*
    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}