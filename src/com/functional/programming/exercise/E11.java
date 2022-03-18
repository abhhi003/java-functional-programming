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

//Create a List with lengths of all course titles.

public class E11 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		System.out.println(getItemLength(courses));
	}

	/**
	 * @param courses
	 * @return
	 */
	private static List<Integer> getItemLength(List<String> courses) {
		return courses.stream()
				.map(x -> x.length())
				.collect(Collectors.toList());
	}
}
