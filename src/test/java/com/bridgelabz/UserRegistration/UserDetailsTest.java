package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	 
	@Test
	public void firstName_WhenCorrect_ShouldReturnTrue() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("Rocky");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void firstName_WhenSmall_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("ro");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void firstName_WhenWrong_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateFirstName("rocky");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void LastName_WhenCorrect_ShouldReturnTrue() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("Rocky");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void LastName_WhenSmall_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("ro");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void LastName_WhenWrong_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateLastName("rocky");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void Email_WhenCorrect_ShouldReturnTrue() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail("rocky@gmail.com");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void Email_WhenWrong_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validateEmail(".rocky@gmail.com");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void PhoneNumber_WhenCorrect_ShouldReturnTrue() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePhoneNumber("91 9876543210");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void PhoneNumber_WhenWrong_ShouldReturnFalse() {
		UserRegistration register = new UserRegistration();
		boolean isValid = register.validatePhoneNumber("91 987654321");
		Assert.assertFalse(isValid);
	}
}