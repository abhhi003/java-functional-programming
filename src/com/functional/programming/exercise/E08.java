/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */

//Cube every number in a list and find the sum of cubes

public class E08 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		int res = numbers.stream()
					.map(x -> x*x*x)
					.reduce(0, Integer::sum);
		
		System.out.println(res);
	}
}
