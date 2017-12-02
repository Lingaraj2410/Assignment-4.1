package org.acadgild;

import java.util.Scanner;

public class Acad3 {

	public static void sum(int n1, int n2) {		
		int sum = n1 + n2;
		System.out.println("Sum is: " + sum);
	}	
	public static void main(String[] args) {	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("First number is: " + num1);
		System.out.println("Second number is: " + num2);
		sum(num1, num2);
	}	
}


