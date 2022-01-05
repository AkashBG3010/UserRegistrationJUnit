package com.bridgelabz.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	
	static boolean isFirstNameValid;
	static boolean isLastNameValid;
	
	public boolean validateFirstName(String firstName) {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		
		if(!isFirstNameValid) {
			System.out.println("Entered 'first name' is invalid! Please try again...");
		}
		return Pattern.matches(FIRST_NAME_REGEX,firstName);
	}
	public boolean validateLastName(String lastName) {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX,lastName);
		
		if(!isLastNameValid) {
			System.out.println("Entered 'Last name' is invalid! Please try again...");
		}
		return Pattern.matches(LAST_NAME_REGEX,lastName);
	}
}