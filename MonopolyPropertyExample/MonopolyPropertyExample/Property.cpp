#include "Property.h"

Property::Property(string n, int p) {
	name = n;
	position = p;
	ownership = 0;		// 0 represents the bank
	is_mortgaged = false;
	building_level = 0;		// No buildings on properties by default

	// Set default values at 0 because of Railroads and Utilities
	base_rent = 0;
	house1_rent = 0;
	house2_rent = 0;
	house3_rent = 0;
	house4_rent = 0;
	hotel_rent = 0;

	// Include a list of the positions of all colored properties
	// Each row of the board is organized into a new line
	int colored_positions[22] = { 1, 3, 6, 8, 9,
								11, 13, 14, 16, 18, 19,
								21, 23, 24, 26, 27, 29,
								31, 32, 34, 37, 39 };

	// Include a list of the costs of all colored properties
	// Elements in the same positions are matched with each other
	int colored_costs[22] = { 60, 60, 100, 100, 120,
							140, 140, 160, 180, 180, 200,
							220, 220, 240, 260, 260, 280,
							300, 300, 320, 350, 400 };

	// Include lists of all rents of all colored properties
	int colored_base_rents[22] = { 2, 4, 6, 6, 8,
								 10, 10, 12, 14, 14, 16,
								 18, 18, 20, 22, 22, 24,
								 26, 26, 28, 35, 50 };
	int colored_house1_rents[22] = { 10, 20, 30, 30, 40,
								   50, 50, 60, 70, 70, 80,
								   90, 90, 100, 110, 110, 200,
								   130, 130, 150, 175, 200 };
	int colored_house2_rents[22] = { 30, 60, 90, 90, 100,
								   150, 150, 180, 200, 200, 220,
								   250, 250, 300, 330, 330, 360,
								   390, 390, 450, 500, 600 };
	int colored_house3_rents[22] = { 90, 180, 270, 270, 300,
								   450, 450, 500, 550, 550, 600,
								   700, 700, 750, 800, 800, 850,
								   900, 900, 1000, 1100, 1400 };
	int colored_house4_rents[22] = { 160, 320, 400, 400, 450,
								   625, 625, 700, 750, 750, 800,
								   875, 875, 925, 975, 975, 1025,
								   1100, 1100, 1200, 1300, 1700 };
	int colored_hotel_rents[22] = { 250, 450, 550, 550, 600,
								  750, 750, 900, 950, 950, 1000,
								  1050, 1050, 1100, 1150, 1150, 1200,
								  1275, 1275, 1400, 1500, 2000 };

	// ========= Find the type of the property by using its position =========
	if (position % 5 == 0) {	// Railroads are the only properties divisible by 5
		type = 'r';
		cost = 200;
		base_rent = 25;
	}
	else if ((position == 12) || (position == 28)) {	// Utilities are only located at 12 and 28
		type = 'u';
		cost = 150;
	}
	else {	// Only colored properties fall into this category
		type = 'c';

		/* Sift through the list of positions for colored properties. Since 
		   the elements are matched by their location in the list, use the 
		   index of the located position to find the amounts for the different
		   rents and the property's cost.
		*/
		int i = 0;
		while (i < 23) {
			if (position == colored_positions[i]) {
				break;
			}
			i++;
		}
		cost = colored_costs[i];
		base_rent = colored_base_rents[i];
		house1_rent = colored_house1_rents[i];
		house2_rent = colored_house2_rents[i];
		house3_rent = colored_house3_rents[i];
		house4_rent = colored_house4_rents[i];
		hotel_rent = colored_hotel_rents[i];
	}
}

Property::~Property() {
}

void Property::printInfo() {
	cout << endl << "\tProperty name: " << this->name << endl;
	cout << "\tProperty position: " << this->position << endl;
	cout << "\tProperty cost: " << this->cost << endl;
	cout << "\tProperty base rent: " << this->base_rent << endl;

	// ========= Demonstrate how to find the color of a property =========
	string color = "";
	if (this->type == 'r')
		color = "Railroad";
	else if (this->type == 'u')
		color = "Utility";
	else {
		if (this->position < 5)
			color = "Brown";
		else if (this->position < 10)
			color = "Light Blue";
		else if (this->position < 15)
			color = "Magenta";
		else if (this->position < 20)
			color = "Orange";
		else if (this->position < 25)
			color = "Red";
		else if (this->position < 30)
			color = "Yellow";
		else if (this->position < 35)
			color = "Green";
		else
			color = "Dark Blue";
	}
	cout << "\tProperty type: " << color << endl;
}