package com.store;


/*

VISITOR becomes USER when registered and authenticated
USER can elect to become a BUYER or SELLER

*/

public enum UserType {

	BUYER,
	SELLER,
	SUPERADMIN,
	USER,
	VISITOR
	
}
