package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class SortingMethod {
	public static void main(String[] args) {
		int[]a = {2,3,4,5,20,2,3,4,5};
		Arrays.sort(a);
		System.out.println("Before Stream API Sorting Arrays ="+ Arrays.toString(a));
		System.out.println("===========Stream Api==========");
		Arrays.stream(a).sorted().forEach(e->{
			System.out.println(e);
		});
		
		
	}

}
