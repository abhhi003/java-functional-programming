/**
 * 
 */
package com.functional.programming;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abhishek
 *
 */
public class FP02 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		int sum = numbers.stream()
					//.reduce(0, (x,y) -> x+y);
					.reduce(0, Integer::sum);
		
		System.out.println(sum);
		
		List<Integer> doubledNumbers = doubleList(numbers);
		System.out.println(doubledNumbers);

	}

	/**
	 * @param numbers
	 * @return list of numbers
	 */
	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
				.map(x -> x*x)
				.collect(Collectors.toList());
	}
}
