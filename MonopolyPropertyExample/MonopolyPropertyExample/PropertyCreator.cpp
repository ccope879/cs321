//=================================================================
// PropertyCreator.cpp
//=================================================================
#include "PropertyCreator.h"
#include <iostream>
#include "Property.h"

//using namespace std;

//---------------------------------
// Class constructor
//---------------------------------
PropertyCreator::PropertyCreator() {

	// ========= Create list of all property names =========
	string all_prop_names[28] = {
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
		"Electric Company", "Water Works"};


	int all_prop_positions[28] = {
		// List positions of each corresponding property name
		// The first name in all_prop_names will be matched with first position in all_prop_positions
		1, 3, 6, 8, 9, 11, 13, 14, 16, 18, 19, 21, 23, 24, 26, 27, 29, 31, 32, 34, 37, 39,
		5, 15, 25, 35,
		12, 28};

	// ========= Create the properties and put them into a list =========
	for (int j = 0; j < (28); j++) {
		Property* property = new Property(all_prop_names[j], all_prop_positions[j]);
		property->printInfo();
		all_properties.push_back(*property);
	}
}

//---------------------------------
// Class destructor
//---------------------------------
PropertyCreator::~PropertyCreator() {
}
