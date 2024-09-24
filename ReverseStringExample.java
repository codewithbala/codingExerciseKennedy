package com.kabaso.mock;

public class ReverseStringExample {

	public static void main(String[] args) {
		// Write a program to reverse a string.
		String name = "Kennedy";
		// String reverse = "";

		StringBuffer sb = new StringBuffer(name);
		sb.reverse();
		System.out.println(sb);

	}

}
