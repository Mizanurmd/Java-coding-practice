package CodingExampStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumUsingStream {
	public static void main(String[] args) {
		// Find out the sum of all elements in a list using streams
		System.out.println("====================== Question No : 01 ===================================");
		System.out.println("Find out the sum of all elements in a list using streams");

		List<Integer> name = Arrays.asList(5, 5, 80, 10, 32, 35, 15);

		int tatalSum = name.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total sum = " + tatalSum);

		// Given a list of integers, write a program to find the maximum element using
		// stream
		System.out.println("====================== Question No : 02 ===================================");
		System.out.println("Given a list of integers, write a program to find the maximum element using stream");

		int max = name.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum number is = " + max);

		System.out.println("====================== Question No : 03 ===================================");
		// Given a list of String, write a program to count the number of strings that
		// start with specific character element using stream

		System.out.println(
				"Given a list of String, write a program to count the number of strings that start with specific character element using stream");
		List<String> furits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Cantalopue");

		long c = furits.stream().filter(f -> f.startsWith("B")).count();
		System.out.println("Specic Character numbers are = " + c);

		System.out.println("====================== Question No : 04 ===================================");
		// Convert a list of String uppercase using stream

		System.out.println("Convert a list of String uppercase using stream");

		furits.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("====================== Question No : 05 ===================================");
		// Given a list of integers write a program to filter out the even number using
		// stream

		System.out.println("Given a list of integers write a program to filter out the even number using stream");
		List<Integer> filter = name.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		Long count = name.stream().filter(num -> num % 2 == 0).count();
		System.out.println("Even numbers are = " + filter);
		System.out.println("Toatal Even number = " + count);

		System.out.println("====================== Question No : 06 ===================================");
		// Given a list of integers write a program to filter out the old number using
		// stream

		System.out.println("Given a list of integers write a program to filter out the old number using stream");
		List<Integer> filter2 = name.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		Long count2 = name.stream().filter(num -> num % 2 != 0).count();
		System.out.println("Old numbers are = " + filter2);
		System.out.println("Toatal Old number = " + count2);

		System.out.println("====================== Question No : 07 ===================================");
		// Given a list of integers write a program to filter out average using stream
		System.out.println("Given a list of integers write a program to filter out average using stream");
		List<Double> name2 = Arrays.asList(5.0, 10.5, 80.5, 11.5, 32.5, 35.5, 15.2);
		Double d = name2.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println("Average of numbers are= " + d);

		System.out.println("====================== Question No : 08 ===================================");
		// Given a list of String write a program to concatenate all String using stream
		System.out.println("Given a list of String write a program to concatenate all String using stream");
		String concatenate = furits.stream().collect(Collectors.joining(", "));
		System.out.println("String concatenate = " + concatenate);
		
		System.out.println("====================== Question No : 09 ===================================");
		// Write a program to remove duplicate elements for list using stream
		System.out.println(" Write a program to remove duplicate elements for list using stream");
		name.stream().distinct().forEach(System.out::println);
		

	}

}
