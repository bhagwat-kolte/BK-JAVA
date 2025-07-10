/**
 * All rights reserved to Bhagwat kolte
 * Created by MACK-WORLD
 * 11-Jul-2025
 * 
 */
package com.amol.basic;

import java.util.Scanner;

/**
 * multiPlication of two numbers
 */
public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		int number1, number2;
		
		System.out.println("Enter a number");
		number1 = sc.nextInt();
		
		System.out.println("Enter another number");
		number2 = sc.nextInt();
		
		sc.close();
		
		System.out.println(number1 * number2);

	}

}
