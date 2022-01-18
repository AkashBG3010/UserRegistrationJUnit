package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.UserRegistration.DetailsException.EmailException;
import com.bridgelabz.UserRegistration.DetailsException.FirstNameException;
import com.bridgelabz.UserRegistration.DetailsException.LastNameException;
import com.bridgelabz.UserRegistration.DetailsException.PasswordException;
import com.bridgelabz.UserRegistration.DetailsException.PhoneNumberException;

public class UserDetailsTest {
	 
	@Test
	public void firstName_WhenCorrect_ShouldReturnTrue() throws FirstNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("Rocky");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void firstName_WhenSmall_ShouldReturnFalse() throws FirstNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("ro");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void firstName_WhenWrong_ShouldReturnFalse() throws FirstNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("rocky");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void LastName_WhenCorrect_ShouldReturnTrue() throws LastNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("Rocky");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void LastName_WhenSmall_ShouldReturnFalse() throws LastNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("ro");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void LastName_WhenWrong_ShouldReturnFalse() throws LastNameException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("rocky");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void Email_WhenCorrect_ShouldReturnTrue() throws EmailException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail("rocky@gmail.com");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void Email_WhenWrong_ShouldReturnFalse() throws EmailException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail(".rocky@gmail.com");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void Email_WhenWrongA_ShouldReturnFalse() throws EmailException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail("rocky.since..1963@gmail.com");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void PhoneNumber_WhenCorrect_ShouldReturnTrue() throws PhoneNumberException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePhoneNumber("91 9876543210");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void PhoneNumber_WhenWrong_ShouldReturnFalse() throws PhoneNumberException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePhoneNumber("91987654321");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void Password_WhenCorrect_ShouldReturnTrue() throws PasswordException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePassword("A123@45z");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void Password_WhenWrong_ShouldReturnFalse()  throws PasswordException {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePassword("123@a");
		Assert.assertFalse(isValid);
	}
}