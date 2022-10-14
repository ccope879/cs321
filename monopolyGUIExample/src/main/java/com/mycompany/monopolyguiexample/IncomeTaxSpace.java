/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class IncomeTaxSpace extends Space {
    IncomeTaxSpace() {
        super("Income Tax", 4);
    }

    @Override
    void handleEvent(Player player) {
        player.playerMoney -= 200;
    }
}
