/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import javafx.fxml.FXMLLoader;

/**
 *
 * @author Caleb Cope
 */
public class Controller {
    private static MainController mainController;

    public static MainController getMainController() {
        return mainController;
    }

    public static void setMainController(MainController mainController) {
        Controller.mainController = mainController;
    }

    public static void setMainControllerLoader(FXMLLoader mainControllerLoader) {
        Controller.mainController = mainControllerLoader.getController();
    }
}
