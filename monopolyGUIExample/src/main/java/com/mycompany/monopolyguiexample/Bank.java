/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monopolyguiexample;

import java.util.ArrayList;

/**
 *
 * @author Caleb Cope
 */
public class Bank {
    // This array holds every instance of Property that comes from createProperties()
    //Property[] all_properties = new Property[28];
    ArrayList<Property> all_properties = new ArrayList<Property>();
    
    Bank() {
        all_properties = createProperties();
    }

    ArrayList<Property> createProperties() {
    //Property[] createProperties() {
        // ========= Create list of all property names =========
        String[] all_prop_names = new String[] {
            // List names of colored properties in order
            "Mediterranean Avenue", "Baltic Avenue",
            "Oriental Avenue", "Vermont Avenue", "Connecticut Avenue",
            "St. Charles Place", "States Avenue", "Virginia Avenue",
            "St. James Place", "Tennessee Avenue", "New York Avenue",
            "Kentucky Avenue", "Indiana Avenue", "Illinois Avenue",
            "Atlantic Avenue", "Ventnor Avenue", "Marvin Gardens",
            "Pacific Avenue", "North Carolina Avenue", "Pennsylvania Avenue",
            "Park Place", "Boardwalk",
            // List names of railroads in order
            "Reading Railroad", "Pennsylvania Railroad", "B. & O. Railroad", "Short Line",
            // List names of utilities in order
            "Electric Company", "Water Works" };

        int[] all_prop_positions = new int[] {
            // List positions of each corresponding property name
            // The first name in all_prop_names will be matched with first position in
            // all_prop_positions
            1, 3, 6, 8, 9, 11, 13, 14, 16, 18, 19, 21, 23, 24, 26, 27, 29, 31, 32, 34, 37, 39,
            5, 15, 25, 35,
            12, 28 };

        // ========= Create the properties and put them into a list =========
        for (int j = 0; j < (28); j++) {
            Property property;
            
            if (all_prop_positions[j] % 5 == 0) {
                property = new RailroadProperty(all_prop_names[j], all_prop_positions[j]);
            }
            else if ((all_prop_positions[j] == 12) || (all_prop_positions[j] == 28)) {
                property = new UtilityProperty(all_prop_names[j], all_prop_positions[j]);
            }
            else {
                property = new ColoredProperty(all_prop_names[j], all_prop_positions[j]);
            }
            //property.printInfo();
            //this.all_properties[j] = property;
            this.all_properties.add(property);
        }
        return this.all_properties;
    }
}
