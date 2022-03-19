/**
 * 
 */
package com.functional.programming.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Abhishek
 *
 */

//Do Behavior Parameterization for the mapping logic.
//List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());

public class E13 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		//List<Integer> res = mappingFunction(numbers, x -> x*x);
		
		List<Integer> res = mappingFunction(numbers, x -> 2*x);

		
		System.out.println(res);
	}

	/**
	 * @param numbers
	 * @param mapper
	 * @return
	 */
	private static List<Integer> mappingFunction(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mapper) {
		List<Integer> res = numbers.stream()
							.map(mapper)
							.collect(Collectors.toCollection(ArrayList::new));
		return res;
	}
}
