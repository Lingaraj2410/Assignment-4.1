package org.acadgild;

/* This program demonstrates overloading a method with same return type.
 * We can do this, given the number of arguments differ in each definition
 * of a method with same name. You can't overload a method with same return 
 * type when it has same number of arguments of same type. You may end up 
 * with getting an exception if you try to do that way. 
 * e.g.: Duplicate method sum(int, int) */

public class Acad7 {

	// sum() method that takes two arguments of type 'int' and return the sum
	public int sum(int n1, int n2) {		
		return n1 + n2;	
	}
	// sum() method that takes three arguments of type 'int' and return the sum
	public int sum(int n1, int n2, int n3) {		
		return n1 + n2 + n3;
	}	
	public static void main(String[] args) {		
		Acad7 a = new Acad7();	
		System.out.println("Sum of two integer typed numbers: " + a.sum(83, 74));
		System.out.println("Sum of three integer typed numbers: " + a.sum(154, 96, 246));
	}	
}


