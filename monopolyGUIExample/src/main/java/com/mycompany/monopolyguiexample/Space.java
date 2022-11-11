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
public class Space {
    String name;
    int position;

    Space(String n, int p) {
        this.name = n;
        this.position = p;
    }

    void handleEvent(int diceRoll, ArrayList<Player> all_players, Player player, Button roll_button, Button move_button, Button yes, Button no) {

    }
}
