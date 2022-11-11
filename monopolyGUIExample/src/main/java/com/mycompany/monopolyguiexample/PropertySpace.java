/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;
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

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> all_players, Player player, Button roll_button, Button move_button, Button yes, Button no) {
        //Scanner s = new Scanner(System.in);
        if (this.property.ownership == 4) {
            roll_button.setDisable(true);
            move_button.setDisable(true);
            yes.setDisable(false);
            no.setDisable(false);
        }
        else if (this.property.ownership != player.id) {
            int rent = this.property.calculateRent(all_players.get(this.property.ownership), diceRoll);
            
            // current player pays rent
            player.payMoney(rent);

            // owner gets rent
            if (player.playerMoney >= rent) {
                all_players.get(this.property.ownership).playerMoney += rent;
            }
            else {
                all_players.get(this.property.ownership).playerMoney += player.playerMoney;
            }
        }
    }
}
