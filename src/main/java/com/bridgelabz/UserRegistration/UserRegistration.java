package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelabz.UserRegistration.DetailsException.EmailException;
import com.bridgelabz.UserRegistration.DetailsException.FirstNameException;
import com.bridgelabz.UserRegistration.DetailsException.LastNameException;
import com.bridgelabz.UserRegistration.DetailsException.PasswordException;
import com.bridgelabz.UserRegistration.DetailsException.PhoneNumberException;

public class UserRegistration {

	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]{2,})*(?![a-zA-Z0-9.]+)*.(?![a-zA-Z0-9-]{2,}+)*$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[ ]{1}[0-9]{10}";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	
	static boolean isFirstNameValid;
	static boolean isLastNameValid;
	static boolean isEmailValid;
	static boolean isPhoneNumberValid;
	static boolean isPasswordValid;
	
	
	public boolean validateFirstName(String firstName) throws FirstNameException {
		try {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
		}
		if(firstName.length() == 0) {
			throw new FirstNameException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new FirstNameException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isFirstNameValid;
	}
	
	public boolean validateLastName(String lastName)throws LastNameException{
		try {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		if(lastName.length() == 0) {
			throw new LastNameException(ExceptionType1.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new LastNameException(ExceptionType1.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isLastNameValid;
	}
	
	public boolean validateEmail(String mail) throws EmailException {
		try {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
		}
		if(mail.length() == 0) {
			throw new EmailException(ExceptionType2.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new EmailException(ExceptionType2.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isMailValid;
	}
	public boolean validatePhoneNumber(String number) throws PhoneNumberException {
		try {
		boolean isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, number);
		if(!isNumberValid) {
			System.out.println("Phone Number is invalid...Please enter proper phone-number");
		}
		if(number.length() == 0) {
			throw new PhoneNumberException(ExceptionType3.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new PhoneNumberException(ExceptionType3.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isNumberValid;
	}
	public boolean validatePassword(String password) throws PasswordException {
		try {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
		}
		if(password.length() == 0) {
			throw new PasswordException(ExceptionType4.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new PasswordException(ExceptionType4.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isPasswordValid;
	}
}