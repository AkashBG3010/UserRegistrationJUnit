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
}