/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class GoToJailSpace extends Space {
    GoToJailSpace() {
        super("Go To Jail", 30);
    }

    @Override
    void handleEvent(Player player) {
        player.position = 40;
    }
}
