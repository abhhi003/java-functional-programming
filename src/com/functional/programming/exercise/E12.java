/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author Abhishek
 *
 */

//Find Functional Interface behind the second argument of reduce method. 
//Create an implementation for the Functional Interface.

public class E12 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		
		BinaryOperator<Integer> sumAccumulator2 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		int res = numbers.stream()
					.reduce(0, sumAccumulator2);
		
		System.out.println(res);
		
	}
}
