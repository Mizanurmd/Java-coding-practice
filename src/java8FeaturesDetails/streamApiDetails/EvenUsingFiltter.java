package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class EvenUsingFiltter {
	public static void main(String[] args) {
		int[]a = {1,2,3,5,4,8,10,2};
		System.out.println("=========even number here===========");
		Arrays.stream(a).filter(e->e%2==0).forEach(System.out::println);
		System.out.println("=========Odd number here===========");
		Arrays.stream(a).filter(e->e%2!=0).forEach(System.out::println);
	}

}
