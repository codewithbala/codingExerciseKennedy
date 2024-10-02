package com.kabaso.mock.week2;

public class RemovingWhiteSpace {
//Write a program to remove all whitespace from a string.
	public static void main(String[] args) {    
        
        String str="Welcome home son";    
            
        str = str.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str);    
    }    
}    