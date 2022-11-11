/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

/**
 *
 * @author Caleb Cope
 */
public class ColoredProperty extends Property {
    int house1_rent;
    int house2_rent;
    int house3_rent;
    int house4_rent;
    int hotel_rent;
    int building_level; // Refers to the amount of houses/hotels on the property
    int base_rent;

    // Include a list of the positions of all colored properties
    // Each row of the board is organized into a new line
    int[] colored_positions = new int[] { 1, 3, 6, 8, 9,
        11, 13, 14, 16, 18, 19,
        21, 23, 24, 26, 27, 29,
        31, 32, 34, 37, 39
    };

    // Include a list of the costs of all colored properties
    // Elements in the same positions are matched with each other
    int[] colored_costs = new int[] { 60, 60, 100, 100, 120,
        140, 140, 160, 180, 180, 200,
        220, 220, 240, 260, 260, 280,
        300, 300, 320, 350, 400 };

    // Include lists of all rents of all colored properties
    int[] colored_base_rents = new int[] { 2, 4, 6, 6, 8,
        10, 10, 12, 14, 14, 16,
        18, 18, 20, 22, 22, 24,
        26, 26, 28, 35, 50 };
    int[] colored_house1_rents = new int[] { 10, 20, 30, 30, 40,
        50, 50, 60, 70, 70, 80,
        90, 90, 100, 110, 110, 200,
        130, 130, 150, 175, 200 };
    int[] colored_house2_rents = new int[] { 30, 60, 90, 90, 100,
        150, 150, 180, 200, 200, 220,
        250, 250, 300, 330, 330, 360,
        390, 390, 450, 500, 600 };
    int[] colored_house3_rents = new int[] { 90, 180, 270, 270, 300,
        450, 450, 500, 550, 550, 600,
        700, 700, 750, 800, 800, 850,
        900, 900, 1000, 1100, 1400 };
    int[] colored_house4_rents = new int[] { 160, 320, 400, 400, 450,
        625, 625, 700, 750, 750, 800,
        875, 875, 925, 975, 975, 1025,
        1100, 1100, 1200, 1300, 1700 };
    int[] colored_hotel_rents = new int[] { 250, 450, 550, 550, 600,
        750, 750, 900, 950, 950, 1000,
        1050, 1050, 1100, 1150, 1150, 1200,
        1275, 1275, 1400, 1500, 2000 };

    ColoredProperty(String n, int p) {
        super(n, p);
        // this.name = n;
        // this.position = p;

        /*
         * Sift through the list of positions for colored properties. Since
         * the elements are matched by their location in the list, use the
         * index of the located position to find the amounts for the different
         * rents and the property's cost.
         */
        int i = 0;
        while (i < 23) {
            if (position == colored_positions[i]) {
                break;
            }
            i++;
        }
        this.cost = colored_costs[i];
        this.base_rent = colored_base_rents[i];
        this.house1_rent = colored_house1_rents[i];
        this.house2_rent = colored_house2_rents[i];
        this.house3_rent = colored_house3_rents[i];
        this.house4_rent = colored_house4_rents[i];
        this.hotel_rent = colored_hotel_rents[i];
    }
    
    @Override
    int calculateRent(Player owner, int diceRoll) {
        int rent = this.base_rent;
        boolean completeSet = false;
        
        if (this.building_level == 0) {
            switch (this.color) {
                case "brown":
                    if (owner.brownAmount == 2)
                        completeSet = true;
                    break;
                case "lightBlue":
                    if (owner.lightBlueAmount == 3)
                        completeSet = true;
                    break;
                case "pink":
                    if (owner.pinkAmount == 3)
                        completeSet = true;
                    break;
                case "orange":
                    if (owner.orangeAmount == 3)
                        completeSet = true;
                    break;
                case "red":
                    if (owner.redAmount == 3)
                        completeSet = true;
                    break;
                case "yellow":
                    if (owner.yellowAmount == 3)
                        completeSet = true;
                    break;
                case "green":
                    if (owner.greenAmount == 3)
                        completeSet = true;
                    break;
                case "darkBlue":
                    if (owner.darkBlueAmount == 2)
                        completeSet = true;
                    break;
            }
            
            if (completeSet == true)
                rent = this.base_rent * 2;
        }
        
        else if (this.building_level == 1) {
            rent = this.house1_rent;
        }
        
        else if (this.building_level == 2) {
            rent = this.house2_rent;
        }
        
        else if (this.building_level == 3) {
            rent = this.house3_rent;
        }
        
        else if (this.building_level == 4) {
            rent = this.house4_rent;
        }
        
        else if (this.building_level == 5) {
            rent = this.hotel_rent;
        }
        
        return rent;
    }
}
