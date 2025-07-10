/**
 * All rights reserved to Bhagwat kolte
 * Created by MACK-WORLD
 * 11-Jul-2025
 * 
 */
package com.amol.basic;

import java.util.Scanner;

public class ArithmaticOperationsOfTwoNumbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
		
		int number1, number2;
		
		System.out.println("Enter a number");
		number1 = sc.nextInt();
		
		System.out.println("Enter another number");
		number2 = sc.nextInt();
		
		sc.close();
		
		System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
		
		System.out.println("Substraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
		
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
		
		System.out.println("Division of " + number1 + " and " + number2 + " is " + (number1 / number2));
		
		System.out.println("Mod result of " + number1 + " and " + number2 + " is " + (number1 % number2));

	}

}
