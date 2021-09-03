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
     *  method for First Name Validation
     * Rule: first name starts with Cap and has minimum 3 characters
     *
     */
    private void lastNameValidation () {
        System.out.println("Enter the Last Name");
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        result = pattern.matcher(lastName).matches();
        printingResult();
    }
	

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.firstNameValidation();
		 userRegistration.lastNameValidation();
	}
}
