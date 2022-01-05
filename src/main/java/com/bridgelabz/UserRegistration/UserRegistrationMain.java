package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationMain {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Your First Name: ");
		String firstName = scanner.next();
		
		UserRegistration registration = new UserRegistration();
		registration.validateFirstName(firstName);
	}
}