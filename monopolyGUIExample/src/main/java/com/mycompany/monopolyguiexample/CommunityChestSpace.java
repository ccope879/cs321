/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.Random;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
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
            Button endTurn, Button viewEvent, Text description, Space[] allspaces) {
        endTurn.setDisable(false);
        
        Random rand = new Random();
        int randomInt = 0;
        //int randomInt = rand.nextInt(15);
        String message = "";
        
        switch (randomInt) {
                //Collect 10
                case 0: 
                    message = "You found a 10 dollar bill on the way to class. Nice!";
                    player.payMoney(-10);
                break;
                //Collect 25
                case 1: 
                    message = "Win a monthly charger blue giveaway! Gain $25.";
                    player.payMoney(-25);
                break;
                //Collect 25
                case 2: 
                    message = "Participate in a UAH survey. Gain $25.";
                    player.payMoney(-25);
                break;
                //Collect 50
                case 3: 
                    message = "Collect club dues. Gain $50.";
                    player.payMoney(-50);
                break;
                //Collect 75
                case 4: 
                    message = "Get paid for helping a teacher grade. Gain $75.";
                    player.payMoney(-75);
                break;
                //Collect 100
                case 5: 
                    message = "Help set up graduation. Get paid $100.";
                    player.payMoney(-100);
                break;
                //Collect 100
                case 6: 
                    message = "Earn a scholarship cor college. Gain $100.";
                    player.payMoney(-100);
                break;
                //Collect 200
                case 7: 
                    message = "Get a student refund. Gain $200.";
                    player.payMoney(-200);
                break;
                //Collect 250
                case 8: 
                    message = "A graduation present! Gain $250";
                    player.payMoney(-250);
                break;
                //Pay 150
                case 9:
                    message = "Pay for books and fees. Pay $150.";
                    player.payMoney(150);
                break;
                //Pay 100
                case 10: 
                    message = "You got a parking ticket! Pay $100.";
                    player.payMoney(100);
                break;
                //Pay 50
                case 11: 
                    message = "You need a tutor. Pay $50.";
                    player.payMoney(50);
                break;
                //Advance to GO
                case 12: 
                    message = "You advance to go! Collect 200.";
                    player.playerPosition(40 - player.position);
                break;
                //Go to jail
                case 13:
                    message = "GO TO JAIL! Don't pass go, don't collect 200.";
                    player.position = 40;
                break;
                //Get out of jail
                case 14:
                    message = "GET OUT OF JAIL FREE! Use this to leave jail.";
                    //raise GOOJF tally +1
                break;  
                
        }
        spawnPopUp(message, description, diceRoll, allPlayers, player, allspaces);
    }
    
    @Override
    void spawnPopUp(String message, Text popupDescription, int diceRoll, ArrayList<Player> allPlayers, Player currentPlayer, Space[] allSpaces) {
        popupDescription.setText(message);
    }
}
