package CodingExam;

import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	public static void main(String[]args) {
		List<Integer> elements = Arrays.asList(10,20,50,80,10,7,17,23,50,100,50,20,60,80);
		Long count = elements.stream().count();
		System.out.println(count);
		System.out.println("==========Using stream function for sorting list ==================");
		elements.stream().sorted().forEach(System.out::println);
		
		///////// using filter method /////////
		System.out.println("========== Olny even number print here ======================");
		elements.stream().filter(n -> n%2==0).forEach(System.out::println);
		System.out.println("========== Olny odd number print here ======================");
		elements.stream().filter(n -> n %2 != 0).forEach(System.out::println);
		
		System.out.println(elements);
		List<Integer>result = elements.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Duplicate value are deleted from Array = "+ result);
	}

}
