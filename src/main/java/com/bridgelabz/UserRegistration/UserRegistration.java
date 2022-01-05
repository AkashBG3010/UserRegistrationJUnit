package com.bridgelabz.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[ ]{1}[0-9]{10}";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	
	static boolean isFirstNameValid;
	static boolean isLastNameValid;
	static boolean isEmailValid;
	static boolean isPhoneNumberValid;
	static boolean isPasswordValid;
	
	
	public boolean validateFirstName(String firstName) {
		isFirstNameValid = Pattern.matches(FIRST_NAME_REGEX,firstName);
		
		if(!isFirstNameValid) {
			System.out.println("Entered 'first name' is invalid! Please try again...");
		}
		return Pattern.matches(FIRST_NAME_REGEX,firstName);
	}
	
	public boolean validateLastName(String lastName) {
		isLastNameValid = Pattern.matches(LAST_NAME_REGEX,lastName);
		
		if(!isLastNameValid) {
			System.out.println("Entered 'Last name' is invalid! Please try again...");
		}
		return Pattern.matches(LAST_NAME_REGEX,lastName);
	}
	
	public boolean validateEmail(String email) {
		isEmailValid = Pattern.matches(EMAIL_REGEX,email);
		
		if(!isEmailValid) {
			System.out.println("Entered 'Email' is invalid! Please try again...");
		}
		return Pattern.matches(EMAIL_REGEX,email);
	}
	
	public boolean validatePhoneNumber(String phoneNumber) {
		isPhoneNumberValid = Pattern.matches(PHONE_NUMBER_REGEX,phoneNumber);
		
		if(!isPhoneNumberValid) {
			System.out.println("Entered 'PhoneNumber' is invalid! Please try again...");
		}
		return Pattern.matches(PHONE_NUMBER_REGEX,phoneNumber);
	}
	
	public boolean validatePassword(String password) {
		isPasswordValid = Pattern.matches(PASSWORD_REGEX,password);
		
		if(!isPasswordValid) {
			System.out.println("Entered 'Password' is invalid! Please try again...");
		}
		return Pattern.matches(PASSWORD_REGEX,password);
	}
}