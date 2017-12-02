package org.acadgild;

import java.util.Scanner;

public class Acad5 {

	public static void main(String[] args) {	
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		System.out.println("Here is the table of " + num +":");
		for(int i=1;i<=10;i++)
			System.out.println(num + " * " + i + " = " + num * i);
	}	
}


