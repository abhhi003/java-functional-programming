/**
 * 
 */
package com.functional.programming.exercise;

import java.util.List;

/**
 * @author Abhishek
 *
 */

//Print Courses Whose Name has atleast 4 letters


public class E04 {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream()
		.filter(course -> course.length() >= 4)
		.forEach(System.out::println);
	}
	
}
