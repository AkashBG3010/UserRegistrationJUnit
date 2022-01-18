package com.bridgelabz.UserRegistration;

public class DetailsException extends Exception {
	public static class EmailException {
		enum ExceptionType2 {
			ENTERED_NULL,ENTERED_EMPTY;
		}
		ExceptionType2 type;
		public EmailException(ExceptionType2 type,String message) {
			super();
			this.type = type;
		}
	}
	
	public static class FirstNameException {
		enum ExceptionType {
			ENTERED_NULL,ENTERED_EMPTY;
		}
		ExceptionType type;
		public FirstNameException(ExceptionType type,String message) {
			super();
			this.type = type;
		}
	}
	
	public static class LastNameException {
		enum ExceptionType1 {
			ENTERED_NULL,ENTERED_EMPTY;
		}
		ExceptionType1 type;
		public LastNameException(ExceptionType1 type,String message) {
			super();
			this.type = type;
		}
	}
	
	public static class PasswordException {
		enum ExceptionType4 {
			ENTERED_NULL,ENTERED_EMPTY;
		}
		ExceptionType4 type;
		public PasswordException(ExceptionType4 type,String message) {
			super();
			this.type = type;
		}
	}
	public static class PhoneNumberException {
		enum ExceptionType3 {
			ENTERED_NULL,ENTERED_EMPTY;
		}
		ExceptionType3 type;
		public PhoneNumberException(ExceptionType3 type,String message) {
			super();
			this.type = type;
		}
	}
	
}