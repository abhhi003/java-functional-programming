/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abhishek
 *
 */

//Create a List with Even Numbers Filtered from the Numbers List

public class E10 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		System.out.println(filterEvenList(numbers));
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static List<Integer> filterEvenList(List<Integer> numbers) {
		return numbers.stream()
				.filter(x -> x%2==0)
				.collect(Collectors.toList());
	}
}
