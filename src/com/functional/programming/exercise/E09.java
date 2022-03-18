/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */

//Find Sum of Odd Numbers in a list

public class E09 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		int res = numbers.stream()
					.filter(x -> x%2!=0)
					.reduce(0, Integer::sum);
		
		System.out.println(res);
	}
}
