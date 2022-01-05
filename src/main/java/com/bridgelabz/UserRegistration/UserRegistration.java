package com.bridgelabz.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	
	static boolean isFirstNameValid;
	
	public boolean validateFirstName(String firstName) {
		
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		
		if(!isFirstNameValid) {
			System.out.println("Entered 'first name' is invalid! Please try again...");
		}
		return Pattern.matches(FIRST_NAME_REGEX,firstName);
	}
}