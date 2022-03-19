/**
 * 
 */
package com.functional.programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Abhishek
 *
 */
public class FP03 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		Function<Integer,Integer> squareMapper = x -> x*x;
		
		Function<Integer,Integer> squareMapper2 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
		};
		
		Consumer<Integer> printAction = System.out::println;
		
		Consumer<Integer> printAction2 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		numbers.stream()
			.filter(isEvenPredicate2)
			.map(squareMapper2)
			.forEach(printAction2);
	}
}
