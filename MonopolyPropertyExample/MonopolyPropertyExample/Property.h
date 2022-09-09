//=================================================================
// Property.h
//=================================================================

#ifndef PROPERTY_H
#define PROPERTY_H

#include <iostream>
using namespace std;

class Property {
public:
	Property(string n, int p);
	~Property();

	void printInfo();	// For debugging

	string name;
	int position;
	char type;		// Colored, Railroads, or Utilities
	int ownership;	// This number represents the id of the player who owns it. The bank has an id of 0
	int cost;
	int building_level;		// Refers to the amount of houses/hotels on the property
	int base_rent;			// Rent without houses/multipliers
	int house1_rent;
	int house2_rent;
	int house3_rent;
	int house4_rent; 
	int hotel_rent;
	bool is_mortgaged;
};

#endif