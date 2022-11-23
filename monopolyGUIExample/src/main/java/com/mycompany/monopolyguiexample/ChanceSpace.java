/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 *
 * @author Caleb Cope
 */
public class ChanceSpace extends Space {
    ChanceSpace(int p) {
        super("Chance", p);
    }

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent) {
        endTurn.setDisable(false);
    }
}

