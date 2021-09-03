package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * User Registration Problem with regex operations.
 */
public class UserRegistration {
	// constant
	public static boolean result = false;
	private static final Scanner sc = new Scanner(System.in);
	// Regex Patterns
	private static final String FIRST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,}$";
	private static final String EMAIL_ADDRESS = "^[a-z][a-zA-Z0-9]+([._+#-][a-zA-Z0-9]+)*@[a-zA-Z0-93]+.[a-zA-Z]{2,3}(.[a-zA-Z]{2,3})?$";
	private static final String MOBILE_FORMAT = "^[1-9]{2}\\s[1-9][0-9]{9}$";
	private static final String PASSWORD = "[A-Z{1,}0-9a-z]{8,}$";

	/**
	 * method for producing the Result in terms of Valid or Invalid
	 */
	public void printingResult() {
		if (result) {
			System.out.println("You Entered result is Proper and Valid");
		} else {
			System.out.println("You Entered result is Invalid. Try again.");
		}
	}

	/**
	 * method for First Name Validation Rule: first name starts with Cap and has
	 * minimum 3 characters
	 *
	 */
	private void firstNameValidation() {
		System.out.println("Enter the First Name");
		String firstName = sc.nextLine();
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		result = pattern.matcher(firstName).matches();
		printingResult();
	}

	/**
	 * method for First Name Validation Rule: first name starts with Cap and has
	 * minimum 3 characters
	 *
	 */
	private void lastNameValidation() {
		System.out.println("Enter the Last Name");
		String lastName = sc.nextLine();
		Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
		result = pattern.matcher(lastName).matches();
		printingResult();
	}

	/**
	 * method for EmailAddress Validation
	 */
	private void eMailAddressValidation() {
		System.out.println("Enter the Your Email Address");
		String eMailAddress = sc.nextLine();
		// Matching the given Email Address with regular expression
		Pattern pattern = Pattern.compile(EMAIL_ADDRESS);
		result = pattern.matcher(eMailAddress).matches();
		printingResult();
	}

	/**
	 * method for Mobile Number Validation
	 */
	private void mobileNumberValidation() {
		System.out.println("Enter the Mobile Number");
		String mobileNumber = sc.nextLine();
		// Matching the given PhoneNumber with regular expression
		Pattern pattern = Pattern.compile(MOBILE_FORMAT);
		result = pattern.matcher(mobileNumber).matches();
		printingResult();
	}

	/**
	 * method for Validating Password.
	 *  Rule1: minimum 8 Characters
	 */
	private void passwordValidation() {
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		// Matching the given password with regular expression
		Pattern pattern = Pattern.compile(PASSWORD);
		result = pattern.matcher(password).matches();
		printingResult();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameValidation();
		userRegistration.lastNameValidation();
		userRegistration.eMailAddressValidation();
		userRegistration.mobileNumberValidation();
		userRegistration.passwordValidation();
	}
}
