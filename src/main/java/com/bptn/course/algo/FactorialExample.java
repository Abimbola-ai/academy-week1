package com.bptn.course.algo;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
	
		//Create an object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        //Initialize the variable to store the result
        int result = 1;

        //Created a loop to initialize, condition and increment
        for (int i = 1; i <= n ; i++) {
      
            result *= i; //Update the value of the result
        }
        System.out.println(result); //print output

        scanner.close(); //close scanner

	}

}
