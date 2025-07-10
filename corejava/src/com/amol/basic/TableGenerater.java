/**
 * All rights reserved to Bhagwat kolte
 * Created by MACK-WORLD
 * 11-Jul-2025
 * 
 */
package com.amol.basic;

import java.util.Scanner;

public class TableGenerater {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		int number1;
		
		System.out.println("Enter a number");
		number1 = sc.nextInt();
		
		sc.close();
		
		System.out.println("table for number" + number1);
		for(int i = 1; i <= 10; i++)
			System.out.println(number1 * i);

	}

}
