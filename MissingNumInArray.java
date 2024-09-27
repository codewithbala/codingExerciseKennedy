package com.kabaso.mock;

import java.util.Scanner;

public class MissingNumInArray {
//Write a program to find the missing number in an array of 1 to n
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		
		int inpuArray[] = new int[n];
		System.out.println("Enter (n-1) numbers: ");
		for (int i = 0; i <= n - 2; i++) {
			inpuArray[i] = sc.nextInt();
		}
		
		// Finding the missing number formula
		int sumOfAll = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i <= n - 2; i++) {
			sumOfArray = sumOfArray + inpuArray[i];
		}
		int missingNumber = sumOfAll - sumOfArray;
		System.out.println("Missing number is: " + missingNumber);
	}
}