package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class CountMethod {
	public static void main(String[] args) {
		int[]a = {2,3,4,5,20};
		System.out.println("Without Stream Api :"+a.length);
		
	long c= Arrays.stream(a).count();
	System.out.println("using Stream API :"+c);
	
		
	}

}
