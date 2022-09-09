//=============================================================
// MonopolyPropertyExample.cpp
//=============================================================
#include "PropertyCreator.h"
#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

void main()
{
	cout << "Creating properties...\n\n";

	PropertyCreator* pc = new PropertyCreator;		// Create an instance of PropertyCreator

	cout << endl;

	// ========= Print the names of the property objects =========
	vector<Property>::iterator it1;					
	for (it1 = pc->all_properties.begin(); it1 != pc->all_properties.end(); ++it1) {
		cout << it1->name << ", ";
	}

	// ========= Show how to access specific properties =========
	cout << "\n\nThe eighth property in the game is: " << pc->all_properties[8].name;

	// ========= Show how to find a specific property with a specific key =========
	string user_command = "";
	while (user_command != "exit") {
		bool is_found = false;
		cout << "\n\nEnter a property's position to find its name.\n";
		cout << "Enter 'exit' to stop the program.\n";
		cin >> user_command;

		if (user_command != "exit") {
			for (int i = 0; i < 28; i++) {
				if (pc->all_properties[i].position == stoi(user_command)) {
					cout << endl << pc->all_properties[i].name << " is at position " << user_command;
					is_found = true;
				}
			}
			if (is_found == false) {
				cout << "\nNo property was found at position " << user_command;
			}
		}
	}
}