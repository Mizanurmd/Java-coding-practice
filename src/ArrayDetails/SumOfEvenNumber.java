package ArrayDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		int[]num = {1,2,3,4,5,6,74,8,9,10};
		int sum =0;
		for(int i =0; i<num.length; i++) {
			if(num[i] % 2 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println("Total Sum of Even Number: "+ sum);
		System.out.println("=======Find out sum without for loop================");
		
	int sum2	= Arrays.stream(num).filter(n->n%2 !=0).sum();
		System.out.println("Toatal Sum of odd number: "+ sum2);
	
		//List<String>name =Arrays.asList("Applle","banana", "Apple","Guava","Apple");
		appleCount();
		countStringLength();
	}
	
	
	public static void appleCount() {
	List<String>name1 =Arrays.asList("Apple","banana", "Apple","Guava","Apple");
	long c =	name1.stream().filter(n->n.equals("Apple")).count();
	System.out.println("Apple occurrences total = "+c);
	}
	
	public static void countStringLength() {
		List<String>name1 =Arrays.asList("banana", "Apple","Guava");
		Map<Integer, List<String>>map =	name1.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Lenght and word = "+map);
		}

}
