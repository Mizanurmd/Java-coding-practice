package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class SumMethod {
	public static void main(String[] args) {
		int[]a = {2,3,4,5,20,2,3,4,5};
		int sum =0;
		for(int i =0; i<a.length; i++) {
			sum =sum + a[i];
		}
		System.out.println("Beofore Stream Api total Sum :"+ sum);
		System.out.println("=========using Stream Api ==============");
		
		long totalSum=Arrays.stream(a).sum();
		System.out.println("Total Sum is :"+ totalSum);
	}

}
