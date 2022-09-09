//=================================================================
// PropertyCreator.h
//=================================================================
#ifndef PROPERTYCREATOR_H
#define PROPERTYCREATOR_H

#include "Property.h"
#include <iostream>

using namespace std;
#include <vector>

class PropertyCreator
{
public:
	PropertyCreator();		// Class constructor
	~PropertyCreator();		// Class destructor

	vector<Property> all_properties;	// This vector holds every instance of Property that comes from PropertyCreator
	string name;		// What is the property's name?
	int position;		// Where is this property on the board?
	char type;			// Is the property a colored type, railroad type, or utility type?
};

#endif