/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */
//Print All Courses individually

public class E02 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.forEach(System.out::println);

	}
}
