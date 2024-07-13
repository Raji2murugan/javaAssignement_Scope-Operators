package javaAssignment;

import java.util.Scanner;

/**
 * 1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
 */

public class celsiusToFarenhit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celsius value");
		float celsius = sc.nextFloat();
		float fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Fahrenheit Value is " + fahrenheit);

	}

}
