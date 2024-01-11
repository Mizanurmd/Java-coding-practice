package java8FeaturesDetails.streamApiDetails;

import java.util.Arrays;

public class MaxMinMethod {
public static void main(String[] args) {
	int[]a = {1,2,3,5,40,8,10,2};
	
	int max= Arrays.stream(a).max().getAsInt();
	
	System.out.println(max);
	int min= Arrays.stream(a).min().getAsInt();
	System.out.println(min);
	
	
	
}
}
