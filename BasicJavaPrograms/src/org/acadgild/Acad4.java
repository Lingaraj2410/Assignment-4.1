package org.acadgild;

import java.util.Scanner;

public class Acad4 {

	public static void printOddAndEvenNumbers(int num1, int num2) {		
		
		if (num1 < num2)		
			printNumbers(num1, num2);
		else if (num2 < num1) 
			printNumbers(num2, num1);
		else 
			System.out.println("Both numbers are equal. Please maintain some distance between them!");		
	}
	
	public static void printNumbers (int n1, int n2) {
		if(n1%2==0) {
			System.out.println("All even numbers between " + n1 + " and " + n2 + " are as follows:");
			for(int i=n1+2; i<n2; i+=2) 
				System.out.print(i + " ");
			System.out.println();
			System.out.println("All odd numbers between " + n1 + " and " + n2 + " are as follows:");
			for(int i=n1+1; i<n2; i+=2)
				System.out.print(i + " ");	
		}
		else {
			System.out.println("All odd numbers between " + n1 + " and " + n2 + " are as follows:");
			for(int i=n1+2; i<n2; i+=2) 
				System.out.print(i + " ");
			System.out.println();
			System.out.println("All even numbers between " + n1 + " and " + n2 + " are as follows:");
			for(int i=n1+1; i<n2; i+=2)
				System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		printOddAndEvenNumbers(num1, num2);
	}	
}


