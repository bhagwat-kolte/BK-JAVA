/**
 * All rights reserved to Bhagwat kolte
 * Created by MACK-WORLD
 * 11-Jul-2025
 * 
 */
package com.amol.basic.maths;

import java.util.Scanner;

/**
 * Implementation of a2 – b2 = (a – b)(a + b)
 */
public class DifferenceOfSquares {

	public static void main(String[] args) {
       Scanner sc = new Scanner( System.in );
		
		double number1, number2;
		
		System.out.println("Enter a number");
		number1 = sc.nextDouble();
		
		System.out.println("Enter another number");
		number2 = sc.nextDouble();
		
		sc.close();
		
		double lhs = (number1 * number1) - (number2 * number2);
		
		double rhs = (number1 - number2) * (number1 + number2);
		
		System.out.println(" a2 – b2 = " + lhs);
		
		System.out.println(" a2 – b2 = " + Math.round(lhs));
		
		System.out.println(" (a – b)(a + b) = " + rhs);
		
		System.out.println(" (a – b)(a + b) = " + Math.round(rhs));

	}

}
