package CodingExampStreamApi;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumUsingStream {
	public static void main(String[]args) {
		// Find out the sum of all elements in a list using streams
		System.out.println("====================== Question No : 01 ===================================");
		System.out.println("Find out the sum of all elements in a list using streams");
		
		List<Integer>name = Arrays.asList(5,5,80,10,32,35,15);
		
		int tatalSum=name.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Total sum = "+tatalSum);
		
		// Given a list of integers, write a program to find the maximum element using stream
		System.out.println("====================== Question No : 02 ===================================");
		System.out.println("Given a list of integers, write a program to find the maximum element using stream");

		int max = name.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Maximum number is = "+ max);
		
		System.out.println("====================== Question No : 03 ===================================");
		//Given a list of String, write a program to count the number of strings that start with specific character element using stream
		
		System.out.println("Given a list of String, write a program to count the number of strings that start with specific character element using stream");
		List<String>furits = Arrays.asList("Cherry", "Banana", "Coconut", "Berry", "Cantalopue");
		
		long c = furits.stream().filter(f->f.startsWith("B")).count();
		System.out.println("Specic Character numbers are = "+ c);
		
		System.out.println("====================== Question No : 04 ===================================");
		//Convert a list of String uppercase using stream
		
		System.out.println("Convert a list of String uppercase using stream");
		
		furits.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		
	}

}
