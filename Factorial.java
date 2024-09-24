package com.kabaso.mock;

public class Factorial {
	// Write a program to find the factorial of a number.
	public static void main(String args[]) {
		int facNum = 1;
		int num = 8;
		for (int i = 1; i <= num; i++) {
			facNum = facNum * i;
		}
		System.out.println("The facorial Numorial of " + num + " is: " + facNum);
	}
}