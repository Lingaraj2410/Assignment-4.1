package org.acadgild;

import java.util.Arrays;
import java.util.Collections;

public class Acad8 {

	public static void main(String[] args) {
		
		String[] input_array = {"MapReduce", "Pig", "Hive", "HBase", "Spark", "Oozie", "Flume", "Sqoop"}; 
		System.out.println("Given array: ");
		for(String element: input_array)
			System.out.println(element);
		Arrays.sort(input_array, Collections.reverseOrder());
		System.out.println();
		System.out.println("Sorted array in descending order: ");
		for(String element: input_array)
			System.out.println(element);		

	}

}
