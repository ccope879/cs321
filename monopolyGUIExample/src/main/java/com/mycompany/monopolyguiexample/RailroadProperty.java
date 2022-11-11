/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class RailroadProperty extends Property {
    RailroadProperty(String n, int p) {
        super(n, p);
        this.cost = 200;
        int base_rent = 25;
    }
    
    @Override
    int calculateRent(Player owner, int diceRoll) {
        int rent = 0;
        switch (owner.railroadAmount) {
            case 1:
                rent = 25;
                break;
            case 2:
                rent = 50;
                break;
            case 3: 
                rent = 100;
                break;
            case 4:
                rent = 200;
                break;
        }
        return rent;
    }
}
