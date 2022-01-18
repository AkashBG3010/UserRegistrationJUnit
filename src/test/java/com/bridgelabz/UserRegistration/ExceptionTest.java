package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.UserRegistration.DetailsException.EmailException;
import com.bridgelabz.UserRegistration.DetailsException.FirstNameException;
import com.bridgelabz.UserRegistration.DetailsException.LastNameException;
import com.bridgelabz.UserRegistration.DetailsException.PasswordException;
import com.bridgelabz.UserRegistration.DetailsException.PhoneNumberException;



public class ExceptionTest {
	@Test
	public void givenFirstName_IsNull_ShouldThrowNullException() throws FirstNameException {
		UserRegistration register = new UserRegistration();
		try {
			register.validateFirstName(null);
		} catch (FirstNameException e) {
			Assert.assertEquals(FirstNameException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowEmptyException() throws FirstNameException{

		UserRegistration register = new UserRegistration();
		try {
			register.validateFirstName("");
		} catch (FirstNameException e) {
			Assert.assertEquals(FirstNameException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenLastName_IsNull_ShouldThrowNullException() throws LastNameException {
		UserRegistration register = new UserRegistration();
		try {
			register.validateLastName(null);
		} catch (LastNameException e) {
			Assert.assertEquals(LastNameException.ExceptionType1.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowEmptyException1() throws LastNameException{

		UserRegistration register = new UserRegistration();
		try {
			register.validateLastName("");
		} catch (LastNameException e) {
			Assert.assertEquals(LastNameException.ExceptionType1.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenEmail_IsNull_ShouldThrowNullException() throws EmailException {
		UserRegistration register = new UserRegistration();
		try {
			register.validateEmail(null);
		} catch (EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType2.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowEmptyException() throws EmailException{

		UserRegistration register = new UserRegistration();
		try {
			register.validateEmail("");
		} catch (EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType2.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenPhoneNumber_IsNull_ShouldThrowNullException() throws PhoneNumberException {
		UserRegistration register = new UserRegistration();
		try {
			register.validatePhoneNumber(null);
		} catch (PhoneNumberException e) {
			Assert.assertEquals(PhoneNumberException.ExceptionType3.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldThrowEmptyException() throws PhoneNumberException{

		UserRegistration register = new UserRegistration();
		try {
			register.validatePhoneNumber("");
		} catch (PhoneNumberException e) {
			Assert.assertEquals(PhoneNumberException.ExceptionType3.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenPassword_IsNull_ShouldThrowNullException() throws PasswordException {
		UserRegistration register = new UserRegistration();
		try {
			register.validatePassword(null);
		} catch (PasswordException e) {
			Assert.assertEquals(PasswordException.ExceptionType4.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldThrowEmptyException() throws PasswordException{

		UserRegistration register = new UserRegistration();
		try {
			register.validatePassword("");
		} catch (PasswordException e) {
			Assert.assertEquals(PasswordException.ExceptionType4.ENTERED_EMPTY, e.type);
		}
	}

}