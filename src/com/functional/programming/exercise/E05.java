/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */

//Print the cubes of odd numbers

public class E05 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		numbers.stream()
		.filter(number -> number%2 !=0)
		.map(number -> number*number*number)
		.forEach(System.out::println);
	}
}
