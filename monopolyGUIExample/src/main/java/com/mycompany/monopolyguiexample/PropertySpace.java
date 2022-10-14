/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.Scanner;
import javafx.scene.control.Button;

/**
 *
 * @author Caleb Cope
 */
public class PropertySpace extends Space {
    Property property;
    
    PropertySpace(Property prop) {
        super(prop.name, prop.position);
        this.property = prop;
    }

    //@Override
    void handleEvent(Player player, Button roll_button, Button move_button, Button yes, Button no) {
        //Scanner s = new Scanner(System.in);
        if (this.property.ownership == 4) {
            roll_button.setDisable(true);
            move_button.setDisable(true);
            yes.setDisable(false);
            no.setDisable(false);
        }
    }
}
