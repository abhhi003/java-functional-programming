/**
 * 
 */
package com.functional.programming;

import java.util.List;

/**
 * @author Abhishek
 *
 */
public class FP01 {
	public static void main(String[] args) {
		printAllNumbers(List.of(1,2,3,4,5,6,7,8,9));
		printSquareOfNumbers(List.of(1,2,3,4,5,6,7,8,9));
	}

	/**
	 * @param of
	 */
	private static void printAllNumbers(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::println);
	}
	
	private static void printSquareOfNumbers(List<Integer> numbers) {
		numbers.stream()
		.map(x -> x*x)
		.forEach(System.out::println);
	}
	
	
}
