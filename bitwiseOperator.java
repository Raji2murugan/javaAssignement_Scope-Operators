package javaAssignment;

import java.util.Scanner;

/*
 * 3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
 */

public class bitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int add = num1 & num2;
		System.out.println("Bitwise AND: " + add);

		int or = num1 | num2;
		System.out.println("Bitwise OR: " + or);

		int xor = num1 ^ num2;
		System.out.println("Bitwise XOR: " + xor);

		int leftShift = num1 << num2;
		System.out.println("Left Shift (" + num1 + " <<  " + num2 + "): " + leftShift);

		int rightShift = num1 >> num2;
		System.out.println("Right Shift (" + num1 + " >> " + num2 + "): " + rightShift);

		int unsignedRightShift = num1 >> num2;
		System.out.println("Right Shift (" + num1 + " >> " + num2 + "): " + unsignedRightShift);

	}

}
