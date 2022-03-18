/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */
//Print Only Odd Numbers from the List


public class E01 {
	public static void main(String[] args) {
		printOddNumbers(List.of(1,2,3,4,5,6,7,8,9));
	}

	/**
	 * @param of
	 */
	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2!=0)
		.forEach(System.out::println);
	}
}
