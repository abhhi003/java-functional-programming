/**
 * 
 */
package com.functional.programming;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Abhishek
 *
 */
public class FP03BehaviouralParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		//filterAndPrint(numbers, x -> x%2!=0);
		
		//filterAndPrint(numbers, x -> x%2==0);
		
		filterAndPrint(numbers, x -> x%3==0);
	}

	
	//Passing logic instead of data to a method, hence changing behavior based on parameter. 
	//It is called Behavioural Parameterization
	/**
	 * @param numbers
	 * @param predicate
	 */
	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
}
