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
public class GoSpace extends Space {
    GoSpace() {
        super("Go", 0);
    }

    @Override
    void handleEvent(int diceRoll, ArrayList<Player> all_players, Player player, Button roll_button, Button move_button, Button yes, Button no) {
        // player.playerMoney += 200;
    }
}
