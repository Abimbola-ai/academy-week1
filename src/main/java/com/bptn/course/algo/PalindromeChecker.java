package com.bptn.course.algo;

import java.util.Scanner;

public class PalindromeChecker {

  public static void main(String[] args) {
	       System.out.print("Enter the string to check for palindrome: ");
	       Scanner scanner = new Scanner(System.in);
	       String input = scanner.nextLine();
	       String reverseInput = "";
	       

	       // Fill in the code below to reverse the input string and store it in the reverseInput variable
	       for (int i = 0; i < input.length(); i++) {
	    	
	    	   reverseInput = input.charAt(i) + reverseInput;
	       }

	       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
	     
	       //Check if input string is equal to reverse string and print output.
	       if (input.equals(reverseInput)) {
	    	   System.out.println("Input string is palindrome");
	       }else {
	    	   System.out.println("Input string is not palindrome");
	       }
	       

	      scanner.close(); 
	   }
}

