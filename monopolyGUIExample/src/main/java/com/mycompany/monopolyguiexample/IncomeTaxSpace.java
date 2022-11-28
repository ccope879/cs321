/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 *
 * @author Caleb Cope
 */
public class IncomeTaxSpace extends Space {
    IncomeTaxSpace() {
        super("Income Tax", 4);
    }

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent, Text description, Space[] allspaces) {
        player.payMoney(200);
        endTurn.setDisable(false);
    }
}
