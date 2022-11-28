/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.Random;
import java.util.ArrayList;
import javafx.scene.control.Button;
//import javafx.scene.control.Button;

/**
 *
 * @author Caleb Cope
 */
public class CommunityChestSpace extends Space {
    CommunityChestSpace(int p) {
        super("Community Chest", p);
    }
    
    @Override
    void handleEvent(int diceRoll, ArrayList<Player> allPlayers, Player player, 
            Button rollButton, Button moveButton, Button yes, Button no, 
            Button endTurn, Button viewEvent) {
        endTurn.setDisable(false);
        
        Random rand = new Random();
        int randomInt = rand.nextInt(15);
     
        switch (randomInt) {
                //Collect 10
                case 0: player.payMoney(-10);
                break;
                //Collect 25
                case 1: player.payMoney(-25);
                break;
                //Collect 25
                case 2: player.payMoney(-25);
                break;
                //Collect 50
                case 3: player.payMoney(-50);
                break;
                //Collect 75
                case 4: player.payMoney(-75);
                break;
                //Collect 100
                case 5: player.payMoney(-100);
                break;
                //Collect 100
                case 6: player.payMoney(-100);
                break;
                //Collect 200
                case 7: player.payMoney(-200);
                break;
                //Collect 250
                case 8: player.payMoney(-250);
                break;
                //Pay 150
                case 9: player.payMoney(150);
                break;
                //Pay 100
                case 10: player.payMoney(100);
                break;
                //Pay 50
                case 11: player.payMoney(50);
                break;
                //Advance to GO
                case 12: player.playerPosition(40 - player.position);
                break;
                //Go to jail
                case 13: player.position = 40;
                break;
                //Get out of jail
                case 14:
                break;
        }
    }
}
