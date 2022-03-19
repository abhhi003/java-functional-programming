/**
 * 
 */
package com.functional.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "[ "+"name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents+" ]";
	}
	
	
}

public class FP04 {
	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 200010),
				new Course("Spring Boot", "Framework", 97, 201000),
				new Course("API", "Microservices", 96, 201000),
				new Course("Microservices", "Microservices", 95, 20000),
				new Course("FullStack", "Fullstack", 94, 20000),
				new Course("AWS", "Cloud", 93, 20000),
				new Course("Azure", "Cloud", 92, 200100),
				new Course("Docker", "Cloud", 91, 210000),
				new Course("Kubernetes", "Cloud", 91, 120000)
				);
		
		System.out.println(
				courses.stream().allMatch(course -> course.getReviewScore() > 90)
				);
		
		System.out.println(
				courses.stream().noneMatch(course -> course.getReviewScore() > 90)
				);
		
		System.out.println(
				courses.stream().anyMatch(course -> course.getReviewScore() > 90)
				);
		
		Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList())
				);
		
		Comparator<Course> comparingByNoOfStudentsDec = Comparator.comparing(Course::getNoOfStudents).reversed();
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsDec).collect(Collectors.toList())
				);
		
		Comparator<Course> comparingByNoOfStudentsAndReviews 
			= Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore)
				.reversed();

		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsAndReviews).collect(Collectors.toList())
				);
		
		//Getting top 5 items
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndReviews)
				.limit(5)
				.collect(Collectors.toList())
				);
		
		//Skip top 3 items
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsAndReviews).skip(3).collect(Collectors.toList()));
		
		//Take items till the given condition is met. Once condition is not met skip all items after that
		System.out.println(
				courses.stream()
				.takeWhile(course -> course.getReviewScore()>=95)
				.collect(Collectors.toList())
				);
		
		//Skip items till the given condition is met. Once condition is not met take all items after that
		System.out.println(
				courses.stream()
				.dropWhile(course -> course.getReviewScore()>=95)
				.collect(Collectors.toList())
				);
				
		//Get Max based on given criteria
		System.out.println(
				courses.stream()
				.max(comparingByNoOfStudentsAndReviews)
				);
				
		//Get Min based on given criteria
		System.out.println(courses.stream().min(comparingByNoOfStudentsAndReviews));
						
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() <= 90)
				.max(comparingByNoOfStudentsAndReviews)
				.orElse(new Course("Kubernetes", "Cloud", 91, 120000))
				);
		
		//Get first match
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.findFirst()
				);
		
		//Get any match
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.findAny()
				);
		
		//Get sum based on given filter condition
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.mapToInt(Course::getNoOfStudents)
				.sum()
				);
		
		//Get average based on given filter condition
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.mapToInt(Course::getNoOfStudents)
				.average()
				);
		
		//Get count based on given filter condition
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.mapToInt(Course::getNoOfStudents)
				.count()
				);
		
		//Get max based on given filter condition
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore() > 90)
				.mapToInt(Course::getNoOfStudents).max());
		
		//Get Map based on category
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory)));
		
		
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		
		
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.mapping(Course::getName, Collectors.toList()))));
		
		
	}

	
}
