package org.acadgild;

/* This program demonstrates the use of method overloading.
It is the process of defining two or more methods having
same name but with different signature i.e. number of arguments, 
type of arguments or the return type in each method.
*/

public class Acad6 {

	// sum() method that takes two arguments of type 'int' and return the sum
	public int sum(int n1, int n2) {		
		return n1 + n2;	
	}
	// sum() method that takes three arguments of type 'int' and return the sum
	public int sum(int n1, int n2, int n3) {		
		return n1 + n2 + n3;
	}
	// sum() method that takes two arguments  of type 'double' and return the sum
	public double sum(double n1, double n2) {		
		return n1 + n2;
	}
	
	public static void main(String[] args) {	
		
		Acad6 a = new Acad6();	
		System.out.println("Sum of two integer typed numbers: " + a.sum(565, 63));
		System.out.println("Sum of three integer typed numbers: " + a.sum(38, 46, 21));
		System.out.println("Sum of two double typed numbers: " + a.sum(75.6, 43.2));
	}	
}


