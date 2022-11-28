/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.Random;
import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 *
 * @author Caleb Cope + Jacob Braden
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
        
        Random rand = new Random();
        int randomInt = rand.nextInt(15);
     
        switch (randomInt) {
                //Advance to Go
                case 0: player.playerPosition(40 - player.position);
                break;
                //go to Charger Union [space 39]
                case 1: player.playerPosition(39 - player.position);
                break;
                //go to Shelby Center [space 27]
                case 2: 
                    if (27 - player.position < 0)
                        player.payMoney(-200);
                    player.playerPosition(27 - player.position);
                break;
                //go to Morton Hall [space 11]
                case 3:
                    if (11 - player.position < 0)
                        player.payMoney(-200);
                    player.playerPosition(11 - player.position);
                break;
                //go to Nearest Coffee Shop {space 12 or 28]
                case 4: 
                    if (player.position > 12 && player.position < 28) {
                        player.playerPosition(28 - player.position);
                    }
                    else {
                        if (12 - player.position < 0)
                            player.payMoney(-200);
                        player.playerPosition(12 - player.position);
                    }
                break;
                //go to Nearest Parking Spot [space 5, 15, 25, 35]
                case 5:
                    if (player.position > 5 && player.position < 15) {
                        player.playerPosition(15 - player.position);
                    }
                    else if (player.position > 15 && player.position < 25) {
                        player.playerPosition(25 - player.position);
                    }
                    else if (player.position > 25 && player.position < 35) {
                        player.playerPosition(35 - player.position);
                    }
                    else {
                        if (5 - player.position < 0)
                            player.payMoney(-200);
                        player.playerPosition(5 - player.position);
                    }
                break;
                //go to Nearest Parking Spot [space 5, 15, 25, 35]
                case 6:
                    //IN BETWEEN SPACES 5 AND 15
                    if (player.position > 5 && player.position < 15) {
                        player.playerPosition(15 - player.position);
                    }
                    //IN BETWEEN SPACES 15 AND 25
                    else if (player.position > 15 && player.position < 25) {
                        player.playerPosition(25 - player.position);
                    }
                    //IN BETWEEN SPACES 25 AND 35
                    else if (player.position > 25 && player.position < 35) {
                        player.playerPosition(35 - player.position);
                    }
                    //IN BETWEEN SPACES 35 AND 5
                    else {
                        if (5 - player.position < 0)
                            player.payMoney(-200);
                        player.playerPosition(5 - player.position);
                    }
                break;
                //go to Parking Deck [space 5]
                case 7:
                    if (5 - player.position < 0)
                        player.payMoney(-200);
                    player.playerPosition(5 - player.position);
                break;
                //pay 100
                case 8:
                    player.payMoney(100);
                break;
                //Pay 15
                case 9:
                   player.payMoney(15);
                break;
                //pay 50
                case 10:
                    player.payMoney(50);
                break;
                //get paid 50
                case 11:
                    player.payMoney(-50);
                break;
                //get 150
                case 12:
                    player.payMoney(-150);
                break;
                //go to jail
                case 13:
                    player.position = 40;
                break;
                //get out of jail free
                case 14:
                break;
                
        }
    }
}

