package javaAssignment;

import java.util.Scanner;

/**
 * 2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
 */

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double formula = b * b - 4 * a * c;
        double D= Math.sqrt(formula);
        double r=2*a;
        
        if(D>0)
        {
            System.out.println("Roots are real and unequal");
            double root1=(D-b)/r;
            double root2=(-D-b)/r;
            System.out.println("Roots are..");
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(D==0)
        {
            System.out.println("The roots of the quadratic equation are real and equal.");
            double root=(-b)/r;
            System.out.println("Root is "+root);
        }
        else
        {
            System.out.println("The roots of the quadratic equation are complex and different");
            System.out.println("Roots are ");
            System.out.println((-b/r)+" +i" + D);
            System.out.println((-b/r)+" -i" + D);
        }


	}

}
