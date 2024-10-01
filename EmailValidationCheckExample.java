package com.kabaso.mock.week2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationCheckExample {
	// Write a program to check if a string is a valid email address
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Enter your email id: ");
		String phone = sc.next();

		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(phone);

		if (matcher.matches()) {
			System.out.println("Entered email id is valid");
		} else {
			System.out.println("Entered email id is not valid");
		}
	}
}