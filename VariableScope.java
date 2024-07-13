package javaAssignment;

/*
 * 4. Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
 */

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int outer = 10;

		System.out.println("Outside variable before if block: " + outer);

		if (outer > 5) {
			int inner = 20;

			System.out.println("Outside variable inside if block: " + outer);
			System.out.println("Inside variable inside if block: " + inner);
		}

		System.out.println("Outside variable after if block: " + inner);

	}

}

/**
output:Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 
inner cannot be resolved to a variable

at javaAssignment.VariableScope.main(VariableScope.java:23)
*/

