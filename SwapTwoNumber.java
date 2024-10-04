package com.kabaso.mock.week2.task4;

public class SwapTwoNumber {
	// Write a program to swap two numbers without using a third variable.
	public static void main(String a[]) {
		int x = 7;
		int y = 2;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x + ", y = " + y);
	}
}
